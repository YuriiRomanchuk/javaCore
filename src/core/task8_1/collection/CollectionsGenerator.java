package core.task8_1.collection;

import core.task8_1.animals.Animal;
import core.task8_1.animals.Cat;
import core.task8_1.animals.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// TODO (Eugene): 1/18/2019 This class generates ony Animals - AnimalGenerator is a better name in this case
public class CollectionsGenerator {

    private Random random = new Random();

    // TODO (Eugene): 1/18/2019 generateAnimalList is a better name
    public List<Animal> receiveAnimalsList() {

        List<Animal> animals = new ArrayList<>();

        int maximumAnimals = 15;
        int quantityOfAnimal = random.nextInt(maximumAnimals);

        for (int x = 1; x <= quantityOfAnimal; x++) {
            // TODO (Eugene): 1/18/2019 Animal is always created randomly. createCat or isCat - better names
            boolean randomAnimal = random.nextBoolean();
            // TODO (Eugene): 1/18/2019 you don't need to create maximumAge variable in each loop. Move it before the 'for... ' statement
            int maximumAge = 20;
            if (randomAnimal) {
                animals.add(new Cat(randomNumber(maximumAge)));
            } else {
                animals.add(new Dog(randomNumber(maximumAge)));
            }

        }

        return animals;
    }
    // TODO (Eugene): 1/18/2019 to

    // TODO (Eugene): 1/18/2019 much



    // TODO (Eugene): 1/18/2019 spaces!!1111

    private int randomNumber(int restriction) {
        return random.nextInt(restriction);
    }

}
