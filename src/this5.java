public class this5
{
    this5()
    {
        this(10);
        System.out.println("No argument constructor");
    }
    this5(int x)
    {
        System.out.println("Parameterized constructor");
    }
    public static void main(String []args)
    {
        this5 t5=new this5();
    }
}
