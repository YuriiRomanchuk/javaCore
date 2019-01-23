package core.task9;

import core.task9.creatures.Creature;
import core.task9.creatures.CreatureGenerator;
import core.task9.creatures.PersonalDataGenerator;
import core.task9.encryption.Encrypting;

import java.io.InputStream;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class AccessPoint {

    private InputController inputController;
    private PersonalDataGenerator personalDataGenerator;
    private CreatureGenerator creatureGenerator;
    private Encrypting encrypting;

    public AccessPoint(InputStream inputStream, PersonalDataGenerator personalDataGenerator, CreatureGenerator creatureGenerator) {
        Scanner in = new Scanner(inputStream);
        this.personalDataGenerator = personalDataGenerator;
        this.creatureGenerator = creatureGenerator;
        inputController = new InputController(in);
        encrypting = new Encrypting();
    }

    public void startProgram() {

        int shift = inputController.receiveShift();

        List<Supplier<Creature>> creaturesSupplier = creatureGenerator.generateCreator(personalDataGenerator);
        List<Creature> creatures = creatureGenerator.generateCreatures(creaturesSupplier);
        creatures.forEach(creature -> System.out.println(creature.toString()));

        System.out.println("----------------");

        List<String> ecodeLines = creatures.stream()
                .map(creature -> encrypting.transformString(creature.toString(), shift, true))
                .collect(Collectors.toList());
        ecodeLines.forEach(System.out::println);

        System.out.println("----------------");
        ecodeLines.forEach(s -> System.out.println(encrypting.transformString(s, shift, false)));

    }

}
