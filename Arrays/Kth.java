import java.util.Scanner;
public class Kth 
{
    public static void main(String[] args) 
    {
        int[] arr=new int[]{4,67,58,24,88,99};
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the which largest or smallest value you want");
        int k=sc.nextInt();

        // for kth smallest value

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>=arr[j])
                {
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The "+k+"th smallest value in the array is = "+arr[k-1]);

        // for kth largest value

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<=arr[j])
                {
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The "+k+"th largest value in the array is = "+arr[k-1]);
        sc.close();
    }    
}
