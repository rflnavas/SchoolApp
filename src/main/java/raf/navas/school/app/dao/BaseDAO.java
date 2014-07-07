/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package raf.navas.school.app.dao;


/**
 *
 * @author rafaeld.navas
 * @param <T>
 * @param <E>
 */
public interface BaseDAO <T, E> {
    E save(T s);
    E merge(T s);
    void delete(T s);
    T findById(Class clazz, Number e);
    
}
