package OOP2;

public class Pet extends Animal {

    private Person owner;

    public Pet(String name, double weight, int age, Person owner) {
        super(name, weight, age);
        this.owner = owner;
    }


    public String introduceYourself() {
        return null;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "owner=" + owner +
                "} " + super.toString();
    }
}
