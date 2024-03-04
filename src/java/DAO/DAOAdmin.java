/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.NewHibernateUtil;
import pojo.Admin;

/**
 *
 * @author ASUS
 */
public class DAOAdmin {
    
    public List<Admin> getbyID(String username)
    {
        List<Admin> admin=new ArrayList();
       
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from admin where username= :username");
            query.setString("username", username);
            admin=query.list();
            
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        return admin;
    }
    
    public List<Admin> retrieveAdmin()
    {
       
        List prod=new ArrayList();
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from Admin");
            prod=query.list();
         
            trans.commit();
            
        }
        catch(Exception e)
        {

        }
        return prod;
    }
    
    public void updateAdmin(Admin admin)
    {
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.update(admin);
            trans.commit();
        }
        catch(Exception e)
        {
            
        }   
    }   
    
    public List<Admin> validateLogin(String username, String password)
    {
        List<Admin> admin1=new ArrayList();
       
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from Admin where username= :username and password= :password");
            query.setString("username", username);
            query.setString("password", password);
            admin1=query.list();
            
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        return admin1;
    }
}