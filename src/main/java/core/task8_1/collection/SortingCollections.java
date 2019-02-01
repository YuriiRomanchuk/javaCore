package core.task8_1.collection;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingCollections<T extends Comparable> {

    public void sortingObjectsList(List<T> objectsList) {

        Set<T> ts = new TreeSet<>();
        ts.addAll(objectsList);

        for (Object currentObject : ts) {
            System.out.println(currentObject);
        }

    }

}
