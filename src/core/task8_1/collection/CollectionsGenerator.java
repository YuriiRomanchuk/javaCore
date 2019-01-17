package core.task8_1.collection;

import core.task8_1.animals.Animal;
import core.task8_1.animals.Cat;
import core.task8_1.animals.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionsGenerator {

    private Random random = new Random();

    public List<Animal> receiveAnimalsList() {

        List<Animal> animals = new ArrayList<>();

        int maximumAnimals = 15;
        int quantityOfAnimal = random.nextInt(maximumAnimals);

        for (int x = 1; x <= quantityOfAnimal; x++) {

            boolean randomAnimal = random.nextBoolean();

            int maximumAge = 20;
            if (randomAnimal) {
                animals.add(new Cat(randomNumber(maximumAge)));
            } else {
                animals.add(new Dog(randomNumber(maximumAge)));
            }

        }

        return animals;
    }


    private int randomNumber(int restriction) {
        return random.nextInt(restriction);
    }

}
