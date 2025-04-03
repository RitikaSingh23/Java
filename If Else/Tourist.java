import java.util.Scanner;
public class Tourist 
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a website for tourism");
        String web=sc.nextLine();

        if(web.equalsIgnoreCase("www.tourism.com"))
        {
            System.out.println("Do youn want to visit International or Domestic");
            String ch=sc.nextLine();
            if(ch.equalsIgnoreCase("International"))
            {
                System.out.println("Do youn want to visit Japan or Russia");
                String v=sc.nextLine();
                if(v.equalsIgnoreCase("Japan"))
                {
                    System.out.println("You have pay 200rs");
                }
                else
                {
                    System.out.println("You have pay 300rs");
                }
            }
            else
            {
                System.out.println("Do youn want to visit Bhopal or Indore");
                String v=sc.nextLine();
                if(v.equalsIgnoreCase("Bhopal"))
                {
                    System.out.println("You have pay 100rs");
                }
                else
                {
                    System.out.println("You have pay 500rs");
                }
            }

        }
        
        else
        {
            System.out.println("Wrong input");
        }
        sc.close();
    }   
}
