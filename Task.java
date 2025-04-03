import java.util.Scanner;
public class Task
{
    public static void main (String args[])
    {
        try (Scanner obj = new Scanner(System.in)) {
            int a ,b,c;
            System.out.println("Enter the lengths of a triangle");
            a=obj.nextInt();
            b=obj.nextInt();
            c=obj.nextInt();
            String res;
            res=(a==b && a==c)?"Equlateral Tringle":"Not";
            System.out.println(res);
        }
    }
}