/**
 * 
 */
package com.quicktap.data.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Aashish
 *
 */
@Repository
public class UserDao implements ParentDao{
	@Autowired
    private SessionFactory sessionFactory;
}
