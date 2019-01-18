package core.task8_1.animals;

public class Dog extends Animal {

    public Dog(int age) {
        super(age);
    }

    @Override
    public int compareTo(Object o) {
        Animal otherObject = (Animal) o;
        // TODO (Eugene): 1/18/2019 if you need acces to age in your subclasses - use 'protected' instead of 'private' 
        return otherObject.getAge() - this.getAge();
    }
}
