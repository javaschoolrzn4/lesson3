package ru.rzn.sbt.javaschool.lesson3.flowers;

public class BaseFlower implements Flower {
    @Override
    public String whatIsYourName() {
        return getClass().getSimpleName();
    }
}
