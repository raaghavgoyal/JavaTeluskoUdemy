package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;
@Component
public class Alien {

    @Value("21")
    private int age;

    //There are 3 type of injections using autowired: 1.field, 2.constructor, 3.setter
    //Field Injection
//    @Autowired
//    @Qualifier("com2")//default bean name is the class name with first character small
    private Computer com;

    //If Autowired with constructor, then it is called constructor injection

    public Alien(){
        System.out.println("Alien Object Created");
    }

//    @ConstructorProperties({"age","lap"})
//    public Alien(int age, Computer com) {
//        this.age = age;
//        this.com = com;
//    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        //System.out.println("Setter called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    //Setter Injection (Preffered)
    @Autowired
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding");
        com.compile();
    }

}
