class encap {
    private int age;

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

}
class encap1
{
    public static void main(String []args)
    {
        encap e=new encap();
        e.setAge(21);
        System.out.println(e.getAge());
    }
}
