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
public class CrossTabulationData {

	private List data;

	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
	}

}
