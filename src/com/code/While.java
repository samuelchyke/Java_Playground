package com.code;

public class While {

    public static void main(String[] args) {

        int i = 0;
        while (i <200){
            i++;
        }
        System.out.println(i);

        // Executes do statement at least once before looping
        do{
            System.out.println("w");
        }
        while (i<0);
    }

}
