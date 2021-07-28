public class this4
{
    void run()
    {
        System.out.println("Hello");
    }
    void display()
    {
        this.run(); // run();
    }
    public static void main(String []args)
    {
        this4 t4=new this4();
        t4.display();
    }
}
