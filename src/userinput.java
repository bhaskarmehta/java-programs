import java.util.Scanner;

class User_Input
{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Name:");
        String name=s.next();
        System.out.println("Your name is:" +name);
        System.out.print("Enter Your Gender :");
        String gender=s.next();
        System.out.print("Your Gender is:" +gender);

    }
}
