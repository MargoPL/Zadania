package OOP2;

public class Cat extends Pet {
    public Cat(String name, double weight, int age, Person owner) {
        super(name, weight, age, owner);
    }

    @Override
    public String introduceYourself() {
        return "I am a cat.";
    }

    @Override
    public String toString() {
        return "Cat{} " + super.toString();
    }
    public void drinkMilk(){
        System.out.println("Cat is drinking milk.");
    }
}
