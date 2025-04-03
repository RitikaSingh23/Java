import java.util.Scanner;
public class Temp 
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("choice 1 for Celsius and 2 for Farenhite");
        int ch= sc.nextInt();
        if(ch==1)
        {
            System.out.println("Enter the temperature to convert");
            double temp=sc.nextDouble();
            temp=temp*(9/5)+32;
            System.out.println("Temperature in Celsius " + temp);
        }
        else if(ch==2)
        {
            System.out.println("Enter the temperature to convert");
            double temp=sc.nextDouble();
            temp=temp*(5/9)-32;
            System.out.println("Temperature in Farenhite " + temp);
        }
        else
        {
            System.out.println("Wrong input");
        }
        sc.close();
    }
}
