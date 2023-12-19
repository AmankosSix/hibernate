package com.amankos.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("personBean")
public class Person {
    @Value("${person.name}")
    private String name;
    Pet pet;

    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }

    @PostConstruct
    public void init() {
        System.out.println("Class Person: init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Person: destroy method");
    }
}
