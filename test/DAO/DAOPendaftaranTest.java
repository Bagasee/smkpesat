/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Pendaftaran;

/**
 *
 * @author Muhamad Faried
 */
public class DAOPendaftaranTest {
    
    public DAOPendaftaranTest() {
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
     * Test of addPendaftaran method, of class DAOPendaftaran.
     */
    @Test
    public void testAddPendaftaran() {
        System.out.println("addPendaftaran");
        Pendaftaran pendaftaran = null;
        DAOPendaftaran instance = new DAOPendaftaran();
        instance.addPendaftaran(pendaftaran);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of deletePendaftaran method, of class DAOPendaftaran.
     */
    @Test
    public void testDeletePendaftaran() {
        System.out.println("deletePendaftaran");
        Integer id = null;
        DAOPendaftaran instance = new DAOPendaftaran();
        instance.deletePendaftaran(id);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getbyID method, of class DAOPendaftaran.
     */
    @Test
    public void testGetbyID() {
        System.out.println("getbyID");
        Integer id = null;
        DAOPendaftaran instance = new DAOPendaftaran();
        List<Pendaftaran> result = instance.getbyID(id);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of retrievePendaftaran method, of class DAOPendaftaran.
     */
    @Test
    public void testRetrievePendaftaran() {
        System.out.println("retrievePendaftaran");
        DAOPendaftaran instance = new DAOPendaftaran();
        List<Pendaftaran> result = instance.retrievePendaftaran();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of updatePendaftaran method, of class DAOPendaftaran.
     */
    @Test
    public void testUpdatePendaftaran() {
        System.out.println("updatePendaftaran");
        Pendaftaran pendaftaran = null;
        DAOPendaftaran instance = new DAOPendaftaran();
        instance.updatePendaftaran(pendaftaran);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}