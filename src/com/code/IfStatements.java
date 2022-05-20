package com.code;

public class IfStatements {

    // psvm is a public static void main(String[] args) short-cut
    public static void main(String[] args) {

        int age = 1;

        //Ternary Operator
        String msg = age < 2 ? "mama" : "papa";


        if (age < 2){
            System.out.println("yay");
        } else if (age > 2){
            System.out.println("Yay");
        }
        else {
            System.out.println("Nay");
        }
        // Gets printed after running if statement
        System.out.println("nay");



    }

}
