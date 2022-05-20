package com.code;

public class Dog {

    int age;
    String name;

    //Constructors
    Dog(int age, String name){
        // this refers to the current instance of the class
        this.age = age;
        this.name = name;
    }

    Dog(){
    }

    //Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    //Methods
    public void bark(){
        System.out.println("Bork");
    }

}
