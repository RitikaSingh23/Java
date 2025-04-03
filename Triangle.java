import java.util.Scanner;
public class Triangle 
{
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter three sides of triangle");
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a==b&&a==c)
        {
            System.out.println("Equalateral");
        }
        else{
            System.out.println("not");
        }
    }
}  
}
