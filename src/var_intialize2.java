class var_intialize2
{
    String name;
    int age;
    void info(String s,int i)
    {
        name = s;
        age = i;
    }
    void display()
    {
        System.out .println("name is:"+name+ " and age is "+age );
    }


    public static void main(String []args)
    {
        var_intialize2 e=new var_intialize2();
        e.info("Mehta",21);
        e.display();

    }
}
