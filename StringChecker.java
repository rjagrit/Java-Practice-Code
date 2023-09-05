class StringChecker
{
    public static void main(String []args){
        String s="uiet is an Engineering college since 2004";
        s=s.toLowerCase();
        int v=0,c=0,d=0,u=0;
        char arr[]= new char[s.length()];
        for (int i=0;i<s.length();i++)
        {
//            storing each word at the index values
            arr[i]=s.charAt(i);
        }
        for (int i=0;i<s.length();i++)
        {
//            storing each word at the index values
            if(arr[i]>='a' && arr[i]<='z')
            {
                if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                    v++;
                } else {
                    c++;
                }
            }
            else if(arr[i]>='0' && arr[i]<='9')
            {
                d++;
            }
            else if(arr[i]==' ')
            {
                u++;
            }
        }
        System.out.println(v);
        System.out.println(c);
        System.out.println(d);
        System.out.println(u);
    }
}
