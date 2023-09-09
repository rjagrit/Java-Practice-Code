//Java Program to Check Whether a Given Number is Even or Odd
import java.util.Scanner;
public class EvenOdd
{
    public static void main(String [] args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        int num= obj.nextInt();
//        if the number divided by 2 and get remainder zero then that number is even, otherwise it is odd
        if (num%2==0)
        {
            System.out.println(num+" is an Even Number");
        }
        else {
            System.out.println(num+" is an Odd Number");
        }
    }
}
