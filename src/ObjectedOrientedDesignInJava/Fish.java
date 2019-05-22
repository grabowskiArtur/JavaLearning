package ObjectedOrientedDesignInJava;

public class Fish extends Animal {
    Fish(int age, String sex, int weight) {
        super(age, sex, weight);
    }

    @Override
    public void move() {
        System.out.println("Fish is swimming");
    }

    public void swim()
    {
        System.out.println("Swimming");
    }

}
