import java.util.Scanner;
public class Equalateral 
{
  public static void main(String[] args) 
  {
    Scanner sc= new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter the  three side of a triangle");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    if(a==b && a==c)
    {
        System.out.println("Equalateral triangle");
    }
    else
    {
        System.out.println("Not a equalateral triangle");
    }
    sc.close();
  }  
}
