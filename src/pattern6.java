class Pattern6
{
    public  static void main(String []args)
    {
        int i,j,k;
        for(i=1;i<=4;i++)
        {
            for(j=3;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=3;i++)
        {
            for(k=1;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(j=3;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
