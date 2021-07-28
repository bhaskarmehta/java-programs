interface I1
{
    void run();
    default void show()
    {
        System.out.println("We are using default keyword");
    }
    static void read()
    {
        System.out.println("We are using static method ");
    }
}
interface I2
{
    void display();
    private void display1(){
        System.out.println("Private method in interface");
    }
}
class inter1 implements I1,I2
{
    public void run()
    {
        System.out.println("We are studying interface");
    }
    public void display()
    {
        System.out.println("Implementing multiple inheritance in java");
    }
    public static void main(String []args)
    {
        inter1 i1=new inter1();
        i1.run();
        i1.show();
        i1.display();

    }
}
