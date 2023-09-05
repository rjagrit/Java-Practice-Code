import java.util.Scanner;

public class PercentageMarks
{
 public static void main(String [] args)
    {
    int m=100,total;
    float sum=0,percentage;
    Scanner obj= new Scanner(System.in);
    System.out.print("Enter number of Subjects:");
    int sub=obj.nextInt();
    float[] arr=new float[sub];
    System.out.println("Now write Subject Marks");
    total=sub*m;
    for(int i=1;i<sub;i++)
    {
       System.out.println("Marks of Sub"+i+":");
       arr[i]=obj.nextInt();
       sum=sum+arr[i];
    }
    for(int i=1;i<sub;i++)
    {
       System.out.println("Marks of Sub"+i+":"+arr[i]);
    }
    percentage=(sum/total)*100;
    System.out.println("Percentage of"+sub+" subjects is "+percentage);
    }
}
