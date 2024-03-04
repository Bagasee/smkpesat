/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Muhamad Faried
 */
public class PendaftaranTest {
    
    public PendaftaranTest() {
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
     * Test of getId method, of class Pendaftaran.
     */
    /**
     * Test of save method, of class Pendaftaran.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Pendaftaran instance = new Pendaftaran();
        String result = instance.save();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of delete method, of class Pendaftaran.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Pendaftaran instance = new Pendaftaran();
        String result = instance.delete();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getbyid method, of class Pendaftaran.
     */

    /**
     * Test of getallrecords method, of class Pendaftaran.
     */
    @Test
    public void testGetallrecords() {
        System.out.println("getallrecords");
        Pendaftaran instance = new Pendaftaran();
        List<Pendaftaran> expResult = null;
        List<Pendaftaran> result = instance.getallrecords();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of update method, of class Pendaftaran.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Pendaftaran instance = new Pendaftaran();
        String result = instance.update();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}