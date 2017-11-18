package com.level;

import com.level.zoo.MenuStandardComponent;
import com.level.zoo.Zoo;
import com.level.zoo.animal.AnimalInitializer;
import com.level.zoo.animal.impl.Cat;

import java.util.Scanner;

/**
 * Created by cube on 09.11.2017.
 */
public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        boolean exitFromCreator = false;
        boolean exitFromViewer=false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя зоопарка");
        Zoo zoo = new Zoo(scanner.next());
        while (!exitFromCreator) {
            MenuStandardComponent.menuWriter(MenuStandardComponent.ADD_NEW_ANIMAL);
            exitFromCreator = !zoo.addAnimal(AnimalInitializer.getAnimalFromMenu(scanner.nextInt()));
        }

        System.out.println("Хоч глянуть пугала?");
        while (!exitFromViewer){
            System.out.println("Режим просмотра шкур");
            System.out.println("0. Выход ");
            System.out.println("1-" +zoo.getAnimals().length+". Показать шкурку");
            exitFromViewer=zoo.showAnimal(scanner.nextInt());
        }


    }
}
