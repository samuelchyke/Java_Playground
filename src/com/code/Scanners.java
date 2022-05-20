package com.code;

import java.time.LocalDate;
import java.util.Scanner;

public class Scanners {

    public static void main(String[] args) {

        //Sets up class to receive user input
        Scanner scanner = new Scanner (System.in);
        System.out.println("What is name?");

        //Saves user input to variable
        String userName = scanner.nextLine();
        System.out.println("Your name is " + userName);

        System.out.println("How old are you");

        int age = scanner.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in " + year+ "!");
    }


}
