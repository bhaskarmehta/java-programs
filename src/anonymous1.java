public class anonymous1
{
    public static void main(String []args)
    {
        anonymous1.sum(new int[][]{{10,20,30},{40,50}});
    }
    static void sum(int[][] a)
    {
        int total=0;
        for(int[] x:a)
        {
            for(int y:x)
            {
                total+=y;
            }
        }
        System.out.println(total);
    }
}
