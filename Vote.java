import java.util.Scanner;
public class Vote
{
    public static void main(String Args[])
    {
      try (Scanner sc = new Scanner(System.in)) {
        int age;
         System.out.println("Enter your age");
         age=sc.nextInt();
         if(age>=18)
         {
          System.out.println("Eligible");
         }
         else
         {
          System.out.println("Eligible");
         }
      }
    }
}
