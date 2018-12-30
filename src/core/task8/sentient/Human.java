package core.task8.sentient;

public class Human extends Sentient {

    private boolean vegetarian;

    public Human(String firstName, String lastName, int old, boolean vegetarian) {
        super(firstName, lastName, old);
        this.vegetarian = vegetarian;
    }


    public boolean isVegetarian() {
        return vegetarian;
    }
}
