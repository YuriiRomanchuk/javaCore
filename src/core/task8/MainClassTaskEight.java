package core.task8;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class MainClassTaskEight {

    public static void main(String[] args) {

        Random random = new Random();
        ArrayService arrayService = new ArrayService(random);

        Map<String, List<? extends Object>> classMap = arrayService.fillAllReadyArray();

        for (Object valueList : classMap.values()) {
            Map<String, List<Object>> fieldValueMap = arrayService.transformObjectArrayToMapFieldValueArray((List<? extends Object>) valueList);
        }
    }

}
