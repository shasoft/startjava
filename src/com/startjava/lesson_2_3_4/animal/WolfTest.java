package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("man");
        wolf.setName("Пусик");
        wolf.setWeight(60);
        wolf.setAge(9);
        wolf.setColor("grey");

        System.out.println(wolf.getGender() + " " + wolf.getName() + " " + wolf.getWeight() + " " + wolf.getAge() + " "
                + wolf.getColor());

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}