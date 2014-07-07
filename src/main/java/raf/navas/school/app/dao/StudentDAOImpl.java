/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package raf.navas.school.app.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;
import raf.navas.school.app.domain.Student;

/**
 *
 * @author rafaeld.navas
 */
public class StudentDAOImpl extends BaseDAOHibernate<Student, Integer> implements StudentDAO{
    
    /*After specifying in a Spring XML configuration with:
    
    <tx:annotation-driven/>  
    <bean id="transactionManager" class="org.springframework.orm.hibernate4.HibernateTransactionManager">
         <property name="sessionFactory" ref="sessionFactory"/>
    </bean>
    
    We have to make this method transactional if we want Spring manages the 
    transactions we need to use Hibernate Query or Criteria instances.
    Otherwise, it will lead to an exception :
        "createQuery is not valid without active transaction"
    */
    @Override
    @Transactional
    public List<Student> findByName(String name) {
        Session session = sessionFactory.getCurrentSession();
        String strQuery = "from Student where name like :name";
        Query query = session.createQuery(strQuery);
        query.setParameter("name", "%" + name + "%");
        //Don't use this approach. HibernateTemplate is deprecated since Spring 3.1.
        //getHibernateTemplate().findByNamedParam(strQuery, "name", "%" + name + "%");
        List<Student> std = query.list();
        return std;
    }

}
