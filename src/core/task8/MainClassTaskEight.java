package core.task8;

import core.task8.collection.CollectionHandler;
import core.task8.controllers.InputController;
import core.task8.controllers.OutputController;
import core.task8.sentient.Sentient;

import java.util.Random;

public class MainClassTaskEight {

    public static void main(String[] args) {

        Random random = new Random();
        OutputController outputController = new OutputController();
        CollectionHandler collectionHandler = new CollectionHandler(random);

        AccessPoint accessPoint = new AccessPoint(System.in);
        accessPoint.StartProgram(outputController, collectionHandler);
    }

}
