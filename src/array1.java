public class array1
{

    public static void main(String []args)
    {
        System.out.println("Hello");
        int[] a={10,20,30};
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Using for-each loop");
        for(int i:a)
        {
            System.out.println(i);
        }


    }
}
