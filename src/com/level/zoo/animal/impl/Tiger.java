package com.level.zoo.animal.impl;

import com.level.zoo.animal.AbstractAnimal;

/**
 * Created by cube on 09.11.2017.
 */
public class Tiger extends AbstractAnimal {

    {
        maxAge = 26;
    }

    @Override
    public void say() {
        System.out.println("РРРРРррр!!!!");
    }

    @Override
    public String getAnimalClass() {
        return "Тигра";
    }

    @Override
    public void kartinkiZhivotnuh() {
        System.out.println("████████████████████████████████████████");
        System.out.println("████████████████████████████████████████");
        System.out.println("█████▀▀▀▀▀█████▀░░░░░░░░░▀█████▀▀▀▀▀████");
        System.out.println("████░▄███▄░█▀░░░░░░░░░░░░░░░▀█░▄███▄░███");
        System.out.println("████░▀████░░░▄░░░░░░░░░░░░░▄░░░████▀░███");
        System.out.println("█████▄░▀▀░░░░░▀▀▀▀▄░░░▄▀▀▀▀░░░░░▀▀░▄████");
        System.out.println("███████▀░░░░█▄▄▄░░▀▄░▄▀░░▄▄▄█░░░░▀██████");
        System.out.println("███████░░░░░▄▀█▀██▄░░░▄██▀█▀▄░░░░░██████");
        System.out.println("███████░░░▄░░█▀▀█▀░░░░░▀█▀▀█░░▄░░░██████");
        System.out.println("███████░░▄░▀▄▄▀▀█░░░░░░░█▀▀▄▄▀░▄░▄██████");
        System.out.println("████████░▀█▄░░▀▄█░░▄▄▄░░█▄▀░░▄█▀░███████");
        System.out.println("█████████▄▄█░░▄▀█░▀░░░▀░█▀▄░░█▄▄████████");
        System.out.println("██████████████░░▀█▄▄▄▄▄█▀░░█████████████");
        System.out.println("██████████████░░░░▀██▀░░░░░█████████████");
        System.out.println("██████████████▄▄▄▄████▄▄▄▄▄█████████████");
        System.out.println("████████████████░░▀▀▀▀▀░▄███████████████");
        System.out.println("█████████████████▄▄░░░▄▄████████████████");
        System.out.println("████████████████████████████████████████");
        System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
    }

}
