
public class Main {
    public static void main(String[] args) {
        int a=7;
        int b=11;
        int c=2;
        int large=a;
        if(large<b)
        {
            large=b;
        }
        if(large<c)
        {
            large=c;
        }

        System.out.println("This is the largest Number "+large);
    }
}