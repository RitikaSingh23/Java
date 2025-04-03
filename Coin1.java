import java.util.Scanner;
public class Coin1 
{
 public static void main(String[] args) 
 {
    try (Scanner sc = new Scanner(System.in)) {
        int c1,c2,c3;
        System.out.println("Enter the result of coin1  1 for head 0 for tail");
        c1=sc.nextInt();
        System.out.println("Enter the result of coin2  1 for head 0 for tail");
        c2=sc.nextInt();
        System.out.println("Enter the result of coin3  1 for head 0 for tail");
        c3=sc.nextInt();
        int c;
        c=c1+c2+c3;
        if(c==3)
        {
            System.out.println("head");
        }
        else
        {
            System.out.println("tail");
        }
    }
    
 }   
}
