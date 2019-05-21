package ObjectedOrientedDesignInJava;

public class Chicken extends Bird {
    Chicken(int age, String sex, int weight) {
        super(age, sex, weight);
    }

    //chicken cannot fuy so it's non sens
/*    public void fly()
    {
        System.out.println("Not able to fly");

    }*/

}
