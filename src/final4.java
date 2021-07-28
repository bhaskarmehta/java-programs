 final class final4
{
   void run()
   {
       System.out.println("Final class 1");
   }
}
class final5 //extends final4 we cannot inherit final class
{
    public static void main(String []args)
    {
        final4 f5=new final4();
        f5.run();
    }
}
