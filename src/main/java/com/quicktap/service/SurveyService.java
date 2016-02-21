/**
 * 
 */
package com.quicktap.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quicktap.Utils;
import com.quicktap.data.dao.SurveyDao;
import com.quicktap.data.dao.UserDao;
import com.quicktap.data.entity.Questions;
import com.quicktap.data.entity.SurveyUserLinks;
import com.quicktap.data.entity.Surveys;
import com.quicktap.data.entity.Users;
import com.quicktap.integration.apihelper.APICall;
import com.quicktap.integration.apihelper.data.ApiSurveyDO;
import com.quicktap.integration.apihelper.data.ApiSurveyElementDO;
import com.quicktap.integration.apihelper.response.GetSurveyDataResponse;

/**
 * @author Aashish
 *
 */
@Service
@Transactional
public class SurveyService {
	@Autowired
	private SurveyDao surveyDao;
	@Autowired
	private UserDao userDao;
	@Autowired
	private QuestionService questionService;
	@Autowired
	private SurveyUserLinkService surveyUserLinkService;

	public int add(Surveys survey) {
		return surveyDao.add(survey);
	}

	/**
	 * @param string
	 * @return
	 */
	public ArrayList getSurveyByUsername(String string) {
		return surveyDao.getSurveyByUsername(string);
	}

	/**
	 * @param surveyId
	 * @return
	 */
	public Surveys getBySurveyId(int surveyId) {
		return surveyDao.getBySurveyId(surveyId);
	}
	

	/**
	 * @param username
	 */
	public void synchSurveys(String username) {

		Users user = userDao.getUserByUserName(username);
		ApiSurveyDO[] surveys = APICall.getSurveyList(user.getUsername(), user.getPassword(), user.getApiKey());
		for (ApiSurveyDO s : surveys) {
			Surveys survey = getBySurveyId(s.getSurveyId());
			SurveyUserLinks surveyUserLink = new SurveyUserLinks();
			if (survey == null) {
				survey = new Surveys();
			}
			survey.setSurveyId(s.getSurveyId());
			survey.setName(s.getSurveyName());
			survey.setTotalResponses(s.getTotalResponses());
			survey.setLastSynchTime(Utils.getTime());
			surveyUserLink.setSurveys(survey);
			surveyUserLink.setUsers(user);
			surveyUserLinkService.save(surveyUserLink);

		}

	}

	/**
	 * @param survey_id
	 * @param username 
	 */
	public void syncResponses(int id, String username) {
		
		Users user = userDao.getUserByUserName(username);
		Surveys survey=getById(id);
		long surveyId=survey.getSurveyId();
		String password=user.getPassword();
		String api_key=user.getApiKey();
		
		//Api call 
		GetSurveyDataResponse getSurveyResponse = APICall.getSurveyResponse(surveyId,username,password,api_key);
		
		//updating questions starts here
		//Set<Questions> questionDB= survey.getQuestionses();
		ApiSurveyElementDO[] questionsApi=getSurveyResponse.getQuestions();
		
		
		//looping on the api questions because there are chances that the user may have added new questions
		for (ApiSurveyElementDO q: questionsApi) {
			long questionNo=q.getQuestionNumber();
			String title=q.getQuestionTitle();
			Questions question=questionService.getByQuestionNumberAndSurveyId(id,questionNo);
			if(question==null)
				question=new Questions();
			
			question.setTitle(title);
			question.setQuestionNo(questionNo);
			question.setSurveys(survey);
			questionService.save(question);
		}
 
		//updating questions ends here
		
		//saving the survey will update all its child.
		
	}

	/**
	 * @param id
	 * @return
	 */
	private Surveys getById(int id) {
		return surveyDao.getById(id);

	}
}
