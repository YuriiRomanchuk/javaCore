package core.task8;

import core.task8.collection.CollectionHandler;
import core.task8.controllers.InputController;
import core.task8.controllers.OutputController;

import java.io.InputStream;
import java.util.*;

public class AccessPoint {

    private Scanner in;

    public AccessPoint(InputStream inputStream) {
        this.in = new Scanner(inputStream);
    }

    public void StartProgram(OutputController outputController, CollectionHandler collectionHandler) {

        InputController inputController = new InputController(in);

        Map<String, List<? extends Object>> classMap = collectionHandler.receiveObjectMap();

        sortingObjects(classMap);

        int versionOfTable = inputController.receiveVariantOfTable();

        switch (versionOfTable) {

            case 1:
                Map<Object, Map<String, String>> fieldValueMap = new HashMap<>();

                for (List<? extends Object> objectList : classMap.values()) {
                    collectionHandler.transformObjectArrayToFieldValueMap(objectList, fieldValueMap);
                    outputController.showTableFieldsFull(fieldValueMap);
                }
                break;
            case 2:
                for (List<? extends Object> objectList : classMap.values()) {
                    outputController.showTableFieldsLite(objectList);
                }
                break;
            default:
                System.out.println("You have not selected a variant of table. Choose 1 or 2");
                break;
        }

    }

    private void sortingObjects(Map<String, List<? extends Object>> classMap) {

        Set<Object> ts = new TreeSet<>();
        for (List<? extends Object> objectList : classMap.values()) {
            ts.addAll(objectList);
        }

        for(Object currentObject : ts){
            System.out.println(currentObject);
        }

    }

}
