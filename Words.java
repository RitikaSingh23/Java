import java.util.Scanner;
public class Words 
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number ");
       int nume,num2=0;
       int d;
       nume=sc.nextInt();
       while(nume>0)
       {
        d=nume%10;
        num2=num2*10+d;
        nume=nume/10;
       }
        while(num2>=0)
        {
            d=num2%10;
            if(d==1)
            {
                System.out.print("one ");
            }
            else if(d==2)
            {
                System.out.print("Two ");
            }
            else if(d==3)
            {
                System.out.print("Three ");
            }
            else if(d==4)
            {
                System.out.print("Four ");
            }
            else if(d==5)
            {
                System.out.print("Five ");
            }
            else if(d==6)
            {
                System.out.print("Six ");
            }
            else if(d==7)
            {
                System.out.print("Seven ");
            }
            else if(d==8)
            {
                System.out.print("Eight ");
            }
            else if(d==9)
            {
                System.out.print("Nine ");
            }
            num2=num2/10;
        }
        sc.close();
   }
}
