import java.util.Scanner;
public class if_else_if
{
    public static void main(String args[])
    {
        int marks;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your marks: ");
        marks=s.nextInt();

        if(marks>=35)
        {
            System.out.println("Pass");
        }
        else if(marks<35 && marks>0)
        {
            System.out.println("Fail");
        }
        else 
        {
            System.out.println("Not valid number");
        }
    }
    
}