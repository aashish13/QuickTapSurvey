/**
 * 
 */
package com.quicktap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.quicktap.data.dao.UserDao;
import com.quicktap.data.entity.Users;

/**
 * @author Aashish
 *
 */
@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	/**
	 * @param username
	 * @return
	 */
	public Users getUserByUserName(String username) {
		return userDao.getUserByUserName(username);
	}

}
