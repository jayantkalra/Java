import java.util.Scanner;
public class statblock
{
    static int num;
    static String str;
    static
    {
        System.out.println("firstblock:");
        num=10;
        str="firstblock";
    }
    static
    {
        System.out.println("secondblock:");
        num=20;
        str="secondblock";
    }
    public static void main(String[] args)
    {
        System.out.println("num "+num);
        System.out.println("string "+str);
    }
}