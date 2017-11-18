package com.level.zoo.animal.impl;

import com.level.zoo.animal.AbstractAnimal;

/**
 * Created by cube on 09.11.2017.
 */
public class Elephant extends AbstractAnimal {
    @Override
    public void say() {
        System.out.println("Ту-тууу!");
    }

    @Override
    public String getAnimalClass() {
        return "Слон";
    }

    @Override
    public void kartinkiZhivotnuh() {
        System.out.println("░░░▄█▀▀▀▀█▄▄░▄▄▄▄█▀▀▀█▄▄░▄█▀▀█▄░░");
        System.out.println("░▄█▀░░░░░░░▀█▀░░░░░░░░░░▀█▄░░░░█▄");
        System.out.println("░█░░░░░░░░░░▀░░░░░░░░░░░░░▀█░░░░█");
        System.out.println("█▀░░░░░░░░░░░░░░██░░░░░░██░░█░░░█");
        System.out.println("█░░░░░░░░░░░░░░█▀██▄░░░█▀██▄█░░░█");
        System.out.println("▀█░░░░░░░░░░░░░█████░░░██████░░▄▀");
        System.out.println("░█░░░░░░░░░░░░░▀████░░░█████▀░▄▀░");
        System.out.println("░░█░░░░░░░░░░░░░░▀▀▀░▀█████▀▄██▄░");
        System.out.println("░░░▀▄░░░░▄█░░░░░░░▄▄░░░░░░▀▀▀░▄▀░");
        System.out.println("░░░░░▀▀█▀▀░░░░░░░░▀▀█▄▄▄▄▄▄▄█▄▄▀░");
        System.out.println("░░░░░░░█▄░░░░░░░░░▀▀▀▀█░░░░░░░░░░");
        System.out.println("░░░░░░░░█▄░░░▄░░░▄░░░░█░░░░░░░░░░");
        System.out.println("░░░░░░░░░▀█▄▄█▄░░█▄█░▄█░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░▀▀▀░░░▀▀░░░░░░░░░░░");

    }

    @Override
    public String goToToilet() {
        return "Лучше не знать....";
    }
}
