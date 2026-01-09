package com.example.petshop;

import java.util.Date;

public class Dog extends Pet implements Pettable{ //Cat is subset of Pet


    public Dog (String name){
        super(name); //call super class, which is pet
    }
    public Dog(String name, Date birthDate){
        super(name, birthDate);
    }

    @Override //Not necessary
    public String speak() {
        return "bark";
    }

    @Override
    public void pet() {

    }
}
