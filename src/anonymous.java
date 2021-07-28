class anonymous
{
    public static void main(String []args)
    {
        anonymous.sum(new int[]{10,20,30});
    }
    static void sum(int[] a)
    {
        int total=0;
        for(int i:a)
        {
            total+=i;
        }
        System.out.println(total);
    }
}
