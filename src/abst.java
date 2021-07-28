abstract class Vehicle
{
    int tyres;
    abstract void start();


}
class car extends Vehicle
{
    void start()
    {
        System.out.println("Start with key");
    }

}
class scooter extends Vehicle
{
    void start()
    {
        System.out.println("Start with kick");
    }
    public static void main(String []args)
    {

        car c=new car();
        c.tyres=4;
        System.out.println("Numbers of tyres is "+ c.tyres);
        c.start();
        scooter s=new scooter();
        s.start();
    }
}
