package com.level.zoo.animal;

/**
 * Created by cube on 09.11.2017.
 */
public abstract class AbstractAnimal implements Animal {

    private String name;
    private int age;
    protected int maxAge;

    @Override
    public int getMaxAge() {
        return maxAge;
    }

    public String goToToilet() {
        return "=^-^= срунь срунь";
    }

    @Override
    public String toString() {
        return getAnimalClass() + "{" +
                "в туалете :" + goToToilet() +
                "}";
    }

    @Override
    public void vuvodInfo() {
        System.out.println(getAnimalClass());
        System.out.println(getName());
        System.out.println(getAge());
        kartinkiZhivotnuh();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
