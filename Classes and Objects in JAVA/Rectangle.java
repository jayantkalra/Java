import java.util.Scanner;

class Rect
{

    int length;

    int breath;

    int CalcArea(int length,int breath)

    {

        int area;

        area=length*breath;

        return area;

    }


}

class Rectangle

{

    public static void main(String[] args)

    {

        Rect abc=new Rect();

        Scanner s=new Scanner(System.in);

        System.out.println("Enter length");

        abc.length=s.nextInt();

        System.out.println("Enter breath");

        abc.breath=s.nextInt();

        int area=abc.CalcArea(abc.length,abc.breath);

        System.out.println("Area is: "+area);

    }

}