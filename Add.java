import java.util.Scanner;
public class Add
{
public static void main(String args[])
{
try (Scanner obj = new Scanner(System.in)) {
    int a;
    System.out.println("Enter first number");
    a=Integer.parseInt(obj.nextLine());
    System.out.println("Enter second number");
    int b;
    b=Integer.parseInt(obj.nextLine());
    int c;
    c=a+b;
    System.out.println("The sum of two number is =" +c);
} catch (NumberFormatException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
}
}