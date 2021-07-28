class inheritance1
{
    String name;
    void run(String s)
    {
        name=s;
        System.out.println("Hello " +name );
    }
}
class B extends inheritance1
{
    public static void main(String []args)
    {
        B b=new B();
        b.run("Bhaskar");
    }
}
