package core.task8_2;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AccessPoint {

    private Scanner in;
    private InputController inputController;

    public AccessPoint(InputStream inputStream) {
        this.in = new Scanner(inputStream);
        inputController = new InputController(in);
    }

    public void startProgram() {

        ValidatePassword validatePassword = new ValidatePassword(prepareValidators());

        boolean enterUserData = true;

        while (enterUserData) {

            UserData userData = new UserData(inputController.reveiveId(), inputController.reveivePassword());

            List<String> validateAnswer = validatePassword.validateUserPassword(userData);

            String strValidate = validateAnswer.stream()
                    .filter(s -> !s.isEmpty())
                    .collect(Collectors.joining(","));

            System.out.println(strValidate);
            validateAnswer.forEach(System.out::println);

            int continueProgram = inputController.reveiveAnswerToContinueWork();

            if (continueProgram != 1) {
                enterUserData = false;
            }

        }

    }

    public List<Function<UserData, String>> prepareValidators() {

        int MAXIMUM_LENTH = 7;
        List<String> forbiddenWords = Arrays.asList("люли", "рак", "гузно", "кака");

        List<Function<UserData, String>> passVerify = new ArrayList<>();
        passVerify.add(ud -> ud.password.length() > MAXIMUM_LENTH ? String.format("Lenth > %s characters", MAXIMUM_LENTH) : "");
        passVerify.add(ud -> {
            String message = forbiddenWords.stream().filter(ud.password::contains).collect(Collectors.joining(","));
            return message.isEmpty() ? "" : String.format("Current password contains forbidden word: %s", message);
        });

        return passVerify;
    }


}
