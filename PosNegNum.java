import java.util.Scanner;
public class PosNegNum
{
    public static void main(String [] args)
    {
    Scanner obj= new Scanner(System.in);
    System.out.print("Enter only integers that you want to check: ");
    int num= obj.nextInt();
    if(num<0)
        {
         System.out.print(num+" is negative number");
        }
    else
        {
            System.out.print(num+" is positive number");
        }
    }
}
