public class Cons {
    int x;

    public Cons(int y) {
        x=y;
    }
    public Cons() {
        x=15;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("The is parameter pass ");
        Cons myObj = new Cons(5);
        System.out.println(myObj.x);
        System.out.println("\nThe is not parameter pass ");
        Cons myObj1 = new Cons();
        System.out.println(myObj1.x);
    }

}
