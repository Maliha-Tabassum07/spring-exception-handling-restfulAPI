package com.maliha.exceptionhandlingspring.model;

public class Animal {
    String animalName;
    String id;

    public Animal(String animalName,String id) {
        this.animalName = animalName;
        this.id=id;
    }

    public String getAnimalName() {
        return animalName;
    }
    public String getId() {
        return id;
    }

}
