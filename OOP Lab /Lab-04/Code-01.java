public class person {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(int age) {
        this.age = age;
    }

    public person() {
        name = "rafi";
        age = 19;
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        person person1 = new person();
        person1.setName("Bayzid");
        person1.setName(18);
        System.out.println(person1.getName() + " " + person1.getAge());
        person person2 = new person();
        System.out.println(person2.name + " " + person2.age);
        person person3 = new person("Taufiq", 20);
        System.out.println(person3.name + " " + person3.age);

    }
}
