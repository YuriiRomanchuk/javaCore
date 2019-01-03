package core.task8;

import core.task8.sentient.Human;
import core.task8.sentient.PersonalDataGenerator;
import core.task8.sentient.Sentient;
import core.task8.sentient.Сyborg;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class CollactionService {

    private Random random;
    private int maximumSentient = 15;
    private Map<String, List<? extends Object>> classMap = new HashMap<>();

    public CollactionService(Random random) {
        this.random = random;
    }

    public Map<String, List<? extends Object>> receiveAllClassMap() {

        classMap.put("Sentient", fillArraySentient());
        return classMap;
    }

    private List<? extends Sentient> fillArraySentient() {

        PersonalDataGenerator personalDataGenerator = new PersonalDataGenerator(random);

        List<Sentient> sentientArray = new ArrayList();

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

    private <T> List<String> receiveNameOfObjectField(T currentObject) {

        List<String> fieldsNameArray = new ArrayList<>();
        Class MetadataObject = currentObject.getClass();
        while (MetadataObject != Object.class) {
            for (Field field : MetadataObject.getDeclaredFields()) {
                fieldsNameArray.add(firstUpperCase(field.getName()));
            }
            MetadataObject = MetadataObject.getSuperclass();
        }
        return fieldsNameArray;
    }

    public void transformObjectArrayToFieldValueMap(List<? extends Object> currentArrayObject, Map<Object, Map<String, String>> fieldValueMap) {

        Map<String, String> objectFieldNameMap = createAllObjectFieldsNameMap(currentArrayObject);

        fieldValueMap.put("ColumnName", objectFieldNameMap);

        for (Object currentObject : currentArrayObject) {

            if (!fieldValueMap.containsKey(currentObject)) {
                fieldValueMap.put(currentObject, new HashMap<>());
            }

            for (String fieldName : objectFieldNameMap.keySet()) {

                Map<String, String> fieldMap = fieldValueMap.get(currentObject);

                try {
                    Method fieldValue = currentObject.getClass().getMethod("get" + fieldName);
                    fieldMap.put(fieldName, String.valueOf(fieldValue.invoke(currentObject)));
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                    fieldMap.put(fieldName, "");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    fieldMap.put(fieldName, "");
                } catch (InvocationTargetException e) {
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

    private Map<String, String> createAllObjectFieldsNameMap(List<? extends Object> currentArrayObject) {

        Map<String, String> fieldsNameMap = new HashMap<>();

        for (Object currentObject : currentArrayObject) {

            List<String> nameOfObjectField = receiveNameOfObjectField(currentObject);

            for (String currentField : nameOfObjectField) {
                if (!fieldsNameMap.containsKey(currentObject)) {
                    fieldsNameMap.put(currentField, "");
                }
            }
        }

        return fieldsNameMap;
    }

}
