package OOP2;

public class Human extends Mammal {
    public Human(String name, double weight, int age) {
        super(name, weight, age);
    }

    public String introduceYourself() {
        return "I am a human.";
    }

    @Override
    public String toString() {
        return "Human{} " + super.toString();
    }
}
