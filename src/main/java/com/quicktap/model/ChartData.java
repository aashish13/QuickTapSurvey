/**
 * 
 */
package com.quicktap.model;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.quicktap.analysis.ChartsEnum;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Aashish
 *
 */
@Component
public class ChartData {
	ChartsEnum chartType;
	String question;
	Map columns;
	Map rows;
	public ChartsEnum getChartType() {
		return chartType;
	}
	public void setChartType(ChartsEnum chartType) {
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
