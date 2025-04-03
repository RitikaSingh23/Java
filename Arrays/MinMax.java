 public class MinMax
{
    public static void main(String[] args) 
    {
        int[] arr=new int[]{3,8,45,76,2,1};
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>=arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("Minimum Value in the array is= "+min);
        for(int i=0;i<arr.length;i++)
        {
            if(max<=arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum Value in the array is= "+max);
    }
}