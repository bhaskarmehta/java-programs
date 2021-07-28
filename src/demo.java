 class Employee
 {
     void name()
     {
         int i;
         for(i=0; i<5; i++)
         {
             if(i==3)
             {
                 break;
             }
             else
             {
                 System.out.println("My name is Bhaskar Mehta " + i + "times");
             }
         }

     }
 }
 class Student
 {
     void read()
     {
         int j=0;
         do
         {
             System.out.println("We are reading");
             j++;

         }while (j<0);
     }

 }
 class Test
 {
     void test()
     {
         char x='b';
         switch(x)
         {
             case 'c':System.out.println("Value is 1");
                        break;
             case 98:System.out.println("Value is 4");
                        break;
             case 'd':System.out.println("Value is 7");
                        break;
             default:System.out.println("Value is not present");
         }
     }
 }
 class demo {
    public static void main(String args[])
    {
        System.out.println("Hello");
        Employee e= new Employee();
        e.name();
        demo d=new demo();
        d.run();
        Student s=new Student();
        s.read();
        Test t=new Test();
        t.test();

    }
    void run()
    {
        System.out.println("We are running");
    }

}
