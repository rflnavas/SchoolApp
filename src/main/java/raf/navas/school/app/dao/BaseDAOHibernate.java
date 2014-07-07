/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package raf.navas.school.app.dao;

import java.io.Serializable;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author rafaeld.navas
 * @param <T>
 * @param <E>
 */
public abstract class BaseDAOHibernate<T, E> implements BaseDAO<T, E>{
    
    protected SessionFactory sessionFactory;
    
    @Override
    public E save(T s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E merge(T s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(T s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public T findById(Class clazz, Number n) {
        return (T)sessionFactory.getCurrentSession().get(clazz, n);
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
}
