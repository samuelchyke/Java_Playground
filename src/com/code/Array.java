package com.code;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

    // Array 1
    int [] numbers = new int[2];
    numbers[0] = 9;
    numbers[1] = 3;

    //Loop through an array
    for(int i = 0; i < numbers.length; i++){
        System.out.println(numbers[i]);
    }

    //Enhanced For loop // Cant access index
    for (int number: numbers){
        System.out.println(number);
    }

    //array.fori - for loop shortcut
    for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
    }

    //array.forr for a reverse loop shortcut
    for (int i = numbers.length - 1; i >= 0; i--) {
        if(numbers[i]==0){
            //returns to the loop
            continue;
        }
        System.out.println(numbers[i]);
    }

    //array.for - Enhanced For loop shortcut
    for (int number : numbers) {
        System.out.println(number);
        //exits loop
        break;
    }

    //Loops through array and prints results
    Arrays.stream(numbers).forEach(System.out::println);

    // Array 2
    int [] numbers2 = {2,2,2,2};
    numbers2[2] = 3;
    System.out.println(Arrays.toString(numbers));
    System.out.println(Arrays.toString(numbers2));

    int number = 0;
    number++;
    number--;
    number+=3;
    number-=3;
    number = number + 2;
    number = number - 2;




    }





}
