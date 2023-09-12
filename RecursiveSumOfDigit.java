import java.util.Scanner;
public class RecursiveSumOfDigit
{
    int sum;
    public static void main(String [] args)
    {
        int num;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the number:");
        num=obj.nextInt();
        RecursiveSumOfDigit object= new RecursiveSumOfDigit();
        int a=object.add(num);
        System.out.println("Sum:"+a);
    }
    int add(int n)
    {
        sum = n % 10;
        if(n==0)
        {
            return 0;
        }
        else
        {
            return sum + add(n/ 10);
        }
    }
}
