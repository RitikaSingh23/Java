import java.util.Scanner;
public class Input
{
public static void main(String arg[])
{
try (Scanner obj = new Scanner(System.in)) {
    int age;
    String name;
    System.out.println("Enter your Name");
    name=obj.nextLine();
    System.out.println("Enter your Age");
    age=Integer.parseInt(obj.nextLine());
    System.out.println("Your name and age is"+" "+name+" "+age);
} catch (NumberFormatException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
}
}