package core.task9.creatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class CreatureGenerator<T> {

    public List<Supplier<Creature>> generateCreator(PersonalDataGenerator personalDataGenerator) {

        List<Supplier<Creature>> creaturesSupplier = new ArrayList<>();
        creaturesSupplier.add(() -> new Cyborg(personalDataGenerator.generateLastName(), personalDataGenerator.generateFirstName(), personalDataGenerator.generateAge()));
        creaturesSupplier.add(() -> new Human(personalDataGenerator.generateLastName(), personalDataGenerator.generateFirstName(), personalDataGenerator.generateAge()));

        return creaturesSupplier;
    }

    public List<T> generateCreatures(List<Supplier<Creature>> currentObjects) {

        List<T> createdObjects = new ArrayList<>();
        int totalItems = 5;
        Random random = new Random();

        for (int x = 0; x <= totalItems; x++) {
            int index = random.nextInt(currentObjects.size());
            createdObjects.add((T) currentObjects.get(index).get());
        }

        return createdObjects;

    }

}
