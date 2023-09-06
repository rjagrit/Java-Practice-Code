import java.util.Scanner;

//Checking number is a palindrome or not
public class Palindrome
{
    public static void main(String args[])
    {
        int r,sum=0,temp;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        temp=n;

        while(n>0)
        {
            r= n % 10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("Yes it is a palindrome number ");
        else
            System.out.println("No it is not a palindrome number");
    }

}
