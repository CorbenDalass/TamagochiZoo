package com.level.zoo;

import com.level.zoo.animal.AnimalInitializer;

/**
 * Created by cube on 09.11.2017.
 */
public class MenuStandardComponent {
    public final static String[] CHANGE_ZOO_LENGTH = {
            "Желаете ли увеличить зоопарк?",
            "1. Да",
            "2. Нет"
    };

    public final static String[] ADD_NEW_ANIMAL = new String[AnimalInitializer.getAnimalArraySize() + 1];

    static {
        ADD_NEW_ANIMAL[0] = "Добавте животное";
        for (int i = 1; i < ADD_NEW_ANIMAL.length; i++) {
            ADD_NEW_ANIMAL[i] = i + ". " + AnimalInitializer.getAnimalsName()[i - 1];
        }
    }


    public static void menuWriter(String[] menu) {
        for (String item : menu) {
            System.out.println(item);
        }
    }
}
