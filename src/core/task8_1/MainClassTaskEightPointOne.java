package core.task8_1;

import core.task8_1.collection.CollectionsGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MainClassTaskEightPointOne {

    public static void main(String[] args) {

        AccessPoint accessPoint = new AccessPoint(System.in, new CollectionsGenerator<>());
        accessPoint.startProgram();


        Printer printer = new Printer() {

            @Override
            public String getMessage() {
                return "olool";
            }
        };

        Printer printer2 = () -> "sadfasfd";

        printer2.print();

        List<Integer> integersA = Arrays.asList(1, 4, 6, 8);


        List<Function<Integer, Boolean>> intVerify = new ArrayList<>();
        intVerify.add(integer -> integer % 2 == 0);
        intVerify.add(integer -> integersA.contains(integer));

        List<Integer> integers = Arrays.asList(1, 2, 3, 4);

        integers.forEach(i -> intVerify.forEach(v -> {
          boolean we =   v.apply(i);
        }));


    }
}
