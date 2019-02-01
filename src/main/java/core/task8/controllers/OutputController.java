package core.task8.controllers;

import java.util.List;
import java.util.Map;

public class OutputController {

    public void showTableFieldsFull(Map<Object, Map<String, String>> fieldValueMap) {

        String column = "";
        String currentLine = "";
        String columnSpaceLine = "        ";

        boolean firstEntry = true;

        for (Map.Entry<Object, Map<String, String>> entry : fieldValueMap.entrySet()) {
            currentLine = "";
            Object keyObject = entry.getKey();
            Map<String, String> valueMap = entry.getValue();

            if (firstEntry) {
                column += "Class name" + columnSpaceLine;
                for (String fieldName : valueMap.keySet()) {
                    column += fieldName + columnSpaceLine;
                }
                System.out.println(column);
                firstEntry = false;
                continue;
            }

            currentLine += keyObject.getClass().getSimpleName() + receiveSpaceLineBetweenColumn("ObjectName", keyObject.getClass().getSimpleName(), columnSpaceLine);

            for (Map.Entry<String, String> entryField : valueMap.entrySet()) {
                String fieldName = entryField.getKey();
                String fieldValue = entryField.getValue();
                String spaceLine = receiveSpaceLineBetweenColumn(fieldName, fieldValue, columnSpaceLine);
                currentLine += fieldValue + spaceLine;
            }
            System.out.println(currentLine);
        }
    }

    public void showTableFieldsLite(List<? extends Object> objectList) {
        objectList.stream().forEach(e -> System.out.println(e));
    }

    private String receiveSpaceLineBetweenColumn(String fieldName, String fieldValue, String columnSpaceLine) {

        String spaceLine = "";

        if (fieldName.length() >= fieldValue.length()) {
            for (int x = 1; (fieldName.length() - fieldValue.length()) >= x; x++) {
                spaceLine += " ";
            }
            spaceLine += columnSpaceLine;
        } else {
            for (int x = 1; (columnSpaceLine.length() - (fieldValue.length() - fieldName.length())) >= x; x++) {
                spaceLine += " ";
            }
        }

        return spaceLine;
    }

}
