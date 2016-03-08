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
@Getter 
@Setter
@ToString
public class ChartData {
	String chartType;
	String question;
	Map<String,String> columns;
	Map<String,Integer> rows;
}
