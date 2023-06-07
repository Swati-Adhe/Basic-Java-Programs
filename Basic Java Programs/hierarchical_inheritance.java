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
class cat extends Animal
{
    void meow()
    {
        System.out.println("meowing...");
    }
}
class hierarchical_inheritance
{
    public static void main(String args[])
    {
        cat c=new cat();
        c.meow();
        //c.bark();  //C.T error                              
        c.eat();
    }
}
