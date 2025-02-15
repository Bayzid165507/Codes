import java.util.Scanner;

public class Main {
    String fname;
    String lname;
    int age;
    void insert(String a,String b,int c)
    {
        fname=a;
        lname=b;
        age=c;
    }
    void display()
    {
        System.out.println("Full Name :"+fname +" " +lname );
        System.out.println("Age: " + age);
    }
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
        /*(System.out.println("Name: " + s1.fname + " " + s1.lname);
        System.out.println("Age: " + s1.age);
        s1.display();*/
        s1.insert(s1.fname,s1.lname, s1.age);
        s1.display();
    }
}
