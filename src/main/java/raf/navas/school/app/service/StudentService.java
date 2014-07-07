/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package raf.navas.school.app.service;

import java.util.List;
import raf.navas.school.app.domain.Student;

/**
 *
 * @author rafaeld.navas
 */
public interface StudentService {
    
    List<Student> getStudentsByName(String name);
}
