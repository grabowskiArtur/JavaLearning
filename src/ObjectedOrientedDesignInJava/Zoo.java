package ObjectedOrientedDesignInJava;

public class Zoo {

    public static void main(String[] args)
    {
        Animal animal1 = new Animal(3,"M",5);

        Bird bird1 = new Bird(3,"F",10);

        bird1.eat();
        bird1.sleep();


    }
}
