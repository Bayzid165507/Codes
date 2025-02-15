public class Main{

    public static void main(String[] args)

    {
        int a[]={5,7,8,11,17,40};
        int sum=0;
        int avarage=0;
        //Sum Start Here
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            avarage=sum/a.length;
            if(a[i]%2==0)
            {
                System.out.println(a[i]+" This is even");
            }
            else{
                System.out.println(a[i]+" This is ODD");
            }
        }
        System.out.println("\n");
        System.out.println("This is Sum "+sum);
        System.out.println("This is avarage "+avarage);
        //Avarage Start here

    }
}