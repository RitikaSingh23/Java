public class Diamond 
{
   public static void main(String[] args) 
   {
        int a=0;
        for(int i=1;i<=9;i++)
        {
            a=(i<=5)?++a:--a;
            for(int j=1;j<=9;j++)
            {
                if(j<=4+a && j>=6-a)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print( " ");
                }
            }
            System.out.println();
        }
   } 
}
