package com.level.zoo;

import com.level.zoo.animal.Animal;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by cube on 09.11.2017.
 */
public class Zoo {
    private int defaultMaxZooLength = 2;
    private String zooName;
    private Animal[] animals;
    private int animalCounter;

    public Zoo(String zooName) {
        this.zooName = zooName;
        animals = new Animal[defaultMaxZooLength];
        this.animalCounter = 0;
    }

    public Animal[] getAnimals() {
        return this.animals;
    }

    public boolean addAnimal(Animal animal) {
        if (animalCounter == animals.length) {
            if (isNeedCreateBiggerZoo()) {
                animals[animalCounter++] = askAnimalInfo(animal);
                return true;
            }
            return false;
        }
        animals[animalCounter++] = askAnimalInfo(animal);
        return true;
    }



    private Animal askAnimalInfo(Animal animal){
        Scanner scanner = new Scanner(System.in);
        int age;
        String name;
        System.out.println("Введите имя шкуры");
        name=scanner.next();
        scanner.nextLine();
        System.out.println("Введите возраст шкуры");
        age=scanner.nextInt();
        animal.setName(name);
        animal.setAge(age);
        return animal;
    }

    private boolean isNeedCreateBiggerZoo() {
        Scanner scanner = new Scanner(System.in);
        MenuStandardComponent.menuWriter(MenuStandardComponent.CHANGE_ZOO_LENGTH);
        switch (scanner.nextInt()) {
            case 1:
                changeZooArraySize();
                return true;
            case 2:
                return false;
            default:
                return false;
        }
    }

    private void changeZooArraySize() {
        Animal[] newAnimalNameArray = new Animal[animals.length + animals.length / 2 + 1];
        System.arraycopy(animals, 0, newAnimalNameArray, 0, animals.length);
        animals = newAnimalNameArray;
    }


    public String getZooName() {
        return zooName;
    }

    public void setZooName(String zooName) {
        this.zooName = zooName;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "zooName='" + zooName + '\n' +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }

    public boolean showAnimal(int animalNumber) {
        if (animalNumber==0){
            return true;
        }
        animals[animalNumber-1].vuvodInfo();
        return false;
    }
}
