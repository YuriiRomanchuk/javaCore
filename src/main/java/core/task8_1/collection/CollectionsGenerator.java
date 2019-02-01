package core.task8_1.collection;

import core.task8_1.Creator;
import core.task8_1.animals.Animal;
import core.task8_1.animals.Cat;
import core.task8_1.animals.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class CollectionsGenerator<T> {

    private Random random = new Random();

    public List<Animal> receiveAnimalsList(Supplier<Animal> func) {

        List<Animal> animals = new ArrayList<>();

        int maximumAnimals = 15;
        int quantityOfAnimal = random.nextInt(maximumAnimals);

        for (int x = 1; x <= quantityOfAnimal; x++) {

            animals.add(func.get());
        }

        return animals;
    }

    public Animal createAnimal() {

        Random random = new Random();

        boolean randomAnimal = random.nextBoolean();

        int maximumAge = 20;

        if (randomAnimal) {
            return new Cat(random.nextInt(maximumAge));
        } else {
            return new Dog(random.nextInt(maximumAge));
        }

    }


    public List<T> createList(List<Supplier<T>> objectCreators) {

        List<T> createdObjects = new ArrayList<>();

        int totalItems = 15;

        for (int x = 0; x < totalItems; x++) {

            int i = randomNumber(objectCreators.size());

            T someObject = objectCreators.get(i).get();
            createdObjects.add(someObject);
        }

        return createdObjects;
    }

    public List<T> createList(Creator<T>... objectCreators) {

        List<T> createdObjects = new ArrayList<>();

        int totalItems = 15;

        for (int x = 0; x < totalItems; x++) {

            int i = randomNumber(objectCreators.length);

            T someObject = objectCreators[i].create();
            createdObjects.add(someObject);
        }

        return createdObjects;
    }


    private int randomNumber(int restriction) {
        return random.nextInt(restriction);
    }


    public List<Supplier<Animal>> animalCreator() {

        int maximumAge = 20;

        List<Supplier<Animal>> animalList = new ArrayList<>();
        animalList.add(() ->new Dog(random.nextInt(maximumAge)));
        animalList.add(() ->new Cat(random.nextInt(maximumAge)));

        return animalList;
    }

}
