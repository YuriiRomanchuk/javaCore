package core.task9.creatures;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class ObjectGenerator<T> {

    public List<T> generateCreatures(List<Supplier<T>> currentObjects) {

        List<T> createdObjects = new ArrayList<>();
        int totalItems = 5;
        Random random = new Random();

        for (int x = 0; x <= totalItems; x++) {
            int index = random.nextInt(currentObjects.size());
            createdObjects.add(currentObjects.get(index).get());
        }

        return createdObjects;

    }

}
