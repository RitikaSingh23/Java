import java.util.Scanner;
public class Compare 
{
    public static void main (String arg[])   
    {
        String temp;
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter a first word");
        String word1=sc.nextLine();
        System.out.println("Enter a Second word");
        String word2=sc.nextLine();
        System.out.println("Enter a third word");
        String word3=sc.nextLine();
        if(word1.compareToIgnoreCase(word2)>0)
        {
            temp=word1;
            word1=word2;
            word2=temp;
        }
        if(word1.compareToIgnoreCase(word3)>0)
        {
            temp=word1;
            word1=word3;
            word3=temp;
        }
        if(word2.compareToIgnoreCase(word3)>0)
        {
            temp=word2;
            word2=word3;
            word3=temp;
        }
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        sc.close();
    }
}
