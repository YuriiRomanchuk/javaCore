package core.task9;

import core.task9.creatures.*;
import core.task9.encryption.Encrypting;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class AccessPoint {

    private InputController inputController;
    private PersonalDataGenerator personalDataGenerator;
    private ObjectGenerator creatureGenerator;
    private Encrypting encrypting;

    public AccessPoint(InputStream inputStream, PersonalDataGenerator personalDataGenerator, ObjectGenerator objectGenerator) {
        Scanner in = new Scanner(inputStream);
        this.personalDataGenerator = personalDataGenerator;
        this.creatureGenerator = objectGenerator;
        inputController = new InputController(in);
        encrypting = new Encrypting(inputController.receiveShift());
    }

    public void startProgram() {

        List<Supplier<Creature>> creaturesSupplier = prepareSuppliers(personalDataGenerator);
        List<Creature> creatures = creatureGenerator.generateCreatures(creaturesSupplier);
        creatures.forEach(creature -> System.out.println(creature.toString()));

        System.out.println("----------------");

        List<String> ecodeLines = creatures.stream()
                .map(creature -> encrypting.encrypt(creature.toString()))
                .collect(Collectors.toList());
        ecodeLines.forEach(System.out::println);

        System.out.println("----------------");
        ecodeLines.forEach(s -> System.out.println(encrypting.decrypt(s)));

    }

    public List<Supplier<Creature>> prepareSuppliers(PersonalDataGenerator personalDataGenerator) {

        List<Supplier<Creature>> creaturesSupplier = new ArrayList<>();
        creaturesSupplier.add(() -> new Cyborg(personalDataGenerator.generateLastName(), personalDataGenerator.generateFirstName(), personalDataGenerator.generateAge()));
        creaturesSupplier.add(() -> new Human(personalDataGenerator.generateLastName(), personalDataGenerator.generateFirstName(), personalDataGenerator.generateAge()));

        return creaturesSupplier;
    }

}
