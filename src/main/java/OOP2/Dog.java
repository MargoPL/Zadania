package OOP2;

public class Dog extends Pet {
    public Dog(String name, double weight, int age, Person owner) {
        super(name, weight, age, owner);
    }

    @Override
    public String introduceYourself() {
        return "I am a dog.";
    }

    @Override
    public String toString() {
        return "Dog{} " + super.toString();
    }
    public void biteBone(){
        System.out.println("Dog is biting a bone.");
    }
}
