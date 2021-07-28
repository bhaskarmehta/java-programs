public class constructor2
{
    String name;
    int age;
    constructor2(String s,int a)
    {
        this.name=s;
        this.age=a;
        System.out.println("Name is "+ name+ " and age is "+age);

    }
    public static void main(String []args)
    {
        constructor2 c2=new constructor2("Bhaskar",21);

    }
}
