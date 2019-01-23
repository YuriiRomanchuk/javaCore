package core.task9.creatures;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PersonalDataGenerator {

    private Random random = new Random();
    private List<String> lastNames = Arrays.asList("Reinor", "Smith", "Sparrow", "Turner", "Schwarzenegger", "Willis", "Cruise", "Baggins", "Hacker", "Resnick");
    private List<String> firstNames = Arrays.asList("Bruce", "Jim", "Jack", "Will", "Arnold", "Anduin", "Tom", "Frodo", "Sam", "John");
    private int maximum = 9;
    private int maximumAge = 100;


    public String generateLastName() {
        return lastNames.get(randomNumber(maximum));
    }

    public String generateFirstName() {
        return firstNames.get(randomNumber(maximum));
    }

    public int generateAge() {
        return randomNumber(maximumAge);
    }

    private int randomNumber(int restriction) {
        return random.nextInt(restriction);
    }


}
