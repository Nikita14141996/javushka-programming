package com.nikita.streamapi;

public class Animals {
    private final String name;
    private final int age;
    private final Classification classification;
    private final MovementClassification movementClassification;

    public Animals(String name, int age, Classification classification, MovementClassification movementClassification) {
        this.name = name;
        this.age = age;
        this.classification = classification;
        this.movementClassification = movementClassification;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Classification getClassification() {
        return classification;
    }

    public MovementClassification getMovementClassification() {
        return movementClassification;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classification=" + classification +
                ", movementClassification=" + movementClassification +
                '}';
    }
}
