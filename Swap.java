import java.util.Scanner;
public class Swap
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        int fnum,snum, swap;
        System.out.print("Enter 1st Number: ");
        fnum= obj.nextInt();
        System.out.print("Enter 2nd Number: ");
        snum= obj.nextInt();
        System.out.println("Before swapping");
        System.out.println("2nd number is "+snum);
        System.out.println("1st number is "+fnum);
        /*---swapping code-------*/
        swap=fnum;
        fnum=snum;
        snum=swap;
        /*----------------------*/
        System.out.println("After swapping");
        System.out.println("1st number is "+fnum);
        System.out.println("2nd number is "+snum);
    }
}
