//inheritance=property inherit parent/super class except private things or conctructor

// singel inheritance


// class One{
//     void show()
//     {
//         System.out.println("Hello");
//     }
// }

// public class Inheritance extends One
// {
//     public static void main(String[] args) {
//         Inheritance obj =new Inheritance();
//         obj.show();
//     }
// }


// multi level inheritance

// class One{
//     void show()
//     {
//         System.out.println("Hello");
//     }
// }

// class Two extends One{

// }

// public class Inheritance extends Two
// {
//     public static void main(String[] args) {
//         Inheritance obj =new Inheritance();
//         obj.show();
//     }
// }


//Hirerichal inheritance

// class One{ 
//     void show()
//     {
//         System.out.println("Hello");
//     }
// }

// class Two extends One{

// }

// public class Inheritance extends One
// {
//     public static void main(String[] args) {
//         Inheritance obj =new Inheritance();
//         obj.show();
//     }
// }

// inheritance = Is a Relationship (tightly coupling) 




// Association = has a Relationship (loosly coupling)
class One
{ 
    int a=5;
    void show()
    {
        System.out.println(a);
    }
}

class Two extends One
{

}
public class Inheritance extends Two
{
    public static void main(String[] args) {
        One obj =new One();
        obj.show();

        Two.obj1=new Two();
        obj1.a=10;
        obj1.show();
    }
}