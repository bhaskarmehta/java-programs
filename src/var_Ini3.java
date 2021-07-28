public class var_Ini3
{
    String name;
    int age;
    var_Ini3(String name,int age)
    {
        this.name=name;
        this.age=age;

    }
    void display()
    {
        System.out.println("Name is :"+name + " and age is "+age);
    }
    public static void main(String []args)
    {
        var_Ini3 v3=new var_Ini3("Bhaskar Mehta",21);
        v3.display();
    }
}
