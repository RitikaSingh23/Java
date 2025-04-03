class One
{
    private int a=10;

    void set(int a)
    {
        this.a=a;
    }

    void get()
    {
        System.out.println(this.a);
    }
}


public class Encapsulation extends One
{
    public static void main(String[] args) 
    {
        Encapsulation obj=new Encapsulation();
        obj.set(15);
        obj.get();
        
    }
}
