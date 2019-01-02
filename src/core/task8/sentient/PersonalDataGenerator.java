package core.task8.sentient;

import java.util.Random;

public class PersonalDataGenerator {

    int maximum = 9;
    int maximumOld = 100;
    Random random = new Random();
    private String[] lastNameArray = {"Reinor", "Smith", "Sparrow", "Turner", "Schwarzenegger", "Willis", "Cruise", "Baggins", "Hacker", "Resnick"};
    private String[] firstNameArray = {"Bruce", "Jim", "Jack", "Will", "Arnold", "Anduin", "Tom", "Frodo", "Sam", "John"};


    public String generateLastName() {
        return firstNameArray[randomNumber(maximum)];
    }

    public String generateFirstName() {
        return lastNameArray[randomNumber(maximum)];
    }

    public int generateOld() {
        return randomNumber(maximumOld);
    }

    public boolean generateVegetarian() {
        int vegetarian = randomNumber(2);
        return vegetarian == 1;
    }


    public String generateModel() {
        return "T-" + randomNumber(maximumOld);
    }

    private int randomNumber(int restriction) {
        return random.nextInt(restriction);
    }

}
