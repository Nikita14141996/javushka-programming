package com.nikita.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Animals> animals = List.of(new Animals("Жираф", 8, Classification.HERBIVORE, MovementClassification.RUN),
                new Animals("Орел", 3, Classification.PREDATOR, MovementClassification.FLY),
                new Animals("Слон", 15, Classification.HERBIVORE, MovementClassification.RUN),
                new Animals("Гибон", 11, Classification.OMNIVOROUS, MovementClassification.RUN),
                new Animals("Медведь", 20, Classification.OMNIVOROUS, MovementClassification.RUN),
                new Animals("Сом", 7, Classification.HERBIVORE, MovementClassification.SWIM),
                new Animals("Кот", 4, Classification.PREDATOR, MovementClassification.RUN),
                new Animals("Лошадь", 22, Classification.HERBIVORE, MovementClassification.RUN),
                new Animals("Черепаха", 6, Classification.HERBIVORE, MovementClassification.SWIM),
                new Animals("Воробей", 1, Classification.HERBIVORE, MovementClassification.FLY));

        List<Animals> predator = animals.stream().filter(animals1 -> animals1.getClassification().equals(Classification.PREDATOR)).collect(Collectors.toList());
        predator.forEach(System.out::println);

        System.out.println();

        List<Animals> sortedAgeAnimal = animals.stream().sorted(Comparator.comparing(Animals::getAge).reversed()).collect(Collectors.toList());
        sortedAgeAnimal.forEach(System.out::println);

        System.out.println();

        Map<Classification, List<Animals>> groupingAnimals = animals.stream().collect(Collectors.groupingBy(Animals::getClassification));
        groupingAnimals.forEach((classification, animals1) -> {
            System.out.println(classification);
            animals1.forEach(System.out::println);
            System.out.println();
        });

        Optional<String> nameAnimal = animals.stream().filter(animals1 -> animals1.getClassification().equals(Classification.PREDATOR))
                .max(Comparator.comparing(Animals::getAge))
                .map(Animals::getName);
        nameAnimal.ifPresent(System.out::println);

    }

}

