public class Employe {
    protected int ID = 232_15_927;
    String Name = "Bayzid";
    String j_Date = "-10_28-2024";

    public void display() {
        System.out.println(Name + " " + ID + " " + j_Date);
    }
}

class Hr extends Employe {
    int salary = 2000;

    public void display() {

        System.out.println("Salary: " + salary);
    }
}

class Software extends Employe {
    double salary = 1289.90;

    public void display() {

        System.out.println("Salary: " + salary);
    }
}



//Different Class nite hbe

public class Main {
    public static void main(String[] args) {
        Hr hrEmployee = new Hr();
        Software softwareEmployee = new Software();

        System.out.println("HR Employee:");
        hrEmployee.display();

        System.out.println("Software Employee:");
        softwareEmployee.display();
        System.out.println(softwareEmployee.ID);
    }
}
