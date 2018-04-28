package OOP2;

public class Bird extends Pet {
    public Bird(String name, double weight, int age, Person owner) {
        super(name, weight, age, owner);
    }

    @Override
    public String introduceYourself() {
        return "I am a bird.";
    }

    @Override
    public String toString() {
        return "Bird{} " + super.toString();
    }
    public void singingWhileFlying(){
        System.out.println("Bird is singing while flying.");
    }
}
