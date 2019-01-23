package core.task9.creatures;

public abstract class Creature {

    private String lastName;
    private String firstName;
    private int age;

    public Creature(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}
