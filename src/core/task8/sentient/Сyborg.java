package core.task8.sentient;

public class Сyborg extends Sentient implements Comparable{

    private String model;

    public Сyborg(String firstName, String lastName, int old, String model) {
        super(firstName, lastName, old);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Cyborg { " + super.toString() + "model:" + model + "}";
    }

    @Override
    public int compareTo(Object o) {
        return this.getFirstName().length() - this.getLastName().length();
    }
}
