package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //BeanFactory---- old, ApplicationContext---- new
        //this line creates a container for us
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1 = (Alien) context.getBean("alien1");
        //obj1.setAge(21);
        System.out.println(obj1.getAge());
        obj1.code();
//
//        Alien obj2 = (Alien) context.getBean("alien1");
//        //same value, because of singleton scope in spring (by default) (in xml file)
//        //but if we change it to prototype, it will create a new object every time
//        System.out.println(obj2.age);
//        //obj2.code();

        //creates the object only when we call it (lazy init)
        Desktop obj = (Desktop) context.getBean("com2");
    }
}
