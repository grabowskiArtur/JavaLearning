package ObjectedOrientedDesignInJava;

public class Bird extends Animal {
    Bird(int age, String sex, int weight) {
        super(age, sex, weight);
    }

    public void fly()
    {
        System.out.println("Flying");

    }
}
