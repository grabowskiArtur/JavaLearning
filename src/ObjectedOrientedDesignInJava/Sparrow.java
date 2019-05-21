package ObjectedOrientedDesignInJava;

public class Sparrow extends Bird implements Flyable{
    Sparrow(int age, String sex, int weight) {
        super(age, sex, weight);
    }

    @Override
    public void fly(){
        System.out.println("Flying....");
    }

}
