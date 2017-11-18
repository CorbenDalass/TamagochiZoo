package com.level.zoo.animal.impl;

import com.level.zoo.animal.AbstractAnimal;

/**
 * Created by cube on 09.11.2017.
 */
public class Cat extends AbstractAnimal {
    @Override
    public void say() {
        System.out.println("Мяу");
    }

    @Override
    public String getAnimalClass() {
        return "Кошак";
    }

    @Override
    public void kartinkiZhivotnuh() {
        System.out.println("█▄░░░░░░░░░░░░░░░░░░░░░░░░▄▄███");
        System.out.println("███▄░░░░░░░░░░░░░░░░░░░░▄██████");
        System.out.println("█████▄░░░░░░░░░░░░░░░░░▄███████");
        System.out.println("███████▄░░░░▄▄▄▄▄░░░░▄█████████");
        System.out.println("█████████▄▀▀░░░░░▀▀▀▄██████████");
        System.out.println("▀█████▀░░░░░░░░░░░░░░▀████████░");
        System.out.println("░▀██▀░░░░░░░░░░░░░░░░░░░▀████▌░");
        System.out.println("░░██░░░░░░░░░░░░░░░░░░░░░░███░░");
        System.out.println("░░█▀░░░░░░░░░░░░░░░░░░░░░░░██░░");
        System.out.println("░░█░░▄████▄░░░░░▄████▄░░░░░░█░░");
        System.out.println("░░█░░█▐▄█▐█░░░░░█▐▄█▐█░░░░░░█▄░");
        System.out.println("░░█░░██▄▄██░░░░░██▄▄██░░░░░░░█░");
        System.out.println("░▐▌░░░░░░░░░░░░░░░░░░░░░░░░░░▐▌");
        System.out.println("░▐▌░░░░░░░▀▄▄▄▄▀░░░░░░░░░░░░░▐▌");
        System.out.println("░▐▌░░░░░░▄░░▐▌░░▄░░░░░░░░░░░░▐▌");
        System.out.println("░▐▌░░░░░░░▀▀▀▀▀▀░░░░░░░░░░░░░▐▌");
        System.out.println("░░█▄░░░░░░░░░░░░░░░░░░░░░░░░░█▌");
        System.out.println("░░▐█▀▄▄░░░░░░░░░░░░░░░░░░▄▄▀▀░█");
        System.out.println("░▐▌░░░░▀▀▄▄░░░░░░░░▄▄▄▄▀▀░░░░░█");
        System.out.println("░█░░░░░░░░░▀▀▄▄▄▀▀▀░░░░░░░░░░░█");
        System.out.println("▐▌░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
        System.out.println("▐▌░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
    }

}
