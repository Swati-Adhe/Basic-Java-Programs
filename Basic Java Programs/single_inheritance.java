class  Animal
{
    void eat()
    {
        System.out.println("Eating...");
    }
}
class dog extends Animal
{
    void bark()
    {
        System.out.println("barking...");
    }
}
class single_inheritance
{
    public static void main(String args[])
    {
        dog d=new dog();
        d.bark();
        d.eat();
    }
}
