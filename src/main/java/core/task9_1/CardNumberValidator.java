package core.task9_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CardNumberValidator {

    public final static int CHECKING_NUMBER = 9;

    public boolean Validate(String numbersLine) {

        List<Integer> numbers = transformStringToNumbers(numbersLine);

        int sumNubers = 0;

        for (int number : numbers) {
            if (number % 2 != 0) {

                int newNumber = number * 2;

                if (newNumber > CHECKING_NUMBER) {
                    newNumber -= CHECKING_NUMBER;
                }

                sumNubers += newNumber;
            }
        }

        return sumNubers % 10 == 0;
    }


    private List<Integer> transformStringToNumbers(String numbersLine) {

        return Arrays.stream(numbersLine.split(""))
                .mapToInt(s -> Integer.parseInt(s))
                .boxed()
                .collect(Collectors.toList());
    }

}
