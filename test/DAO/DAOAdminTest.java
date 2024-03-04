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
import pojo.Admin;

/**
 *
 * @author Muhamad Faried
 */
public class DAOAdminTest {
    
    public DAOAdminTest() {
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
     * Test of getbyID method, of class DAOAdmin.
     */
    @Test
    public void testGetbyID() {
        System.out.println("getbyID");
        String username = "user";
        DAOAdmin instance = new DAOAdmin();
        List<Admin> result = instance.getbyID(username);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of retrieveAdmin method, of class DAOAdmin.
     */
    @Test
    public void testRetrieveAdmin() {
        System.out.println("retrieveAdmin");
        DAOAdmin instance = new DAOAdmin();
        List<Admin> result = instance.retrieveAdmin();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of updateAdmin method, of class DAOAdmin.
     */
    @Test
    public void testUpdateAdmin() {
        System.out.println("updateAdmin");
        Admin admin = null;
        DAOAdmin instance = new DAOAdmin();
        instance.updateAdmin(admin);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of validateLogin method, of class DAOAdmin.
     */
    @Test
    public void testValidateLogin() {
        System.out.println("validateLogin");
        String username = "user";
        String password = "123";
        DAOAdmin instance = new DAOAdmin();
        List<Admin> result = instance.validateLogin(username, password);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}