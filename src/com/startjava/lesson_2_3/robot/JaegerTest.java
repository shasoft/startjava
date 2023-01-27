package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Gipsy Danger", "Mark-3", "USA", 8);
        if (jaeger1.drift())
            jaeger1.move();
        System.out.println("Робот 1: " + jaeger1);

        Jaeger jaeger2 = new Jaeger();
        jaeger2.setModelName("Striker Eureka");
        jaeger2.setMark("Mark-5");
        jaeger2.setOrigin("Australia");
        jaeger2.setStrength(10);
        System.out.println(jaeger2.scanKiju());
        jaeger2.useVortexCannon();
        System.out.println("Робот 2: " + jaeger2);
    }
}