package ObjectedOrientedDesignInJava;

public abstract class Animal {
    int age;
    String sex;
    int weight;

    Animal(int age, String sex, int weight){
        this.age = age;
        this.sex = sex;
        this.weight = weight;
    }

    void eat()
    {
        System.out.println("Mniam mniam mniam");
    }

    void sleep()
    {
        System.out.println("I'm sleeping");
    }

    public abstract void move();




}
