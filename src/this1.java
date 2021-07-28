class This
{
    int a;
    int b;
    void run(){
        System.out.println("Values are "+a + " and "+b);
    }
}
class this1
{
    public static void main(String []args)
    {
        This t1=new This();
        t1.a=23;
        t1.b=44;
        t1.run();
    }
}
