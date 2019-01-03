package core.task8;

import core.task8.collaction.CollectionHandler;
import core.task8.controllers.InputController;
import core.task8.controllers.OutputController;

import java.io.InputStream;
import java.util.*;

public class AccessPoint {

    Scanner in;

    public AccessPoint(InputStream inputStream) {
        this.in = new Scanner(inputStream);
    }

    public void StartProgram() {

        Random random = new Random();
        OutputController outputController = new OutputController();
        InputController inputController = new InputController(in);
        CollectionHandler collectionHandler = new CollectionHandler(random);

        Map<String, List<? extends Object>> classMap = collectionHandler.receiveObjectMap();

        int versionOfTable = inputController.receiveVariantOfTable();

/*        Set<Object> ts = new TreeSet<>();
        for (List<? extends Object> objectList : classMap.values()) {

            for (Object object : objectList) {
                ts.add((List<Object>) object);
            }
        }

        for(Object currentObject : ts){
            System.out.println(currentObject);
        }*/

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

}
