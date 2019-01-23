package core.task9_1;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AccessPoint {

    private Scanner in;

    public AccessPoint(InputStream in) {
        this.in = new Scanner(in);
    }

    public void startProgram() {
        InputController inputController = new InputController(System.in);

        String numbersLine = inputController.receiveLineNumbers().replaceAll("\\s","");

        int[] intArray = Arrays.stream(numbersLine.split(""))
                .mapToInt(s -> Integer.parseInt(s))
                .toArray();

        List<Integer> numbers = new ArrayList<>(IntStream.of(intArray).boxed().collect(Collectors.toList()));

        ValidateCardNumber validateCardNumber = new ValidateCardNumber();
        System.out.println(String.format("Number is validate: %s", String.valueOf(validateCardNumber.ValidatePassword(numbers))));

    }

}
