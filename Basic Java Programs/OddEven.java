import java.util.Scanner;
public class OddEven 
{
    public static void main(String args[])
    {
        int number;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        number=s.nextInt();

        if(number%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
    
}
