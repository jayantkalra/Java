import java.util.Scanner;
class animal
{
    public int breed;
    public int color;
    public void speak()
    {
        System.out.println("languages");
    }
}
class dog extends animal
{
    public void speak()
    {
        System.out.println("woof");
    }
}
class cat extends animal
{
    public void speak()
    {
        System.out.println("meow");
    }
}
class main
{
    public static void main(String[] args)
    {
        animal a=new animal();
        a.speak();
        a=new dog();
        a.speak();
        a=new cat();
        a.speak();
    }
}