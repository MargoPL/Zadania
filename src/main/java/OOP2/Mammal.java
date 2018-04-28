package OOP2;

public abstract class Mammal extends Animal {
    public Mammal(String name, double weight, int age) {
        super(name, weight, age);
    }

    @Override
    public abstract String introduceYourself();
}
