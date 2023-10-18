import java.util.Scanner;
public class ArithmeticOperations
{

    public static void main(String [] args)
    {
        int fnum,snum,add,sub,mul,div,option,result;
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter first number:");
        fnum= obj.nextInt();
        System.out.print("Enter second number:");
        snum= obj.nextInt();

        while(true)
        {
            System.out.println("Operations are \n1.Addition\n2.Subtraction\n3.Multiplication\n1.Division");
            System.out.print("Your Option: ");
            option=obj.nextInt();

            switch (option)
            {
                case 1:
                    result = fnum+snum;
                    System.out.println("Addition of "+fnum+" and "+snum+" : "+result+"\n");
                    break;

                case 2:
                   result = fnum-snum;
                    System.out.println("Subtraction of "+fnum+" and "+snum+" : "+result+"\n");
                    break;

                case 3:
                    result = fnum*snum;
                    System.out.println("Multiplication of "+fnum+" and "+snum+" : "+result+"\n");
                    break;

                case 4:
                    result = fnum/snum;
                    System.out.println("Division of "+fnum+" and "+snum+" : "+result+"\n");
                    break;

                default:
                    System.exit(0);
            }

        }


    }
}
