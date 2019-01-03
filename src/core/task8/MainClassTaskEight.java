package core.task8;

import core.task8.controllers.OutputController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MainClassTaskEight {

    public static void main(String[] args) {

        Random random = new Random();
        ArrayService arrayService = new ArrayService(random);

        Map<String, List<? extends Object>> classMap = arrayService.fillAllReadyArray();

        Map<String, String> fieldValueMap = new HashMap<>();

        for (Object valueList : classMap.values()) {
            arrayService.transformObjectArrayToMapFieldValueArray((List<? extends Object>) valueList, fieldValueMap);
        }

        OutputController outputController = new OutputController();
        outputController.showTableFields(fieldValueMap);

    }

}
