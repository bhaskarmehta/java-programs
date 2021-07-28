class multiple_inher
{
    void run()
    {
        System.out.println("We are running");
    }
}
class d
{
    void run()
    {
        System.out.println("We are reading");
    }
}
class C extends multiple_inher
{
    public static void main(String []args)
    {
        C c=new C();
        c.run();


    }
}
