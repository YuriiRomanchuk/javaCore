package core.task8_1;

import core.task8_1.animals.Animal;
import core.task8_1.collection.CollectionsGenerator;
import core.task8_1.collection.SortingCollections;

import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

public class AccessPoint {

    private Scanner in;
    private CollectionsGenerator collectionsGenerator;

    public AccessPoint(InputStream in, CollectionsGenerator collectionsGenerator) {
        this.in = new Scanner(in);
        this.collectionsGenerator = collectionsGenerator;
    }

    public void StartProgram() {

        List<Animal> animalsList = collectionsGenerator.receiveAnimalsList();
        SortingCollections<Animal> sortingCollections = new SortingCollections<>();
        sortingCollections.sortingObjectsList(animalsList);

    }
}
