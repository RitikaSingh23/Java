import java.util.Scanner;
public class Series 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter series of numbers ");
        double n1,n2,n3,n4;
        n1=sc.nextDouble();
        n2=sc.nextDouble();
        n3=sc.nextDouble();
        n4=sc.nextDouble();
        double mid;
        if((n2!=0 && n3!=0)||(n1!=0 && n4!=0))
        {
            mid = (n2+n3)/2;
            System.out.println(mid);
        }
        else
        {
            System.out.println("Not a series");
        }
        sc.close();
    }    
}
