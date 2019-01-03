package core.task8;

import core.task8.sentient.Human;
import core.task8.sentient.PersonalDataGenerator;
import core.task8.sentient.Sentient;
import core.task8.sentient.Сyborg;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class ArrayService {

    private Random random;
    private int maximumSentient = 15;
    private Map<String, List<? extends Object>> classMap = new HashMap<>();

    public ArrayService(Random random) {
        this.random = random;
    }


    public Map<String, List<? extends Object>> fillAllReadyArray() {

        classMap.put("Sentient", fillArraySentient());
        return classMap;
    }

    private List<? extends Sentient> fillArraySentient() {

        PersonalDataGenerator personalDataGenerator = new PersonalDataGenerator();

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

    private <T> List<String> getNameOfObjectField(T currentObject) {

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

    public void transformObjectArrayToMapFieldValueArray(List<? extends Object> currentArrayObject, Map<String, String> fieldValueMap) {

        for (Object currentObject : currentArrayObject) {

            List<String> fieldsNameArray = getNameOfObjectField(currentObject);

            for (String fieldName : fieldsNameArray) {

                if (!fieldValueMap.containsKey(fieldName)) {
                    fieldValueMap.put(fieldName, "");
                }

                String fieldLine = fieldValueMap.get(fieldName);
                try {
                    Method fieldValue =  currentObject.getClass().getMethod("get" + fieldName);
                    fieldLine = fieldLine + String.valueOf(fieldValue.invoke(currentObject)) + " \n ";
                    fieldValueMap.put(fieldName, fieldLine);
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }

            }

        }

    }


    private String firstUpperCase(String word){

        if(word == null || word.isEmpty()) return word;
        return word.substring(0, 1).toUpperCase() + word.substring(1);

    }


}
