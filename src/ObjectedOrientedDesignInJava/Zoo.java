package ObjectedOrientedDesignInJava;

public class Zoo {

    public static void main(String[] args)
    {
        Sparrow sparrow1 = new Sparrow(2,"f",1);
        Animal sparrow2 = new Sparrow(5,"m",2);

        sparrow1.move();
        sparrow2.move();

        Fish fish = new Fish(1, "m", 5);
        fish.move();

        Animal fish2 = new Fish(1, "m", 5);
        ((Fish) fish2).swim();

        moveAnimal(fish);
        moveAnimal(sparrow1);


        Flyable flyingBird = new Sparrow(1,"m",3);
        ((Sparrow) flyingBird).eat();

        //Flyable flyingBird2 = new Bird(1,"m",3); it could not work!


    }

    public static void moveAnimal(Animal animal)
    {
        animal.move();

    }

}
