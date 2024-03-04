package DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author RHYZONE
 */
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.NewHibernateUtil;
import pojo.Pendaftaran;
 
public class DAOPendaftaran {
    
    public void addPendaftaran(Pendaftaran pendaftaran)
    {
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.save(pendaftaran);
            trans.commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public void deletePendaftaran(Integer id)
    {
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Pendaftaran prod=(Pendaftaran)session.load(Pendaftaran.class, new Integer(id));
            session.delete(prod);
            trans.commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public List<Pendaftaran> getbyID(Integer id)
    {
        List<Pendaftaran> pendaftaran1=new ArrayList();
       
         Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from Pendaftaran where id= :id");
            query.setInteger("id", id);
            pendaftaran1=query.list();
            
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        return pendaftaran1;
    }
    
    public List<Pendaftaran> retrievePendaftaran()
    {
       
        List prod=new ArrayList();
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from Pendaftaran");
            prod=query.list();
         
            trans.commit();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return prod;
    }
    
    public void updatePendaftaran(Pendaftaran pendaftaran)
    {
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.update(pendaftaran);
            trans.commit();
        }
        catch(Exception e)
        {
            
        }   
    }   

}/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */