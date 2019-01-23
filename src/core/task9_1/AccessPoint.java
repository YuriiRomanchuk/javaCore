package core.task9_1;

import java.io.InputStream;

public class AccessPoint {

    private InputController inputController;
    private CardNumberValidator cardNumberValidator;

    public AccessPoint(InputStream in) {
        inputController = new InputController(in);
        cardNumberValidator = new CardNumberValidator();
    }

    public void startProgram() {

        String numbersLine = inputController.receiveLineNumbers().replaceAll("\\s", "");
        System.out.println(String.format("Number is validate: %s", cardNumberValidator.Validate(numbersLine)));

    }

}
