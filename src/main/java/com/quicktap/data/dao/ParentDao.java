/**
 * 
 */
package com.quicktap.data.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * @author Aashish
 *
 */

public class ParentDao<T, ID extends Serializable> extends HibernateDaoSupport{
    private Class<T> persistentClass;

	public ParentDao() {
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        
    }
    
    public Class<T>  getPersistentClass() {
        return persistentClass;
    }
    public T save(T obj) {
        try {
            Session session = getSessionFactory().openSession();
            session.setFlushMode(FlushMode.AUTO);
            session.save(obj); 
            session.flush();
            session.close();
        } catch (DataAccessException e) {
            logger.error("save entity error", e);	
        }
        return obj;
    }
    
    public T saveOrUpdate(T obj) {
       Session session = getSessionFactory().openSession();
        session.setFlushMode(FlushMode.AUTO);
        session.saveOrUpdate(obj);
        session.flush();
        session.close();
        return obj;
    }
    
    public void delete(T obj) {
         try {
            Session session = getSessionFactory().openSession();
            session.setFlushMode(FlushMode.AUTO);
            session.delete(obj); 
            session.flush();
            session.close();
        } catch (DataAccessException e) {
            logger.error("save entity error", e);	
        }
                
    }

    public void deleteById(ID id) 	{
        delete(getById(id));
    }
    
    public T getById(ID id) {
        return (T) getHibernateTemplate().get(getPersistentClass(), id);
        
    }
    
    public List<T>  getAll() {
        Session session = getSessionFactory().openSession();
        Criteria crit = session.createCriteria(getPersistentClass());
        List<T>  objs = crit.list();
        session.close();
        return objs;
    }   
    
    public List<T>  getWithSQL(String sql) {
        Session session = getSessionFactory().openSession();
        List<T>  objs = session.createQuery(sql).list();
        session.close();
        return objs;
    } 
    
    public List<T> findByCriteria(Criterion... criterion) {
        Criteria crit = getSessionFactory().openSession().createCriteria(getPersistentClass());
        for (Criterion c : criterion) {
            crit.add(c);
        }
        return crit.list();
   }
}