package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

////        Students s1 = new Students();
////        s1.setsName("Anvit");
////        s1.setRollNo(109);
////        s1.setsAge(29);
//
//        //Students s2 = null;
//
////        Configuration cfg = new Configuration();
////        cfg.addAnnotatedClass(org.example.Students.class);
////        cfg.configure();
//
//        //session factory is very heavy weight, so use it only once in the project
//        // to optimize resource utilization
//        //SessionFactory sf = cfg.buildSessionFactory();
//        //one line solution
//        SessionFactory sf = new Configuration()
//                            .addAnnotatedClass(org.example.Students.class)
//                            .configure()
//                            .buildSessionFactory();
//        //for any unit of work we will have a new session
//        //create a new session since we do not have any open session presently
//        Session session = sf.openSession();
//
//        //s1 = session.get(Students.class,109);
//        //update
//        Transaction transaction = session.beginTransaction();
//        //session.merge(s1);
//        //delete
//        //session.remove(s1);
//        transaction.commit();
//
//        //not required while fetching the data
//        //Transaction transaction = session.beginTransaction();
//
//        //session.persist(s1);
//
//
//        //transaction.commit();
//        //s2 = session.get(Students.class,102);
//        session.close();
//        sf.close();
//        //System.out.println(s1);
//        //System.out.println(s1);

//        Alien a1 = new Alien();
//        a1.setAid(101);
//        a1.setAname("Navin");
//        a1.setTech("Java");
//
//        SessionFactory sf = new Configuration()
//                .addAnnotatedClass(org.example.Alien.class)
//                .configure()
//                .buildSessionFactory();
//        Session session = sf.openSession();
//
//        Transaction transaction = session.beginTransaction();
//
//        session.persist(a1);
//
//        transaction.commit();
//        session.close();
//        sf.close();

            Laptop l1 = new Laptop();
            l1.setBrand("Asus");
            l1.setModel("Rog");
            l1.setRam(16);
            Aliens a1 = new Aliens();
            a1.setAid(101);
            a1.setAname("Navin");
            a1.setTech("Java");
            a1.setLaptop(l1);

            SessionFactory sf = new Configuration()
                    .addAnnotatedClass(org.example.Aliens.class)
                    .configure()
                    .buildSessionFactory();
            Session session = sf.openSession();

            Transaction transaction = session.beginTransaction();

            session.persist(a1);

            transaction.commit();

            Aliens a2 = session.get(Aliens.class, 101);
            System.out.println(a2);

            session.close();
            sf.close();

    }
}