/*
1) Divisor is the number that used for divinding any particular provided numberal.
2) Dividend is the number that was divided by the Divisor

 */
import java.util.Scanner;
public class GeneralDivisibiltyCheck {
    public static void main(String[] args) {
        int divisor, dividend;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the divisor:");
        divisor = s.nextInt();
        System.out.print("Enter the dividend:");
        dividend = s.nextInt();
        if (dividend % divisor == 0) {
            System.out.println(dividend + " is divisible by " + divisor);
        } else {
            System.out.println(dividend + " is not divisible by " + divisor);
        }
    }
}

