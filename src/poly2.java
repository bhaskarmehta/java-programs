public class poly2
{
    void run()
    {
        System.out.println("Method overriding is applying in this ");
    }
}
class poly3 extends poly2
{
    void run()
    {
        System.out.println("This is the second class of method overriding");
    }
    public static void main(String []args)
    {
        poly2 p2=new poly2();
        p2.run();
        poly3 p3=new poly3();
        p3.run();
    }
}
