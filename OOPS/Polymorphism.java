//method overiding
class One
{
    void show()
    {
        System.out.println("one class");
    }
}


class Two extends One
{
    void show()
    {
        System.out.println("Two class");
    }
}

// public class Polymorphism extends Two
// {
//     public static void main(String[] args) 
//     {
//         Polymorphism obj=new Polymorphism();
//         obj.show();

//         One obj1 =new One();
//         obj1.show();
//     }
// }


// Object polymorphism 
public class Polymorphism extends Two
{
    public static void main(String[] args) 
    {
        One obj= new One();
        obj.show();

        One obj1= new Two();
        obj1.show();
    }
}