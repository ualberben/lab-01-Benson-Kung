package com.example.petshop;

import java.util.Date;

public class Scorpion extends Pet { //Cat is subset of Pet


    public Scorpion (String name){
        super(name); //call super class, which is pet
    }
    public Scorpion(String name, Date birthDate){
        super(name, birthDate);
    }

    @Override //Not necessary
    public String speak() {
        return "biss";
    }
}
