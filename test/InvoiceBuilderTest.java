/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mike-
 */
public class InvoiceBuilderTest {
    
    public InvoiceBuilderTest() {
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
     * Test of addLineItem method, of class InvoiceBuilder.
     */
    @Test
    public void testAddLineItem() {
        System.out.println("addLineItem");
        Money single = null;
        String desc = "";
        int amount = 0;
        InvoiceBuilder instance = new InvoiceBuilder();
        instance.addLineItem(single, desc, amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of build method, of class InvoiceBuilder.
     */
    @Test
    public void testBuild() {
        System.out.println("build");
        InvoiceBuilder instance = new InvoiceBuilder();
        Invoice expResult = null;
        Invoice result = instance.build();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
