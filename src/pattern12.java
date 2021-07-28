class Pattern12
{
    public static void main(String []args)
    {
        int i, j, k,l;
        for (i = 1; i <= 4; i++)
        {

            for(k=1 ;k<=i;k++)
            {
                if(k==i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (j = 4; j >= i; j--)
            {
                if (i >= 1 && i < j)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();


        }



    }
}
