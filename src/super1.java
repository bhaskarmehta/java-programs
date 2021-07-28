public class super1
{
    int a=10;
}
class super2 extends super1
{
    int a=20;
    void show(int a)
    {
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
    public static void main(String []args)
    {
        super2 s2=new super2();
        s2.show(30);


    }
}
