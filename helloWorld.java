public class helloWorld {
    public static void main(String [] args)
    {
//        System.out.println("Hello World");
        String s= "Hello World";
        int size= s.length();
        char[] arr= new char[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=s.charAt(i);
        }
        for(int i=0;i<= size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
