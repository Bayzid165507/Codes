public class Book {
    String Author;
    String Title;
    int price;
    public Book()
    {
        Author="Bayzid";
        Title="The Chung chang ";
    }
    public Book(String auth,String title,int pr)
    {
        Author=auth;
        Title=title;
        price=pr;
    }
    public Book(String auth,String title)
    {
        Author=auth;
        Title=title;

    }
    public static void main(String[]args)
    {
        System.out.println();
        Book book1=new Book();
        System.out.println(book1.Title +"-"+book1.Author);
        System.out.println();
        System.out.println("This is with Price ");
        Book book2=new Book("Rafi","The Proud ",40);
        System.out.println(book2.Title +"-"+book2.Author+book2.price);
        System.out.println();
        Book book3=new Book("Topo","The Books of Heaven ");
        System.out.println(book3.Title +"-"+book3.Author);
    }
}
