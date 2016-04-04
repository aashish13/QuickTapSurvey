/**
 * 
 */
package com.quicktap.model;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.quicktap.analysis.ChartsEnum;

/**
 * @author Aashish
 *
 */
@Component
public class ChartData {
	String chartType;
	String question;
	Map columns;
	Map rows;
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
	public Map getColumns() {
		return columns;
	}
	public void setColumns(Map columns) {
		this.columns = columns;
	}
	public Map getRows() {
		return rows;
	}
	public void setRows(Map rows) {
		this.rows = rows;
	}
	
	
}
