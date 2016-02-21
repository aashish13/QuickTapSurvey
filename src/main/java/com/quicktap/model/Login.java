/**
 * 
 */
package com.quicktap.model;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Aashish
 *
 */
public class Login {
	@NotEmpty
	String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
