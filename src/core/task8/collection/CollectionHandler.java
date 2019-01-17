package core.task8.collection;

import core.task8.sentient.Human;
import core.task8.sentient.PersonalDataGenerator;
import core.task8.sentient.Sentient;
import core.task8.sentient.Сyborg;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class CollectionHandler {

    private Random random;
    private int maximumSentient = 15;
    private Map<String, List<? extends Object>> objectMap = new HashMap<>();

    public CollectionHandler(Random random) {
        this.random = random;
    }

    public Map<String, List<? extends Object>> receiveObjectMap() {

        objectMap.put("Sentient", fillArraySentient());
        return objectMap;
    }

    private List<? extends Sentient> fillArraySentient() {

        PersonalDataGenerator personalDataGenerator = new PersonalDataGenerator(random);

        List<Sentient> sentientArray = new ArrayList<>();

        int quantityOfSentient = random.nextInt(maximumSentient);

        for (int x = 1; x <= quantityOfSentient; x++) {

            boolean randomSentient = random.nextBoolean();

            Sentient sentient;

            if (randomSentient) {
                sentient = new Human(personalDataGenerator.generateFirstName(), personalDataGenerator.generateLastName(), personalDataGenerator.generateOld(), personalDataGenerator.generateVegetarian());
            } else {
                sentient = new Сyborg(personalDataGenerator.generateFirstName(), personalDataGenerator.generateLastName(), personalDataGenerator.generateOld(), personalDataGenerator.generateModel());
            }

            sentientArray.add(sentient);
        }
        return sentientArray;
    }

    private <T> List<String> receiveNameOfFieldObject(T currentObject) {

        List<String> fieldsNameArray = new ArrayList<>();
        Class metadataObject = currentObject.getClass();
        while (metadataObject != Object.class) {
            for (Field field : metadataObject.getDeclaredFields()) {
                fieldsNameArray.add(firstUpperCase(field.getName()));
            }
            metadataObject = metadataObject.getSuperclass();
        }
        return fieldsNameArray;
    }

    public void transformObjectArrayToFieldValueMap(List<? extends Object> currentObjectArray, Map<Object, Map<String, String>> fieldValueMap) {

        Map<String, String> objectFieldNameMap = createFullObjectFieldsNameMap(currentObjectArray);

        fieldValueMap.put("ColumnName", objectFieldNameMap);

        for (Object currentObject : currentObjectArray) {

            if (!fieldValueMap.containsKey(currentObject)) {
                fieldValueMap.put(currentObject, new HashMap<>());
            }

            for (String fieldName : objectFieldNameMap.keySet()) {

                Map<String, String> fieldMap = fieldValueMap.get(currentObject);

                try {
                    Method fieldValue = currentObject.getClass().getMethod("get" + fieldName);
                    fieldMap.put(fieldName, String.valueOf(fieldValue.invoke(currentObject)));
                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                    fieldMap.put(fieldName, "");
                }
            }

        }

    }

    private String firstUpperCase(String word) {

        if (word == null || word.isEmpty()) return word;
        return word.substring(0, 1).toUpperCase() + word.substring(1);

    }

    private Map<String, String> createFullObjectFieldsNameMap(List<? extends Object> currentArrayObject) {

        Map<String, String> fieldsNameMap = new HashMap<>();

        for (Object currentObject : currentArrayObject) {

            List<String> nameOfObjectField = receiveNameOfFieldObject(currentObject);

            for (String currentField : nameOfObjectField) {
                if (!fieldsNameMap.containsKey(currentObject)) {
                    fieldsNameMap.put(currentField, "");
                }
            }
        }

        return fieldsNameMap;
    }

}
