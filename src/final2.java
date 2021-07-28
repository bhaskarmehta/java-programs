public class final2
{
    final void run()
    {
        System.out.println("Use of final in method");
    }
}
class final3 extends final2
{
   // void run()
    // {
    //    System.out.println("Use of final in same class");
    // }
    public static void main(String []args)
    {
       // final2 f2=new final2();
       // f2.run();
        final3 f3 =new final3();
        f3.run();
    }
}
