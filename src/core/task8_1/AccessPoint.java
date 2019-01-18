package core.task8_1;

import core.task8_1.animals.Animal;
import core.task8_1.collection.CollectionsGenerator;
import core.task8_1.collection.SortingCollections;

import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

public class AccessPoint {
    // TODO (Eugene): 1/18/2019 you don't really need Scanner, don't you?
    private Scanner in;
    private CollectionsGenerator collectionsGenerator;

    public AccessPoint(InputStream in, CollectionsGenerator collectionsGenerator) {
        this.in = new Scanner(in);
        this.collectionsGenerator = collectionsGenerator;
    }

    // TODO (Eugene): 1/18/2019 method name starts from lowercase
    public void StartProgram() {

        List<Animal> animalsList = collectionsGenerator.receiveAnimalsList();
        SortingCollections<Animal> sortingCollections = new SortingCollections<>();
        sortingCollections.sortingObjectsList(animalsList);

    }
}
