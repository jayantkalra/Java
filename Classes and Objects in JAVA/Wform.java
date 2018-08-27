import java.util.Scanner;

class Wform

{

    public static void main(String[] args)

    {

        Scanner s=new Scanner(System.in);

        int i,j,tempo;

        int count=0;

        int[] Arry=new int[10];

        System.out.println("Enter the elements");

        for(i=0;i<10;i++)

        {

            Arry[i]=s.nextInt();

        }

        for(i=0;i<10;i++)

        {

            count++;

            if(count==2)

            {

                tempo=Arry[i-1];

                Arry[i-1]=Arry[i];

                Arry[i]=tempo;

                count=0;

            }

        }

        System.out.println("Result:");

        for(i=0;i<10;i++)

    {

        System.out.println(Arry[i]);

    }

    }

}