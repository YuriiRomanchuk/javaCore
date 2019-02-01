package core.task8_2;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ValidatePassword {

    private List<Function<UserData, String>> passVerify;

    public ValidatePassword(List<Function<UserData, String>> passVerify) {
        this.passVerify = passVerify;
    }

    public List<String> validateUserPassword(UserData userData) {

        return passVerify.stream()
                .map(v -> v.apply(userData))
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

    }
}
