package core.task8.sentient;

public class Human extends Sentient implements Comparable{

    private boolean vegetarian;

    public Human(String firstName, String lastName, int old, boolean vegetarian) {
        super(firstName, lastName, old);
        this.vegetarian = vegetarian;
    }

    public String getVegetarian() {
        return "" + vegetarian;
    }

    @Override
    public String toString() {
        return "Human {" + super.toString() + "vegetarian:" + vegetarian + "}";
    }

    @Override
    public int compareTo(Object o) {
        return this.getFirstName().length() - this.getLastName().length();
    }
}



