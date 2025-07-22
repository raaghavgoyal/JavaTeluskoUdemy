package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Students s1 = new Students();
        s1.setsName("Avni");
        s1.setRollNo(106);
        s1.setsAge(21);

        Students s2 = null;

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(org.example.Students.class);
//        cfg.configure();

        //session factory is very heavy weight, so use it only once in the project
        // to optimize resource utilization
        //SessionFactory sf = cfg.buildSessionFactory();
        //one line solution
        SessionFactory sf = new Configuration()
                            .addAnnotatedClass(org.example.Students.class)
                            .configure()
                            .buildSessionFactory();
        //for any unit of work we will have a new session
        //create a new session since we do not have any open session presently
        Session session = sf.openSession();

        //not required while fetching the data
        //Transaction transaction = session.beginTransaction();

        //session.persist(s1);


        //transaction.commit();
        s2 = session.get(Students.class,102);
        session.close();
        sf.close();
        //System.out.println(s1);
        System.out.println(s2);
    }
}