class diagonal
{
    public static void main(String []args)
    {
        int[][] a={{2,3,4},{5,6,7},{8,9,3}};
        int i,j,k;
        int s1=0;
        int s2=0;
        int s3;
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a.length;j++)
            {
                if(i==j)
                {
                    s1+=a[i][j];
                }

            }
        }
        for(i=0;i<a.length;i++)
        {
            for(k=0;k<a.length;k++)
            {
                if ((i+k)==a.length-1)
                    {
                         s2+=a[i][k];
                    }
            }
        }
        System.out.println(s1);
        System.out.println(s2);
        s3=s1-s2;
        if(s3<0)
        {
            s3=-s3;
        }
        System.out.println(s3);

    }
}
