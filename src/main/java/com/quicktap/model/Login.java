/**
 * 
 */
package com.quicktap.model;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Aashish
 *
 */
public class Login {
	@NotEmpty(message="Username can not be empty")
	String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
