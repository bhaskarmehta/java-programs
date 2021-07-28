public class selection
{
    public static void main(String []args)
    {
        int[] a={36,19,29,57,2,12,5};
        int temp;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0+i;j<a.length-1;j++)
            {
                int var=0+i;
                if(a[var]>a[j+1])
                {
                    temp=a[var];
                    a[var]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
