package core.task8_1.collection;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// TODO (Eugene): 1/18/2019 right now it's SortingAndPrintingCollections
public class SortingCollections<T extends Comparable> {

    // TODO (Eugene): 1/18/2019 not even sorting - objectsList stays the same and there is no return value
    public void sortingObjectsList(List<T> objectsList) {
        // TODO (Eugene): 1/18/2019 as an option, you can use 'new TreeSet<>(objectsList)'
        Set<T> ts = new TreeSet<>();
        ts.addAll(objectsList);

        for (Object currentObject : ts) {
            System.out.println(currentObject);
        }

    }

}
