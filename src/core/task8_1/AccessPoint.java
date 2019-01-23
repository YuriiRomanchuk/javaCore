package core.task8_1;

import core.task8_1.animals.Animal;
import core.task8_1.animals.Cat;
import core.task8_1.animals.Dog;
import core.task8_1.animals.Fish;
import core.task8_1.collection.CollectionsGenerator;
import core.task8_1.collection.SortingCollections;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Supplier;

public class AccessPoint {

    private Scanner in;
    private CollectionsGenerator<Animal> collectionsGenerator;

    public AccessPoint(InputStream in, CollectionsGenerator<Animal> collectionsGenerator) {
        this.in = new Scanner(in);
        this.collectionsGenerator = collectionsGenerator;
    }

    public void startProgram() {

       /* Creator<Animal> catCreator = () -> new Cat(20);*/
/*
        Creator<Animal> dogCreator = new Creator<Animal>() {
            @Override
            public Animal create() {
                return new Dog(10);
            }
        };

        List<Creator<Animal>> creators = Arrays.asList(() -> new Cat(20), dogCreator, Fish::new);

        List<Animal> animals = collectionsGenerator.createList(creators);

        for (Animal animals : animals) {
            System.out.println(animals);
        }

        System.out.println("-------------------------------------");

        List<Animal> animals2 = collectionsGenerator.createList(Fish::new, () -> new Dog(5));

        for (Animal animals : animals2) {
            System.out.println(animals);
        }

        SortingCollections<Animal> sortingCollections = new SortingCollections<>();
        sortingCollections.sortingObjectsList(animals);

        Supplier<Fish> anotherFishSupplier = Fish::new;


        collectionsGenerator.receiveAnimalsList(collectionsGenerator::createAnimal);*/

        List<Supplier<Animal>> creators  =  collectionsGenerator.animalCreator();
        List<Animal> animals = collectionsGenerator.createList(creators);
        SortingCollections<Animal> sortingCollections = new SortingCollections<>();
        sortingCollections.sortingObjectsList(animals);

    }

}
