package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Students s1 = new Students();
        s1.setsName("Navin");
        s1.setRollNo(101);
        s1.setsAge(31);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(org.example.Students.class);
        cfg.configure();
        //session factory is very heavy weight, so use it only once in the project
        // to optimize resource utilization
        SessionFactory sf = cfg.buildSessionFactory();
        //for any unit of work we will have a new session
        //create a new session since we do not have any open session presently
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(s1);


        transaction.commit();
        System.out.println(s1);

    }
}