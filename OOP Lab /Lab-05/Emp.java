// Aggregation Example
class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Bank {
    String name;
    Emp emp;

    public Bank(String name, Emp emp) {
        this.name = name;
        this.emp = emp;
    }

    void display() {
        System.out.println("Bank name: " + name + " -> Employee: " + emp.name);
        emp.disAdd();
    }
}

// Composition Example
class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id, String name, String city, String state, String country) {
        this.id = id;
        this.name = name;
        this.address = new Address(city, state, country);
    }

    void disAdd() {
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    void display() {
        System.out.println(id + " " + name);
        disAdd();
    }

    public static void main(String[] args) {

        Emp e1 = new Emp(148, "Bayzid", "Savar", "Dhaka", "BD");
        Emp e2 = new Emp(698, "Sami", "Dighirchala", "Gazipur", "BD");


        e1.display();
        e2.display();

        // Creating Bank object with aggregation (Bank has an Employee, Employee can exist independently)
        Bank b1 = new Bank("Mugda Bank", e1);
        b1.display();
    }
}
