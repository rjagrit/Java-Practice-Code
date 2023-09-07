import java.util.Scanner;
public class ArrayIndexFinder
{
    public static void main(String [] args)
    {
        int find=0;
        int size,flag=0;
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter Size of an Array:");
        size= obj.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Elements of an Array");
        for(int i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.print("Enter Element you want to search in an Array:");
        int search=obj.nextInt();

        for(int i=0;i<size;i++)
        {
            if(arr[i]==search)
            {
                find=i;
                flag=1;
            }
        }
        if (flag==1)
        {
            System.out.print("Element founded at postion:"+find+1);
        }
        else
        {
            System.out.println("Element not founded in array");
        }
    }
}
