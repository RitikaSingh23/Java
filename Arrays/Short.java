public class Short 
{
    public static void main(String[] args) 
    {
        int[] arr=new int[]{45,8,21,76,99,34,75,0};
        System.out.println("Before shorting array is");

        // for printing the actual array

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        // for acending order 

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>=arr[j])
                { 
                    int temp;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Array in acending order");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        //for decending order

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<=arr[j])
                {
                    int temp;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Array in decending  order");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
