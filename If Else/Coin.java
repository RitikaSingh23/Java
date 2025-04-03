import java.util.Scanner;
public class Coin 
{
    public static void main(String[] args) 
    {
      Scanner sc= new Scanner(System.in);
      int a,b,c;
      System.out.println("Enter the values of three coins 1 for head and 0 for tail");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      int sum = a+b+c;
      if(sum==3)
      {
          System.out.println("Head");
      }
      else if (sum==2)
      {
          System.out.println("Tail");
      }
      sc.close();
    }    
}
