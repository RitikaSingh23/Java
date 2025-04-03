import java.util.Scanner;
public class Choice 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int ch;
            System.out.println("Do you want to choose Vegetable for 1 or Fruit for 2");
            ch=sc.nextInt();
            switch (ch) 
            {
                case 1:
                {
                   System.out.println("Choose Potato for 1 or tomato for 2");
                   ch=sc.nextInt();
                    switch (ch) 
                    {
                        case 1:
                            System.out.println("you have choose potato");
                            break;
                        case 2:
                            System.out.println("you have choose tomato");
                            break;
                        default:
                            System.out.println("Wrong input");
                            break;
                    }
                }      
                break;
                case 2:
                {
                   System.out.println("Choose Mango for 1 or Banana for 2");
                   ch=sc.nextInt();
                    switch (ch) 
                    {
                        case 1:
                            System.out.println("you have choose Mango");
                            break;
                        case 2:
                            System.out.println("you have choose Banana");
                            break;
                        default:
                            System.out.println("Wrong input");
                            break;
                    }
                }
                break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
            sc.close();
    }    
}
