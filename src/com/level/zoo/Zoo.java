package com.level.zoo;

import com.level.zoo.animal.AbstractAnimal;
import com.level.zoo.animal.Animal;
import com.level.zoo.animal.AnimalInitializer;

import java.util.Arrays;
import java.util.Random;
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

    public Zoo(String zooName, int razmerZoo) throws IllegalAccessException, InstantiationException {
        this.zooName = zooName;
        animals = new Animal[razmerZoo];
        this.animalCounter = 0;
        for (int index = 0; index < razmerZoo; index++) {
            animals[index] = createNewAnimal();
        }
    }

    public Zoo(String[] razdelenie) throws IllegalAccessException, InstantiationException {
        this.zooName = razdelenie[0];
        animals = new Animal[razdelenie.length - 1];
        for (int schetchik = 1; schetchik < razdelenie.length; schetchik++) {
            animals[schetchik - 1] = createAnimalFromString(razdelenie[schetchik].split(" "));

        }
    }

    private Animal createAnimalFromString(String[] split) throws InstantiationException, IllegalAccessException {
        int animalIndex = 0;
        switch (split[0]) {
            case "Cat":
                animalIndex = 3;
                break;
            case "Dog":
                animalIndex = 4;
                break;
            case "Elephant":
                animalIndex = 2;
                break;
            case "Tiger":
                animalIndex = 1;
                break;
        }
        Animal animal = AnimalInitializer.getAnimalFromMenu(animalIndex);
        animal.setName(split[1]);
        animal.setAge(Integer.parseInt(split[2]));
        return animal;
    }

    private Animal createNewAnimal() throws InstantiationException, IllegalAccessException {
        Random random = new Random();
        String[] massName = {"Седжуани", "Ренектон", "Гнидали", "Рексай", "Насус"};
        Animal animal = AnimalInitializer.getAnimalFromMenu(random.nextInt(4) + 1);
        animal.setName(massName[random.nextInt(massName.length)]);
        animal.setAge(random.nextInt(animal.getMaxAge()));
        return animal;
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


    private Animal askAnimalInfo(Animal animal) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String name;
        System.out.println("Введите имя шкуры");
        name = scanner.next();
        scanner.nextLine();
        System.out.println("Введите возраст шкуры");
        age = scanner.nextInt();
        while (age < AbstractAnimal.MIN_AGE || age > animal.getMaxAge()) {
            System.out.println("Введите Адекватный возраст");
            age = scanner.nextInt();
        }
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
        if (animalNumber == 0) {
            return true;
        }
        animals[animalNumber- 1].vuvodInfo();
        return false;
    }

    public void createTeemo() {
        Random random = new Random();
        if (random.nextInt(10) == 1) {
            System.out.println("В зоопарке замечено инородное существо");
            Animal[] newAnimalNameArray = new Animal[animals.length + 1];
            System.arraycopy(animals, 0, newAnimalNameArray, 0, animals.length);
            animals = newAnimalNameArray;
            class ChypoTeemo extends AbstractAnimal {

                String[] teetoSay = {"One,two,three,four", "Будет бооольно", "Я научился убивать", "Я умею только убивать"};
                String[] teetoKaka = {"Какулечка тут положу", "Вот тебе грибочек", "я тебе принес личинку зергов"};

                {
                    setName("Teemo");
                    setAge(15);
                }

                @Override
                public String goToToilet() {
                    return teetoKaka[random.nextInt(teetoKaka.length)];
                }

                @Override
                public void say() {
                    System.out.println(teetoSay[random.nextInt(teetoSay.length)]);
                }

                @Override
                public String getAnimalClass() {
                    return "CHUPO TEEMO";
                }

                @Override
                public void kartinkiZhivotnuh() {
                    System.out.println("░░░░░░░░░░░▄▄▄▄░░░░░░░░░░░░░░░░░░░░░░");
                    System.out.println("░░░░░░▄▄██████████▄▄░░░░░░░░░░░░░░░░░");
                    System.out.println("░░░▄█████████████████▄░░░░░░░░░░░░░░░");
                    System.out.println("░░█▀▀██████████████████░░░░░░░░░░░░░░");
                    System.out.println("░█▀░███████████▀▀░░░░░█▀░░░░░░░░░░░░░");
                    System.out.println("██░░░█████▀▀░░░░░░░░▄█▀░░░░░░░░░░░░░░");
                    System.out.println("█░░░▄██▀░░░░▄▄▄░░▄▄█▀░░░░░░▄▄███▄▄░░░");
                    System.out.println("██▄█▀░░░░░░██████▀░░░░░░░░█████████░░");
                    System.out.println("░██░░░░░░▄▄███████░░░░░░░▀▀▀▀▀▀█████░");
                    System.out.println("░░▀███▀▀▀▀░████████░░░░░░░░░░▄▄░░▀█▀░");
                    System.out.println("░░░░░░░░░░░▀████████░░░░░░░░███░░░░░░");
                    System.out.println("░░░░░░░░░░▄░▀██████▀░▀░░░▄░████░░░░▄░");
                    System.out.println("░░░░░░▄░░░░▀▄░▀███▀░█░░░▄█░▀██▀░▄█▀░░");
                    System.out.println("░░░░░░░█░░▄░░█▄▄▀▀░▄█░░▄██▄▄░▄▄██░░░░");
                    System.out.println("░░░░░░░██▄██▄░███░░█████████████░░▄▀░");
                    System.out.println("░░░░░░█████████████████████████████░░");
                    System.out.println("░░░░▀███████████████████████████████▀");

                }

            }
            animals[animals.length - 1] = new ChypoTeemo();
        }


    }
}
