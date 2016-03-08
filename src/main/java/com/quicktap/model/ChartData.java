/**
 * 
 */
package com.quicktap.model;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Aashish
 *
 */

public class ChartData {
	String chartType;
	String question;
	Map<String,String> columns;
	Map<String,Integer> rows;
	public String getChartType() {
		return chartType;
	}
	public void setChartType(String chartType) {
		this.chartType = chartType;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Map<String, String> getColumns() {
		return columns;
	}
	public void setColumns(Map<String, String> columns) {
		this.columns = columns;
	}
	public Map<String, Integer> getRows() {
		return rows;
	}
	public void setRows(Map<String, Integer> rows) {
		this.rows = rows;
	}
	
	
}
