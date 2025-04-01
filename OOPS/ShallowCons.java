class Two
{
    int b;
    Two(int b)
    {
        this.b=b;
    }
    Two(Two obj)
    {
        this.b=obj.b;
    }
    void display()
    {
        System.out.println(b);
    }
}

public class ShallowCons 
{
    public static void main(String[] args) 
    {
        Two obj=new Two(10);
        Two obj1=new Two(obj);
        obj.display();
        obj1.display();
        obj.b=18;
        obj.display();
        obj1.display();
        
    }    
}
