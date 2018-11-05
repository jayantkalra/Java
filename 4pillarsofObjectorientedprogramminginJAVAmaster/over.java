import java.util.Scanner;
class over
{
    public void display(String a)
    {
        System.out.println(a);
    }
    public void display(int a)
    {
        System.out.println("integer no: "+a);
    }
  public void display(float a)
    {
        System.out.println("float no: "+a);
    }
}
class overloading
{
    public static void main(String[] args)
    {
        over s=new over();
        s.display(null);
        s.display(10);
        s.display(10.24f);
    }
}