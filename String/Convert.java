public class Convert
{
    static void convert(String str1)
    {
        String res="";
        for(int i=0;i<str1.length();i++)
        {
            char c = str1.charAt(i);
            if (c>='a'&&c<='z')//Character.isLowerCase(c)
            {
                res=res+Character.toUpperCase(c);
                //System.out.print(Character.toUpperCase(c));
            }
            else
            {
                res=res+Character.toLowerCase(c);
                //System.out.print(Character.toLowerCase(c));
            }
        
        }
        System.out.print(res);
    }
    public static void main(String[] args) 
    {
        
        String stri="RItIkA";
        convert(stri);
    }
}
