import java.util.Scanner;
public class LargestAmongThree
{
    public static void main(String [] args)
    {
        int a,b,c;
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter first integer:");
        a=obj.nextInt();
        System.out.print("Enter second integer:");
        b=obj.nextInt();
        System.out.print("Enter third integer:");
        c=obj.nextInt();

        if(a>b && a>c)
        {
            System.out.print(a+" is greater than "+b+" and "+c);
        }
        else if(b>c &&  b>a)
        {
            System.out.print(b+" is greater than "+c+" and "+a);
        }
        else
        {
            System.out.print(c+" is greatest one");
        }
    }
}
