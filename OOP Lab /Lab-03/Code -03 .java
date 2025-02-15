import java.util.*;

public class Scan {

    int sum(int x, int y) {
        return x + y;
    }


    double sum(double x, double y) {
        return x + y;
    }


    String sum(String x, String y) {
        return x + y;
    }


    int sum(int x, int y, int z) {
        return x + y + z;
    }


    double sum(double x, double y, double z) {
        return x + y + z;
    }


    String sum(String x, String y, String z) {
        return x + y + z;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Scan lab = new Scan();


        System.out.println("Enter two integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int resultInt = lab.sum(num1, num2);
        System.out.println("Sum of integers: " + resultInt);


        System.out.println("Enter two decimal numbers:");
        double num3 = scanner.nextDouble();
        double num4 = scanner.nextDouble();
        double resultDouble = lab.sum(num3, num4);
        System.out.println("Sum of doubles: " + resultDouble);


        System.out.println("Enter two strings:");
        scanner.nextLine();
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String resultString = lab.sum(str1, str2);
        System.out.println("Concatenation of strings: " + resultString);


        System.out.println("Enter three integers:");
        int num5 = scanner.nextInt();
        int num6 = scanner.nextInt();
        int num7 = scanner.nextInt();
        int resultInt3 = lab.sum(num5, num6, num7);
        System.out.println("Sum of three integers: " + resultInt3);


        System.out.println("Enter three decimal numbers:");
        double num8 = scanner.nextDouble();
        double num9 = scanner.nextDouble();
        double num10 = scanner.nextDouble();
        double resultDouble3 = lab.sum(num8, num9, num10);
        System.out.println("Sum of three doubles: " + resultDouble3);

        System.out.println("Enter three strings:");
        scanner.nextLine();
        String str3 = scanner.nextLine();
        String str4 = scanner.nextLine();
        String str5 = scanner.nextLine();
        String resultString3 = lab.sum(str3, str4, str5);
        System.out.println("Concatenation of three strings: " + resultString3);

    }
}
