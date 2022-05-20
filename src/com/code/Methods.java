package com.code;

public class Methods {

    public static void main(String[] args) {

        char[] letters = { 'A', 'A', 'B', 'C', 'D', 'D', 'D'};

        int count = countL(letters, 'D');

        System.out.println(count);

    }

    public static int countL(
            char[] letters, char searchLetter) {

        int i = 0;

        for (char letter : letters) {
            if(letter == searchLetter){
                i++;
            }
        }

        return i;
    }

}
