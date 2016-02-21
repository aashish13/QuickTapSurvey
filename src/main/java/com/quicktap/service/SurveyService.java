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
import com.quicktap.data.entity.SurveyUserLinks;
import com.quicktap.data.entity.Surveys;
import com.quicktap.data.entity.Users;
import com.quicktap.integration.apihelper.APICall;
import com.quicktap.integration.apihelper.data.ApiSurveyDO;

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
	public Surveys getById(int surveyId) {
		// TODO Auto-generated method stub
		return surveyDao.getById(surveyId);
	}

	/**
	 * @param username
	 */
	public void synchSurveys(String username) {

		Users user = userDao.getUserByUserName(username);
		ApiSurveyDO[] surveys = APICall.getSurveyList(user.getUsername(), user.getPassword(), user.getApiKey());
		for (ApiSurveyDO s : surveys) {
			Surveys survey = getById(s.getSurveyId());
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
}
