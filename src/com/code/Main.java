package com.code;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    // Starting point for your program
    public static void main(String[] args){

        //sout is a System.out.println short-cut
        System.out.println("Hello World");

        //Primitive type
        int a = 2_000_000;
        String b = "a";


        // Reference type
        Dog one = new Dog();
        Dog two = new Dog(10, "Spot");


        one.bark();
        String name = " Walakia";
        name.toUpperCase();

        one.setName("WILL");

        System.out.println(one.getName() + " " +two.getName());

        two.setName("William");
        System.out.println(one.getName() + " " +two.getName());


        Date date = new Date();
        LocalDate date2 =  LocalDate.now();
        System.out.println(date2.getDayOfMonth());


    }

}
