/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package raf.navas.school.app.tests;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rafaeld.navas
 */
public class BasicTest {
    
    public BasicTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void basicStuff() {
        String name1="Rafa";
        String name2="Maria";
        //if !name1.equals(name2) then it throws an AssertionError so
        //both names must be equal to pass the unit test
        //Assert.assertTrue("Names are not equal", name1.equals(name2));
        
        //On the contrary, the test will pass if name1 is not equals to name2
        Assert.assertFalse("Names are equal!!", name1.equals(name2));
      
    }
}
