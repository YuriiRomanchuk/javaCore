package core.task8_1.animals;

public abstract class Animal implements Comparable {

    private int age;

    Animal(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "  " + this.getClass().getName() + "  " + String.valueOf(this.getAge());
    }
}
