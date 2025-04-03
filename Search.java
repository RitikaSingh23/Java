import java.util.Scanner;
public class Search 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        int count = 0;
        for (int i = 0; i < word.length(); i++) 
        {
            if (word.charAt(i) == 'n' || word.charAt(i) == 'N') 
            {
                count++;
            }
        }
        if (count > 0) 
        {
            System.out.println("Letter found");
        } else 
        {
            System.out.println("letter not found");
        }
        sc.close();
    }
}

