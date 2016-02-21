/*
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, 
INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL QUICKTAPSURVEY OR TABBLEDABBLE INC. BE 
LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, 
TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE 
USE OR OTHER DEALINGS IN THE SOFTWARE. THE SOFTWARE MAY BE USED FOR ANY PURPOSE, 
INCLUDING PAID-SERVICES, WITHOUT ANY ROYALTIES. USE AT YOUR OWN RISK.

Date: July 5, 2015

 */
package com.quicktap.integration.apihelper;

import org.apache.log4j.Logger;

import com.quicktap.integration.apihelper.connect.ConnectionManager;
import com.quicktap.integration.apihelper.connect.ResultCode;
import com.quicktap.integration.apihelper.data.ApiSurveyDO;
import com.quicktap.integration.apihelper.data.ApiSurveyElementDO;
import com.quicktap.integration.apihelper.data.ApiSurveyElementResponseDO;
import com.quicktap.integration.apihelper.data.ApiSurveyResponseDO;
import com.quicktap.integration.apihelper.response.GetSurveyDataResponse;
import com.quicktap.integration.apihelper.response.ListSurveysResponse;
import com.quicktap.integration.apihelper.response.LoginResponse;

/**
 * @author tishanmills
 * 
 */
public class Main {

	final static String endpointUrl = "https://www.quicktapsurvey.com/api-v1/";
	static Logger log;

	public static boolean loginQT(String u, String p, String a) {
		String username = "esha1";
		String password = "Eshasherry1";
		String apiKey = "CN0JRMCZSQMHYGOSA42K20XNGZP4U54I";

		ConnectionManager conn = new ConnectionManager(endpointUrl);
		log = Logger.getLogger(Main.class);

		log.debug("Sending login request.");
		LoginResponse loginResponse = conn.login(username, password, apiKey);
		if (loginResponse.getResultCode() == ResultCode.LOGIN_SUCCESS) {
			return true;
		}

		return false;

	}

	

	public static void main(String[] args) {

		log = Logger.getLogger(Main.class);

		String username = "esha1";
		String password = "Eshasherry1";
		String apiKey = "CN0JRMCZSQMHYGOSA42K20XNGZP4U54I";

		ConnectionManager conn = new ConnectionManager(endpointUrl);

		log.debug("Sending login request.");
		LoginResponse loginResponse = conn.login(username, password, apiKey);
		if (loginResponse.getResultCode() == ResultCode.LOGIN_SUCCESS) {

			int pageSize = 1;
			int pageNumber = 1;
			ListSurveysResponse listSurveysResponse = conn.listSurveys(pageSize, pageNumber);
			if (listSurveysResponse.getResultCode() == ResultCode.LIST_SURVEYS_SUCCESS) {

				ApiSurveyDO[] surveyList = listSurveysResponse.getSurveyList();
				if (surveyList != null && surveyList.length > 0) {
					int surveyId = surveyList[0].getSurveyId();
					log.debug("Fetching data for survey with ID: " + surveyList[0].getSurveyId() + ", name: "
							+ surveyList[0].getSurveyName());
					GetSurveyDataResponse getSurveyResponse = conn.getSurveyResponses(surveyId, null, null, pageNumber,
							pageSize);
					// GETTING QUESTIONS
					ApiSurveyElementDO[] questions = getSurveyResponse.getQuestions();

					if (getSurveyResponse.getResultCode() == ResultCode.GET_SURVEY_RESPONSES_SUCCESS) {
						ApiSurveyResponseDO[] responses = getSurveyResponse.getResponses();
						ApiSurveyElementResponseDO[] r;
						for (ApiSurveyResponseDO res : responses) {
							log.debug("Response username: " + res.getUsername());
							r = res.getResponseValues();

							for (ApiSurveyElementResponseDO s : r) {
								System.out.println(s.getResponseValue());

							}
							// resultDocument.put("questions", responseDetail);

							System.out.println("Done RESPONSES");
						}
					} else {
						log.debug("Getting survey responses failed. Code:" + getSurveyResponse.getResultCode().getId()
								+ ", " + getSurveyResponse.getResultCode().getDescription());
					}
				} else {
					log.debug("Survey list empty.");
				}

			} else {
				log.debug("ListSurveys failed with result code: " + listSurveysResponse.getResultCode().getId() + ", "
						+ listSurveysResponse.getResultCode().getDescription());
			}

		} else {
			log.debug("Login failed with result code: " + loginResponse.getResultCode().getId() + ", "
					+ loginResponse.getResultCode().getDescription());
		}

	}
}