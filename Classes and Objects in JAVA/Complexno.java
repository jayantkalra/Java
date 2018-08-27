import java.util.Scanner;

class Complex
{

    int real;

    int imag;

    Complex()

    {

        real=2;

        imag=5;

    }

    int Display()

    {

        System.out.println("Complex Number : "+real+"+"+imag+"i");


        return 0;

    }


}

class Complexno
{

    public static void main(String[] args)

    {

        Complex abc=new Complex();

        abc.Display();

    }

}