/**
 * 
 */
package com.quicktap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Aashish
 *
 */
@Controller
public class VisualizationController {

	@RequestMapping(value="charts")
	public String showCharts() {
		return "charts";
	}
}
