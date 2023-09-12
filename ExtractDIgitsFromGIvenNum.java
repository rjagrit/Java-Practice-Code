import java.util.Scanner;
public class ExtractDIgitsFromGIvenNum
{
    int num,counter=0;
    int counter(int n)
    {
        while(n>0)
        {
            n= n/10;
            counter++;
        }
        return counter;
    }
    public static void main(String [] args)
    {
        int num,a;
        Scanner obj=new Scanner(System.in);
        ExtractDIgitsFromGIvenNum obj1=new ExtractDIgitsFromGIvenNum();
        System.out.print("Enter the Number:");
        num=obj.nextInt();
        int position=obj1.counter(num);

        while(num>0)
        {
            a= num % 10;
            System.out.println(a+" is at position "+position);
            num= num /10;
            position--;
        }

    }
}
