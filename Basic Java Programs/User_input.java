import java.util.Scanner;
public class User_input
{
     public static void main(String args[])
{
    int number;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter your number: ");
    number=s.nextInt();

    System.out.println("Your number is: " +number);
}
}