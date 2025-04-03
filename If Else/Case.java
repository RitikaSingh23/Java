import java.util.Scanner;
public class Case 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char chh;
        chh = sc.next().charAt( 0 );
        if(chh>=65 && chh<=90)
        {
            System.out.println(" lower case = "+ Character.toLowerCase(chh));
        }
        else if(chh>=97 && chh<=122)
        {
            System.out.println(" Upper Case = "+ Character.toUpperCase(chh));
        }
        sc.close();
    }
    
}
