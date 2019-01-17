package core.task8_1.animals;

public abstract class Animal implements Comparable {

    private int age;

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "  " + this.getClass().getName() + "  " + String.valueOf(this.getAge());
    }
}
