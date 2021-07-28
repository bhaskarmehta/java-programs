public class static4
{
    static void run()
    {
        System.out.println("We are creating static method");
    }
    public static void main(String []args)
    {
        run(); // Or static4.run();
        static5.show();
    }
}
class static5
{
    static void show()
    {
        System.out.println("Another class ");
    }
}
