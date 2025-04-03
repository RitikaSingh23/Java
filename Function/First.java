/*------------------------------return type-------------------------------- */
// public class First 
// {
//     static int sum() // return type function
//     {
//         int a=5,b=6;
//         int c=a+b;
//         return c;
//     }    
//     public static void main(String[] args) 
//     {
//         System.out.println(sum());    
//     }
// }


/*-----------------------------non-return type---------------------------------*/
// public class First 
// {
//     static void sum() // non-return type function
//     {
//         int a=5,b=6;
//         int c=a+b;
//         System.out.println(c);
//     }    
//     public static void main(String[] args) 
//     {
//         sum();    
//     }
// }


/*--------------------with parameter non return---------------------------------- */
// public class First 
// {
//     static void sum(int a, int b) // non-return type function
//     {
//        System.out.println(a+b);
//     }    
//     public static void main(String[] args) 
//     {
//         int a=10;
//         int b=5;
//         sum(a,b);    
//     }
// }

/*----------------------with parameter return type--------------------------------------- */
public class First 
{
    static int sum(int a, int b) // return type function
    {
       return a+b;
    }    
    public static void main(String[] args) 
    {
        int a=10;
        int b=5;
        System.out.println(sum(a,b));    
    }
}