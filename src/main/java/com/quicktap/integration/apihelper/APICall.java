/**
 * 
 */
package com.quicktap.integration.apihelper;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.quicktap.data.entity.Users;
import com.quicktap.integration.apihelper.connect.ConnectionManager;
import com.quicktap.integration.apihelper.connect.ResultCode;
import com.quicktap.integration.apihelper.data.ApiSurveyDO;
import com.quicktap.integration.apihelper.response.ListSurveysResponse;
import com.quicktap.integration.apihelper.response.LoginResponse;
import com.quicktap.service.UserService;

/**
 * @author Aashish
 *
 */
public class APICall {
	
	final static String endpointUrl = "https://www.quicktapsurvey.com/api-v1/";
	static Logger log;
	
	public static ApiSurveyDO[] getSurveyList(String username, String password, String apiKey) {
		//username="aashish";
		//Users user=userService.getUserByUserName(username);
		//String password = "Quicktap123";
		//String apiKey = "LYQUPGV1L09BT488LHKDRLYQ7ZGJNU06";

		ConnectionManager conn = new ConnectionManager(endpointUrl);
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
}