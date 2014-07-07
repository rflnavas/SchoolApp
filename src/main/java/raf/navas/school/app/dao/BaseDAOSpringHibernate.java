/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package raf.navas.school.app.dao;

import java.io.Serializable;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 *
 * @author rafaeld.navas
 * @param <T>
 * @param <E>
 */
public abstract class BaseDAOSpringHibernate<T extends Serializable, E> 
    extends HibernateDaoSupport 
    implements BaseDAO<T , E>{
    /*
    ¿Que es HibernateDaoSupport? 
    Es simplemente una plantilla para crear un DAO que use Hibernate.
    Deprecado desde la versión 3.1
    */
    @Override
    public E save(T t) {
        return (E)getHibernateTemplate().save(t);
    }

    @Override
    public E merge(T t) {
        return (E)getHibernateTemplate().merge(t);
    }

    @Override
    public void delete(T t) {
        getHibernateTemplate().delete(t);
    }
}
