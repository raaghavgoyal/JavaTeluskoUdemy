package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

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
        l1.setLid(1);
        l1.setBrand("Asus");
        l1.setModel("Rog");
        l1.setRam(16);
        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setBrand("Dell");
        l2.setModel("XPS");
        l2.setRam(16);

        Laptop l3 = new Laptop();
        l3.setLid(3);
        l3.setBrand("Apple");
        l3.setModel("Macbook air");
        l3.setRam(8);

        Aliens a1 = new Aliens();
        a1.setAid(101);
        a1.setAname("Navin");
        a1.setTech("Java");

        Aliens a2 = new Aliens();
        a2.setAid(102);
        a2.setAname("Harsh");
        a2.setTech("Python");

//        Aliens a3 = new Aliens();
//        a3.setAid(103);
//        a3.setAname("Kiran");
//        a3.setTech("AI");

        a1.setLaptops(Arrays.asList(l1,l2));
        a2.setLaptops(Arrays.asList(l3));
        //a3.setLaptops(Arrays.asList(l1));

//        l1.setAliens(Arrays.asList(a1,a3));
//        l2.setAliens(Arrays.asList(a1,a2));
//        l3.setAliens(Arrays.asList(a2));

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Aliens.class)
                .addAnnotatedClass(org.example.Laptop.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        //sequence... because laptop is parent table and alien is child table
        session.persist(l1);
        session.persist(l2);
        session.persist(l3);

        session.persist(a1);
        session.persist(a2);
//        session.persist(a3);

        transaction.commit();


        //System.out.println(a5);

        session.close();
        Session session1 = sf.openSession();

        Aliens a5 = session1.get(Aliens.class, 101);
        //the hibernate does not fire a new select query when we write get in the same
        //session because, hibernate uses CACHE (2 levels l1,l2)
        //by default hibernate has l1 cache
        //but it does fire select query in new session
        //we can also share data in different sessions using l2 cache and libraries
        //like EH cache and caffeine
        //lazy fetch(by default)- does not give collections present in the entity
        //but when we print, we explicitly want complete data
        // so it executes the complete query
        //because there may be huge amount of data which may be a expensive task
        //but we can change this lazy behaviour by specifying fetch type in
        //one to many mapping
        //System.out.println(a5);
        session1.close();

        sf.close();

    }
}