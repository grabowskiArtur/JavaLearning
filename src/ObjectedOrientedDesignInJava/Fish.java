package ObjectedOrientedDesignInJava;

public class Fish extends Animal {
    Fish(int age, String sex, int weight) {
        super(age, sex, weight);
    }

    void swim()
    {
        System.out.println("Swimming");
    }

}
