public class super3
{
    void show()
    {
        System.out.println("Second use of Super Keyword");
    }
}
class super4 extends super3
{
    void show1()
    {

        System.out.println("Method in the same class");
        show();
    }
    public static void main(String []args)
    {
        super4 s4=new super4();
        s4.show1();
    }
}
