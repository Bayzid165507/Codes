import java.util.Scanner;

public class Circle {

    float pi ;
    int r;

    void insert(float pi, int r) {
        this.pi = pi;
        this.r = r;
    }


    void display() {

        double area = pi * r * r;
        double ci = 2 * pi * r;


        System.out.println("Area: " + area);
        System.out.println("Porishima: " + ci);
    }

    public static void main(String[] args) {

        Circle s1 = new Circle();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of pi: ");
        s1.pi = scan.nextFloat();
        System.out.println("Enter the radius of the circle: ");
        s1.r = scan.nextInt();

        s1.insert(s1.pi, s1.r);

        s1.display();
    }
}
