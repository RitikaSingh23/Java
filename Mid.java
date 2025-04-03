import java.util.Scanner;
public class Mid
{
 public static void main(String[] args) 
 {
    try (Scanner sc = new Scanner(System.in)) {
      int c1,c2,c3,c4;
       System.out.println("Enter num1");
       c1=sc.nextInt();
       System.out.println("Enter num2");
       c2=sc.nextInt();
       System.out.println("Enter num3");
       c3=sc.nextInt();
       System.out.println("Enter num4");
       c4=sc.nextInt();
       String res;
       res=(((c1+c4)/2)==((c3+c2)/2))?"Midpoint":"not";
       System.out.println(res);
   }
 }   
}
