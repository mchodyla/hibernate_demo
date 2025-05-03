package com.matthewgoing;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Alien telusko = new Alien();
        telusko.setAid(101);
        telusko.setAname("Navin");
        telusko.setColor("Green");

        Configuration con = new Configuration();
        con.addAnnotatedClass(com.matthewgoing.Alien.class);
        con.configure();

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        session.persist(telusko);

        transaction.commit();
        
    }
}
