package core.task8;

import core.task8.collaction.CollactionService;
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
        CollactionService collactionService = new CollactionService(random);

        Map<String, List<? extends Object>> classMap = collactionService.receiveAllClassMap();

        int versionOfTable = inputController.receiveVariantOfTable();

        switch (versionOfTable) {

            case 1:
                Map<Object, Map<String, String>> fieldValueMap = new HashMap<>();

                for (Object objectList : classMap.values()) {
                    collactionService.transformObjectArrayToFieldValueMap((List<? extends Object>) objectList, fieldValueMap);
                    outputController.showTableFieldsFull(fieldValueMap);
                }
                break;
            case 2:
                for (Object objectList : classMap.values()) {
                    outputController.showTableFieldsLite((List<? extends Object>) objectList);
                }
                break;
            default:
                System.out.println("You have not selected a variant of table. Choose 1 or 2");
                break;
        }

    }

}
