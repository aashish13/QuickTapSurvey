/**
 * 
 */
package com.quicktap.data.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.neo4j.cypher.internal.compiler.v2_3.ast.rewriters.literalReplacement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quicktap.data.entity.Users;

/**
 * @author Aashish
 *
 */
@Transactional
@Repository
public class UserDao {
	@Autowired
    private SessionFactory sessionFactory;

	/**
	 * @param username
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Users getUserByUserName(String username) {
		Criteria userCriteria=sessionFactory.getCurrentSession().createCriteria(Users.class);
		List<Users> list=(List<Users>) userCriteria.add(Restrictions.eq("username", username)).list();
		return list.isEmpty()?null:list.get(0);
	}
}
