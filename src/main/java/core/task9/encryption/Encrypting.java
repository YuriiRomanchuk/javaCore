package core.task9.encryption;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Character.isUpperCase;

public class Encrypting {

    private Map<Boolean, Character> upperFirstSymbol = new HashMap<>();
    private static final int NUMBERS_OF_ALPHABET = 26;
    private int shift;

    public Encrypting(int shift) {
        this.upperFirstSymbol.put(true, 'A');
        this.upperFirstSymbol.put(false, 'a');
        this.shift = shift;
    }

    private String transformString(String unencryptedLine) {

        StringBuilder cryptedLine = new StringBuilder();

        for (char symbol : unencryptedLine.toCharArray()) {
            if (Character.isLetter(symbol)) {
                char firstSymbol = upperFirstSymbol.get(isUpperCase(symbol));
                cryptedLine.append(Character.toChars(firstSymbol + (symbol - firstSymbol + shift) % NUMBERS_OF_ALPHABET));
            } else {
                cryptedLine.append(symbol);
            }
        }
        return cryptedLine.toString();
    }

    public String encrypt(String unencryptedLine) {
        return transformString(unencryptedLine);
    }

    public String decrypt(String unencryptedLine) {
        shift = (NUMBERS_OF_ALPHABET - shift) % NUMBERS_OF_ALPHABET + NUMBERS_OF_ALPHABET;
        return transformString(unencryptedLine);
    }

}
