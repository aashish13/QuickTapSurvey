/**
 * 
 */
package com.quicktap.integration.apihelper;

import org.apache.log4j.Logger;

import com.quicktap.integration.apihelper.connect.ConnectionManager;
import com.quicktap.integration.apihelper.connect.ResultCode;
import com.quicktap.integration.apihelper.data.ApiSurveyDO;
import com.quicktap.integration.apihelper.response.GetSurveyDataResponse;
import com.quicktap.integration.apihelper.response.ListSurveysResponse;
import com.quicktap.integration.apihelper.response.LoginResponse;

/**
 * @author Aashish
 *
 */
public class APICall {
	
	final static String endpointUrl = "https://www.quicktapsurvey.com/api-v1/";
	static Logger log;
	static ConnectionManager conn = new ConnectionManager(endpointUrl);

	
	public static ApiSurveyDO[] getSurveyList(String username, String password, String apiKey) {
		//username="aashish";
		//Users user=userService.getUserByUserName(username);
		//String password = "Quicktap123";
		//String apiKey = "LYQUPGV1L09BT488LHKDRLYQ7ZGJNU06";

		LoginResponse loginResponse = conn.login(username, password, apiKey);
		if (loginResponse.getResultCode() == ResultCode.LOGIN_SUCCESS) {
			int pageSize = 50;
			int pageNumber = 1;
			ListSurveysResponse listSurveysResponse = conn.listSurveys(pageSize, pageNumber);
			if (listSurveysResponse.getResultCode() == ResultCode.LIST_SURVEYS_SUCCESS){
				ApiSurveyDO[] surveyList = listSurveysResponse.getSurveyList();
				return surveyList;
			}
		}
		return null;
	}

	/**
	 * @param surveyId
	 * @param username
	 * @param password
	 * @param apiKey
	 * @return
	 */
	public static GetSurveyDataResponse getSurveyResponse(long surveyId, String username, String password,
			String apiKey) {
		GetSurveyDataResponse getSurveyResponse = conn.getSurveyResponses(surveyId, null, null, 1,50);
		return getSurveyResponse;
	}
	
	
}