class One
{
    int b;
    One(int a)
    {
        b=a;
        System.out.println(a);
    }
    One(One obj)
    {
        b=obj.b;
        System.out.println(b);
    }
}
public class Contructor
{
    public static void main(String[] args) 
    {
        One obj = new One(10);
        One obj1 =new One(obj);
    }
}