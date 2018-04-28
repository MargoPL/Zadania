package OOP2;

public class OOP2Main {


    public static void main(String[] args) {
        Animal dogExample = new Dog("Azor",26,6,new Person("Andrzej"));
        Animal catExample = new Cat("Mruczek",3,2,new Person("Tomek"));
        Animal birdExample = new Bird("Tweetie",1,1,new Person("Anna"));
        Animal humanExample = new Human("Andrzej",62,21);

        Animal[] animals = new Animal[4];
        animals[0] = dogExample;
        animals[1] = catExample;
        animals[2] = birdExample;
        animals[3] = humanExample;

        System.out.println(dogExample.introduceYourself());
        System.out.println(dogExample.toString());
        System.out.println(catExample.introduceYourself());
        System.out.println(catExample.toString());
        System.out.println(birdExample.introduceYourself());
        System.out.println(birdExample.toString());
        System.out.println(humanExample.introduceYourself());
        System.out.println(humanExample.toString());

        for (int i = 0; i < animals.length -1  ; i++) {
            if (animals[i] instanceof Dog) {
                ((Dog) animals[i]).biteBone();
            }
            if (animals[i] instanceof Cat) {
                ((Cat) animals[i]).drinkMilk();
            }
            if (animals[i] instanceof Bird) {
                ((Bird) animals[i]).singingWhileFlying();
            }
            continue;
        }
    }
}
