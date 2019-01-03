package core.task8.controllers;

import javax.swing.table.TableColumn;
import java.util.List;
import java.util.Map;

public class OutputController {

    public void showTableFields(Map<String, String> fieldValueMap) {


        String column = "";
        String line = "";

        for (Map.Entry<String, String> entry : fieldValueMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            column = column + key + "   ";
            line = line + value + "   ";

        }

        System.out.println(column);
        System.out.println(line);
    }
}
