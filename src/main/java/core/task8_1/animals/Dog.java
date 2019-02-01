package core.task8_1.animals;

public class Dog extends Animal {

    public Dog(int age) {
        super(age);
    }

    @Override
    public int compareTo(Object o) {
        Animal otherObject = (Animal) o;
        return otherObject.getAge() - this.getAge();
    }
}
