/**
 * 
 */
package com.quicktap.model;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author Aashish
 *
 */
@Component
public class OpenChartData extends ChartData{
	
	private List<String> openText;

	public List<String> getOpenText() {
		return openText;
	}

	public void setOpenText(List<String> openText) {
		this.openText = openText;
	}	
}
