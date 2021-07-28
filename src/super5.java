public class super5
{
    super5()
    {
        System.out.println("In parent class");
    }
}
class super6 extends super5
{
    super6()
    {
        super();
        System.out.println("In child class");

    }
    public static void main(String []args)
    {
        super6 s6=new super6();
    }
}
