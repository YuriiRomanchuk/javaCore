package core.task8_1;

import core.task8_1.collection.CollectionsGenerator;

public class MainClassTaskEightPointOne {

    public static void main(String[] args) {

        AccessPoint accessPoint = new AccessPoint(System.in, new CollectionsGenerator());
        accessPoint.StartProgram();

    }
}
