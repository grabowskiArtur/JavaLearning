package ObjectedOrientedDesignInJava;

public class Bird extends Animal {
    Bird(int age, String sex, int weight) {
        super(age, sex, weight);
    }

    @Override
    public void move() {
        System.out.println("Flapping wings....");
    }

}
