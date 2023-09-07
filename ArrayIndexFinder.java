import java.util.Scanner;
/*
1) size variable will store the size of an array
2) flag variable will let us know that element that you want to search
 */
public class ArrayIndexFinder
{
    public static void main(String [] args) {
        int i, size, flag = 0;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Size of an Array:");
        size = obj.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements of an Array");
        for (i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }
        System.out.print("Enter Element you want to search in an Array:");
        int search = obj.nextInt();
        for (i = 0; i < size; i++) {
            if (arr[i] == search) {
                flag = 1;
                break;
            } else {
                flag = 0;
            }
        }
        if (flag == 1) {
            System.out.print("Element founded at postion:" + (i + 1));
        } else {
            System.out.println("Element not founded in array");
        }
    }
}
