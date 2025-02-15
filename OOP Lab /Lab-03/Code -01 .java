public class Method {
    int sum(int x,int y)
    {
        return x+y;
    }
    double sum(double x,double y)
    {
        return x+y;
    }
    String sum(String x,String y)
    {
        return x+y;
    }
    //for 3
    int sum(int x,int y,int z)
    {
        return x+y+z;
    }
    double sum(double x,double y,double z)
    {
        return x+y+z;
    }
    String sum(String x,String y,String z)
    {
        return x+y+z;
    }

    public static void main(String[]args){
        Method lab=new Method();
        int num=lab.sum(8,5);
        double num2=lab.sum(2.2,4.3);
        String num3=lab.sum("Maruf ","Bayzid");

        int num4=lab.sum(8,5,7);
        double num5=lab.sum(2.2,4.3,9.7);
        String num6=lab.sum("Maruf ","Bayzid","Rafi");

        System.out.println();
        System.out.println("int: " + num);
        System.out.println("double : " + num2);
        System.out.println("String : " + num3);

        System.out.println();
        System.out.println("its 3 int: " + num4);
        System.out.println("its 3 double : " + num5);
        System.out.println("its 3 String : " + num6);
    }
}
