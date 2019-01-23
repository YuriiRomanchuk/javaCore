package core.task9;

import core.task9.creatures.Creature;
import core.task9.creatures.CreatureGenerator;
import core.task9.creatures.PersonalDataGenerator;

public class MainClassTaskNine {

    public static void main(String[] args) {

        PersonalDataGenerator personalDataGenerator = new PersonalDataGenerator();
        CreatureGenerator creatureGenerator = new CreatureGenerator();

        AccessPoint accessPoint = new AccessPoint(System.in, personalDataGenerator, creatureGenerator);
        accessPoint.startProgram();

    }

}
