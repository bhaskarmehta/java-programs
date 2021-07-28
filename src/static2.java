public class static2
{
    int emp_id;
    String name;
    String cn="JMK";
    static2(int em_id,String name)
    {
        emp_id=em_id;
        this.name=name;

    }
    void display()
    {
        System.out.println("Emp_id:"+emp_id +" Name:"+name+" Company name:"+cn);
    }
    public static void main(String args[])
    {
        static2 s2=new static2(102,"Bhaskar");
        s2.display();
        static2 s3=new static2(103,"Mehta");
        s3.display();
    }
}
