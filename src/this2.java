class this3
{
    int i;
    void setVal(int i)
    {
        this.i=i; //i=i value will be 0
    }
    void show()
    {
        System.out.println(i);
    }
}
class this2
{
    public static void main(String []args)
    {
        this3 t3=new this3();
        t3.setVal(12);
        t3.show();
    }
}
