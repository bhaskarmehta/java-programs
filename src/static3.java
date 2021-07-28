public class static3
{
    static int count=0;
    static3()
    {
        count+=1;
    }
    public static void main(String []args)
    {
        static3 s1= new static3();
        static3 s2 =new static3();
        static3 s3 =new static3();
        static3 s4 =new static3();
        System.out.println(static3.count);
    }


}
