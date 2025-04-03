public class First 
{
    public static void main(String[] args) 
    {
        //As a variable
        String a ="Ritika";
        System.out.println(a);

        //As an object
        String obj=new String("Singh");
        System.out.println(obj);

        //As an array
        char arr[]={'a','b','c'};
        System.out.println(arr);

        //As an object in an array
        char arr1[]={'d','e','f'};
        String obj1=new String(arr1);
        System.out.println(obj1);
    }
}
