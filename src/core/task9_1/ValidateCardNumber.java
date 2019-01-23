package core.task9_1;

import java.util.List;

public class ValidateCardNumber {

    public final static int CHECKING_NUMBER = 9;

    public boolean ValidatePassword(List<Integer> numbers) {

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

        if (sumNubers % 10 != 0) {
            return false;
        } else {
            return true;
        }

    }

}
