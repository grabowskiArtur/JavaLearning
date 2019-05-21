package Example;

public class HelloWorld {
    public static void main(String[] args) {

        StackTraceElement[] zmienna = Thread.currentThread().getStackTrace();

        for (StackTraceElement i : zmienna)
        {
            System.out.println(i.toString());
        }

        System.out.println("Animal, World!");
        int a = 7;
        double c = 15, d = 12;
        System.out.println(a/d);

        Point newPoint = new Point(2,4);
    }
}

class Point
{
    int x;
    int y;

    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

}
