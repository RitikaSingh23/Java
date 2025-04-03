public class First 
{
    public static void main(String Args[])
    {
        int a=5,b=5;
        String result;
        result= switch(a+b)
        {
            case 10 ->"10";

            case 20->"20";

            default->"Invalid";
        };
        System.out.println(result);
    }
}