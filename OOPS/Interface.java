//It is a blue print of class 

// interface One
// {
//     void on();
// }
// public class Interface implements One 
// {
//     public void on()
//     {
//         System.out.println("Tv is on");
//     }
//     public static void main(String[] args) 
//     {
//         Interface obj=new Interface();
//         obj.on();   
//     }     
// }




//like a  multiple inheritace in interface

// interface One
// {
//     void on();
// }
// interface Two
// {
//     void of();
// }
// public class Interface implements One,Two
// {
//     public void on()
//     {
//         System.out.println("Tv is on");
//     }
//     public void of()
//     {
//         System.out.println("Tv is off");
//     }
//     public static void main(String[] args) 
//     {
//         Interface obj=new Interface();
//         obj.on();
//         obj.of();   
//     }     
// }



// losse coupling

interface One
{
    void engine();
}
class car implements One
{
    public void engine()
    {
        System.out.println("Car engine on ");
    }
}
class scooter implements One
{
    public void engine()
    {
        System.out.println("scooter engine on ");
    }
}
class train implements One
{
    public void engine()
    {
        System.out.println("train engine on ");
    }
}
public class Interface 
{
    public static void main(String[] args) 
    {
        One obj =new car();
        obj.engine();
         
        One obj1 =new scooter();
        obj1.engine();

        One obj2 =new train();
        obj2.engine();
    }     
}