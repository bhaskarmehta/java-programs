class Pattern10
{
    public static void main(String []args)
    {
        int i,j,k;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                    if(i==j)
                        System.out .print("*");
                    else
                        System.out.print(" ");

            }
            System.out.println();
        }
    }
}
