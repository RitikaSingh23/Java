import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter Number");
        int num;
        num=sc.nextInt();
        if(num%2==0&&num%4==0&&num%8==0)
        {
            System.out.println("Divisible by 2, 4 ,8 ");
        }
        else
        {
            System.out.println("divisible by 8");
        }
        sc.close();
    }
}   
}
