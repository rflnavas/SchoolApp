/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package raf.navas.school.app.dao;

import java.util.List;
import raf.navas.school.app.domain.Student;

/**
 *
 * @author rafaeld.navas
 */
public interface StudentDAO extends BaseDAO<Student, Integer>{
    
    List<Student> findByName(String name);
}
