/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladormips;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a120185
 */
public class MemoriaTest {
    
    public MemoriaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ler method, of class Memoria.
     */
    @Test
    public void testLer() {
        System.out.println("ler");
        Memoria instance = new Memoria();
        String expResult = "";
        String result = instance.ler();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of escrever method, of class Memoria.
     */
    @Test
    public void testEscrever() {
        System.out.println("escrever");
        String instrucao = "";
        Memoria instance = new Memoria();
        boolean expResult = true;
        boolean result = instance.escrever(instrucao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
