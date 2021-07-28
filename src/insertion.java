public class insertion
{
    public static void main(String []args)
    {
        int[] a={30,10,45,35,40};
        int temp;
        for(int i=0;i<a.length;i++)
        {
            for(int j=1;j<a.length;j++)
            {
                int temp1=i+j;
                while(a[j]<a[i])
                {
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;


                }
            }
        }


        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }





    }
}
