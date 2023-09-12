import java.util.Scanner;
public class IncrementEachByNum
{
    public static void main(String [] args)
    {

        int num,a;
        int store=0;
        int s=0; //variable s is used to store the number
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the Number:");
        num=obj.nextInt();
        System.out.println("Before Incrementing:"+num);
        while(num>0)
        {
            a = num % 10;
            a = a+1;
            store = store*10 + a;
            num = num / 10;
        }
        //after that you get incremented reverse number
        // we do below cuz we dont have enough memory for storing variable so we use the old variables
        num=store; //storing result numeral in num variable
        store=0;
        //a automatically set to zero cuz number divided by same number we get remainder zero
        while(num>0)
        {
            a = num % 10;
            store = store *10+a;
            num= num/10;
        }
        System.out.println("After Incrementing:"+store);

    }
}
