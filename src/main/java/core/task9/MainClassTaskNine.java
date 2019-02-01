package core.task9;

import core.task9.creatures.ObjectGenerator;
import core.task9.creatures.PersonalDataGenerator;

public class MainClassTaskNine {

    public static void main(String[] args) {

        PersonalDataGenerator personalDataGenerator = new PersonalDataGenerator();
        ObjectGenerator objectGenerator = new ObjectGenerator();

        AccessPoint accessPoint = new AccessPoint(System.in, personalDataGenerator, objectGenerator);
        accessPoint.startProgram();

    }

}
