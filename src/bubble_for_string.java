public class bubble_for_string
{
    public static void main(String []args)
    {
        String[] names = {"Bhaskar", "Mehta", "Raju", "Kumar","Mahte"};
        String temp;
        for (int i = 0; i < names.length; i++)
        {
            int flag = 0;
            for (int j = 0; j < names.length - 1 - i; j++)
            {
                if (names[j].compareTo(names[j + 1]) > 0)
                {
                    temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
    }
}
