/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javagittest.junittesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owner
 */
public class HelloTest {
    
    private javagittest.HelloInterface h;
    
    public HelloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         h = new javagittest.Hello();
    }
    
    @After
    public void tearDown() {
        h = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void correctOutput() {
        String result = h.sayHello("Apu");
        assertNotNull(result);
        assertEquals("Hello Apu", result);
                
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void throwExceptionForEmptyArgument() {
        String result = h.sayHello("");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void throwExceptionForNullArgument() {
        String result = h.sayHello(null);
    }
}
