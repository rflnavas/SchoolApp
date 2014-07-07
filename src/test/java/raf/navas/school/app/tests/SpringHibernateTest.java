/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package raf.navas.school.app.tests;

import java.util.List;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import raf.navas.school.app.dao.StudentDAO;
import raf.navas.school.app.domain.Student;
import raf.navas.school.app.service.StudentService;
import raf.navas.school.app.service.StudentServiceImpl;

/**
 *
 * @author rafaeld.navas
 */


public class SpringHibernateTest {
    
    private ApplicationContext ctx;
    private StudentDAO studentDAO;
    private StudentService studentService;

    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }
   
    public SpringHibernateTest() {
    }
    
    @Before
    public void initializeContext(){
        ctx = new ClassPathXmlApplicationContext("file:src/main/resources/xml/test/testDAOConfiguration.xml");
    }
  
    //@Test
    //Success
     public void testSpringHibernate() {
         //studentDAO = (StudentDAO)ctx.getBean("studentDAO");
         studentService = (StudentServiceImpl) ctx.getBean("studentServiceImpl");
         final String NAME = "ri";
         List<Student> students = studentService.getStudentsByName(NAME);
         
         for (Student student : students) {
             System.out.println(student);
         }
         
         Assert.assertFalse("Couldn't find a student with name : " + NAME, students.isEmpty());
     }
}
