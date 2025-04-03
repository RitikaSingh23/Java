public class Prymid 
{
    public static void main(String[] args) 
    {
        int i,j;
        // for(i=1;i<=5;i++)
        // {
        //     for(j=1;j<=9;j++)
        //     {
        //       if(j>=6-i && j<=4+i)
        //       {
        //         System.out.print("*");
        //       }
        //       else
        //       {
        //         System.out.print(" ");
        //       }
        //     }
        //     System.out.println();
        // }    
       int k;
        for(i=1;i<=5;i++)
        {
            for(k=1;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(j=5;j>=i;j--)
            {
                //if(c<=i)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
