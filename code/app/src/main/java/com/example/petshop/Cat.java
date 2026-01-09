package com.example.petshop;
import java.util.Date;

//Cat have all superclass functions and attributes
public class Cat extends Pet implements Pettable{ //Cat is subset of Pet


    public Cat (String name){
        super(name); //call super class, which is pet
    }
    public Cat(String name, Date birthDate){
        super(name, birthDate);
    }

    @Override //Not necessary
    public String speak() {
        return "meow";
    }

    @Override
    public void pet() {

    }
}
