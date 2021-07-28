public class selection_stri
{
    public static void main(String []args)
    {
        String[] a={"bhaskar","mehta","raju","mahto"};
        String temp;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0+i;j<a.length-1;j++)
            {
                int var=0+i;
                if(a[var].compareTo(a[j+1])>0)
                {
                    temp=a[var];
                    a[var]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] +" ");
        }
    }
}
