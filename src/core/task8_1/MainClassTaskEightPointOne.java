package core.task8_1;

import core.task8_1.collection.CollectionsGenerator;

// TODO (Eugene): 1/18/2019 just MainClass is enough
public class MainClassTaskEightPointOne {

    public static void main(String[] args) {

        AccessPoint accessPoint = new AccessPoint(System.in, new CollectionsGenerator());
        accessPoint.StartProgram();

    }
}
