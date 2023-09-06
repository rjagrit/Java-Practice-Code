import java.util.Scanner;
import java.lang.Math.*;

//Q. Use comparison operator to find out whether a given number is greater than user eneterd number or not.
//Can we compare int type with float type
public class NumCompare
{

    public static void main(String [] args)
    {
        int max,min,uNum;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the range in which you guess the number");
        System.out.print("Enter the min number:");
        min=obj.nextInt();
        System.out.print("Enter the max number:");
        max=obj.nextInt();
        System.out.print("Enter the number you want to compare:");
        uNum=obj.nextInt();
        int range=max-min+1;
        int cpNum= (int)(Math.random()*range);
        System.out.println("Computer genearted number is "+cpNum);
        /*-----Comparison Code---------*/
        if(uNum>cpNum)
        {
            System.out.println("User Number is greater than Computer Generated Number");
        }
        else
        {
            System.out.println("User Number is less than Computer Generated Number");
        }
    }
}
