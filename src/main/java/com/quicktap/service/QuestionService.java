/**
 * 
 */
package com.quicktap.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quicktap.Utils;
import com.quicktap.data.dao.QuestionDao;
import com.quicktap.data.entity.ChartsQuestions;
import com.quicktap.data.entity.Questions;
import com.quicktap.data.entity.Surveys;

/**
 * @author Aashish
 *
 */
@Service
public class QuestionService {
	@Autowired
	private QuestionDao questionDao;
	@Autowired
	private SurveyService surveyService;
	@Autowired
	private ChartsService chartService;

	/**
	 * @param question
	 */
	public void save(Questions question) {
		questionDao.save(question);
	}

	/**
	 * @param surveyId
	 * @param questionNo
	 * @return
	 */
	public Questions getByQuestionNumberAndSurveyId(int surveyId, long questionNo) {

		return questionDao.getByQuestionNumberAndSurveyId(surveyId, questionNo);
	}

	public Set<Questions> getQuestionsBySurveyId(int id) {
		Surveys survey = surveyService.getById(id);
		return survey.getQuestionses();
	}

	public Map<Integer, String> getQuestionsForVisualizationDropDown(String chartName, int surveyId) {
		List<Integer> allowedQuestions = getQuestionIds(chartName);
		Map<Integer, String> questions = new HashMap<Integer, String>();
		Set<Questions> questionsAll = surveyService.getById(surveyId).getQuestionses();
		for (Questions question : questionsAll) {
			Integer questionId = Utils.getIdByQuestion(question.getTitle());
			if (allowedQuestions.contains(questionId))
				questions.put(question.getId(), Utils.getOnlyTitle(question.getTitle()));
		}
		// Adding survey as a question type for GeoChart
		if (chartName.equalsIgnoreCase("GeoChart") || chartName.equalsIgnoreCase("Map")) {
			questions = new HashMap<Integer, String>();
			questions.put(surveyId, "Survey");
		}

		return questions;
	}

	private List<Integer> getQuestionIds(String chartName) {
		Set<ChartsQuestions> chartQuestions = chartService.getChartByName(chartName).getChartsQuestionses();
		List<Integer> allowedQuestions = new ArrayList<Integer>();
		for (ChartsQuestions chartsQuestion : chartQuestions) {
			allowedQuestions.add(chartsQuestion.getQuestionTypes().getId());
		}
		return allowedQuestions;
	}

	public Questions getById(int questionId) {
		// TODO Auto-generated method stub
		return questionDao.getById(questionId);
	}

}
