class Animal
{
    void eat()
    {
        System.out.println("eating...");
    }
}
class dog extends Animal
{
    void bark()
    {
        System.out.println("barking...");
    }
}
class babydog extends dog
{
    void weep()
    {
        System.out.println("weeping...");
    }
}
class multilevel_inheritance
{
    public static void main(String args[])
    {
        babydog b=new babydog();
        b.weep();
        b.bark();
        b.eat();
    }
}