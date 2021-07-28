class A
{
    private int data=40;
    private A()
    {
        System.out.println("This is private constructor");
    }
    private void run()
    {
        System.out.println("Value is" +data);
    }
    public static void main(String []args)
    {
        A a=new A();
        System.out.println(a.data);
        a.run();
    }
}
// class access1
// {
   // public static void main(String []args)
    //{
       // A a=new A();
        // System.out.println(a.data);  Compile time error
       // a.run();  Compile time error
   // }
// }
