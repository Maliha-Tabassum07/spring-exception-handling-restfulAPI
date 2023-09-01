package com.maliha.exceptionhandlingspring.service;

import com.maliha.exceptionhandlingspring.model.Animal;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Objects;

@Service
public class AnimalService {
    List<Animal> animalList=new ArrayList<>();
    @PostConstruct
    public void init(){
        animalList.add(new Animal("Alpaca","a"));
        animalList.add(new Animal("Buffalo","b"));
        animalList.add(new Animal("Cat","c"));
        animalList.add(new Animal("Dog","d"));
        animalList.add(new Animal("Flamingo","f"));
        animalList.add(new Animal("Gorilla","g"));
        animalList.add(new Animal("Kangaroo","k"));
    }
    public String findById(String id) throws InputMismatchException {
        for (Animal a : animalList) {
            if (Objects.equals(a.getId(), id))
                return a.getAnimalName();

        }

       throw new InputMismatchException();
    }

}
