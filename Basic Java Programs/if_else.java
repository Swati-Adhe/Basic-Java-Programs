import java.util.Scanner;
public class if_else 
{
    public static void main(String args[])
    {
        int score;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your score: ");
        score=s.nextInt();

        if(score>=35)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }
    
}
