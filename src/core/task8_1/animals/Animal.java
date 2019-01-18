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
        // TODO (Eugene): 1/18/2019 when you concatenate string with other types, you don't need to use String.valueOf if the first element in concatenation is string
        return this.getClass().getSimpleName() + "  " + this.getClass().getName() + "  " + String.valueOf(this.getAge());
    }
}
