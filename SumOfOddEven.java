//Java Program to Find the Sum of Even and Odd Numbers
import java.util.Scanner;
public class SumOfOddEven
{
    public static void main(String [] args)
    {
        int sumEven=0,sumOdd=0,sid,eid,i;
        System.out.println("Enter the range of numbers");
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter staring number:");
        sid=obj.nextInt();
        System.out.print("Enter ending number:");
        eid=obj.nextInt();

        for(i=sid;i<eid;i++)
        {
            if(i%2==0)
            {
                sumEven+=i;
            }
            else {
                sumOdd+=i;
            }
        }
        System.out.println("Sum of Even Numbers between "+sid+" and "+eid+":"+sumEven);
        System.out.println("Sum of Odd Numbers between "+sid+" and "+eid+":"+sumOdd);
    }
}
