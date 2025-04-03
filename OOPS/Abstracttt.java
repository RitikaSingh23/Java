// abstract class One
// {
//     abstract void on();
//     abstract void of();
// }
// public class Abstracttt extends One
// {

//     void on()
//     {
//         System.out.println("Tv is on ");
//     }

//     void of()
//     {
//         System.out.println("Tv is off");
//     }

//     public static void main(String[] args) 
//     {
//         Abstracttt obj = new Abstracttt();
//         obj.on();
//         obj.of();
//     }    
// }

abstract class One
{
    abstract void on();
    abstract void of();
}

abstract class Two extends One
{
    abstract void clear();
}
public class Abstracttt extends Two 
{
    void clear()
    {
        System.out.println("Clear");
    }

    void on()
    {
        System.out.println("Tv is on ");
    }

    void of()
    {
        System.out.println("Tv is off");
    }
    
    public static void main(String[] args) 
    {
        Abstracttt obj = new Abstracttt();
        obj.on();
        obj.of();
        obj.clear();
    }    
}
