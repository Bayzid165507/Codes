import java.util.Scanner;

public class Employe {

    String Name;
    String title;
    int salary;

    void insert(String Name, String title, int salary) {
       /* this.Name = Name;
        this.title = title;
       this.salary = salary;*/
    }

    void display() {

        int incrementedSalary = salary + 50000;
        int yearly = 12 * salary;

        System.out.println("Name : " + Name);
        System.out.println("Job title : " + title);
        System.out.println("Incremented salary: " + incrementedSalary);
        System.out.println("Yearly salary: " + yearly);
    }

    public static void main(String[] args) {
        Employe s1 = new Employe();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the name: ");
        s1.Name = scan.nextLine();
        System.out.println("Enter the Job title: ");
        s1.title = scan.nextLine();
        System.out.println("Enter the Salary: ");
        s1.salary = scan.nextInt();

        s1.insert(s1.Name, s1.title, s1.salary);

        s1.display();

    }
}
