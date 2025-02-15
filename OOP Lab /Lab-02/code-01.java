import java.util.Scanner;

public class Main {
    String fname;
    String lname;
    int age;

    public static void main(String[] args) {
        Main s1 = new Main();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Age : ");
        s1.age = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter first name : ");
        s1.fname = scan.nextLine();
        System.out.println("Enter first name : ");
        s1.lname = scan.nextLine();
        System.out.println("Name: " + s1.fname + " " + s1.lname);
        System.out.println("Age: " + s1.age);
    }
}
