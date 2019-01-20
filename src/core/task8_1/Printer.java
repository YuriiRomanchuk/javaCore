package core.task8_1;

public interface Printer {

    String getMessage();

    default void print() {
        System.out.println(getMessage());
    }

}
