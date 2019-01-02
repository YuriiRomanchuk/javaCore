package core.task8.sentient;

public class Сyborg extends Sentient {

    private String model;

    public Сyborg(String firstName, String lastName, int old, String model) {
        super(firstName, lastName, old);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
