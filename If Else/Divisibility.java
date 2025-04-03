import java.util.Scanner;
public class Divisibility 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a numbr");
        int num;
        num=sc.nextInt();
        if((num%2==0 && num%4==0 && num%6==0) && num%8!=0)
        {
            System.out.println("Divisible by 2,4,6 But not divisibil by 8");
        }
        else
        {
            System.out.println("Divisible by 8");
        }
        sc.close();
    }   
}
