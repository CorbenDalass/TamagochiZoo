package com.level.zoo.animal.impl;

import com.level.zoo.animal.AbstractAnimal;

/**
 * Created by cube on 09.11.2017.
 */
public class Dog extends AbstractAnimal {
    {
        maxAge = 21;
    }

    @Override
    public void say() {
        System.out.println("Гав");
    }

    @Override
    public String getAnimalClass() {
        return "Собакен";
    }

    @Override
    public void kartinkiZhivotnuh() {
        System.out.println("░▄▀▄▀▀▀▀▄▀▄░░░░░░░░░");
        System.out.println("░█░░░░░░░░▀▄░░░░░░▄░");
        System.out.println("█░░▀░░▀░░░░░▀▄▄░░█░█");
        System.out.println("█░▄░█▀░▄░░░░░░░▀▀░░█");
        System.out.println("█░░▀▀▀▀░░░░░░░░░░░░█");
        System.out.println("█░░░░░░░░░░░░░░░░░░█");
        System.out.println("█░░░░░░░░░░░░░░░░░░█");
        System.out.println("░█░░▄▄░░▄▄▄▄░░▄▄░░█░");
        System.out.println("░█░▄▀█░▄▀░░█░▄▀█░▄▀░");
        System.out.println("░░▀░░░▀░░░░░▀░░░▀░░░");

    }
}
