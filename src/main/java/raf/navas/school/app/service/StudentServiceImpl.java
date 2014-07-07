/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package raf.navas.school.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raf.navas.school.app.dao.StudentDAO;
import raf.navas.school.app.domain.Student;

/**
 *
 * @author rafaeld.navas
 */

/*
    If we want this works we have to make sure if we used Spring component 
    scanning in a Spring XML configuration such as:

    <context:component-scan base-package="raf.navas.school.app.service"/>

    We don't need to specifiy a bean in an Spring XML configuration
    like the following:
    <bean id="studentService" class="fully.qualified.name.class.service">
        <property name="studentDAO" ref="studentDAO">
    </bean>
*/
@Service
public class StudentServiceImpl implements StudentService{
    
    @Autowired
    private StudentDAO studentDAO;
    
    public StudentServiceImpl() {
    }

    @Override
    public List<Student> getStudentsByName(String name) {
        return studentDAO.findByName(name);
    }
    
    
}
