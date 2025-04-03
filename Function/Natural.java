public class Natural
{
    static int add(int start,int end)
    {
        int sum1=0;
        for (int i=start;i<=end;i++ )
        {
            sum1=sum1+i;
        }
        return sum1;
    }
    public static void main(String[] args) 
    {
        int start=5;
        int end=15;
        System.out.println(add(start,end));
    }
}