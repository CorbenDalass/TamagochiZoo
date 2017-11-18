package com.level.zoo.animal;

import com.level.zoo.animal.impl.Cat;
import com.level.zoo.animal.impl.Dog;
import com.level.zoo.animal.impl.Elephant;
import com.level.zoo.animal.impl.Tiger;

/**
 * Created by cube on 09.11.2017.
 */
public class AnimalInitializer {

    private static String[] animalsName = new String[2];
    private static Animal[] animalInstances = {
            new Tiger(), new Elephant(), new Cat(), new Dog()
    };
    private static int counter = 0;

    static {
        registrationAnimal();
    }

    private static void registrationAnimal() {
        for (Animal animal : animalInstances) {
            if (counter == animalsName.length) changeAnimalNameArraySize();
            animalsName[counter++] = animal.getAnimalClass();
        }
    }

    // TODO: 09.11.2017 some magic for you, dudes =)
    private static void changeAnimalNameArraySize() {
        String[] newAnimalNameArray = new String[animalsName.length + animalsName.length / 2 + 1];
        System.arraycopy(animalsName, 0, newAnimalNameArray, 0, animalsName.length);
        animalsName = newAnimalNameArray;
    }

    public static int getAnimalArraySize() {
        return counter;
    }

    public static String[] getAnimalsName() {
        return animalsName;
    }

    public static Animal getAnimalFromMenu(int i) throws IllegalAccessException, InstantiationException {
        return animalInstances[i-1].getClass().newInstance();
    }
}
