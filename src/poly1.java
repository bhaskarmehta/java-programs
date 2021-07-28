public class poly1
{
    String name;
    void run()
    {
        System.out.println("How are you bhaskar mehta");
    }
    void run(String s)
    {
        name=s;
        System.out.println("Hello "+name);
    }
    void run(int a,int b)
    {
        System.out.println("This is the class of integers");
    }
    public static void main(String []args)
    {
        poly1 p1=new poly1();
        p1.run();
        System.out.println("This is the border line");
        p1.run("Bhaskar");
        p1.run(3,4);
    }
}
