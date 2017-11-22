package com.level;

import com.level.zoo.MenuStandardComponent;
import com.level.zoo.Zoo;
import com.level.zoo.animal.AnimalInitializer;
import com.level.zoo.animal.impl.FileUtils;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by cube on 09.11.2017.
 */
public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        boolean exitFromCreator = false;
        boolean exitFromViewer = false;
        Scanner scanner = new Scanner(System.in);
        Zoo zoo = null;
        System.out.println("Как вы хотите создать шкуропарк");
        System.out.println("1-вручную");
        System.out.println("2-рандом");
        System.out.println("3-Прочитать из файла");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Введите имя зоопарка");
                zoo = new Zoo(scanner.next());
                while (!exitFromCreator) {
                    MenuStandardComponent.menuWriter(MenuStandardComponent.ADD_NEW_ANIMAL);
                    exitFromCreator = !zoo.addAnimal(AnimalInitializer.getAnimalFromMenu(scanner.nextInt()));
                }
                break;
            case 2:
                int razmer;
                String name;
                System.out.println("Введите имя Зоопарка");
                name=scanner.next();
                scanner.nextLine();
                System.out.println("Введите размер зоопарка");
                razmer=scanner.nextInt();
                zoo=new Zoo(name, razmer);
                break;
            case 3:
                try {
                    String content = FileUtils.read("src/Zoo.txt");
                    String[]razdelenie = content.split("\n");
                    zoo=new Zoo(razdelenie);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                break;
        }

        zoo.createTeemo();
        System.out.println("Хоч глянуть пугала?");
        while (!exitFromViewer) {
            System.out.println("Режим просмотра шкур");
            System.out.println("0. Выход ");
            System.out.println("1-" + zoo.getAnimals().length + ". Показать шкурку");
            exitFromViewer = zoo.showAnimal(scanner.nextInt());
        }


    }
}
