import java.util.Scanner;

class EvenSeq

{

    public static void main(String[] args)

    {

        int i;

        Scanner s=new Scanner(System.in);

        System.out.println("Enter the limit");

        int abc=s.nextInt();

        System.out.println("Even Numbers:");

        for(i=0;i<=abc;i++)

        {

            if(i%2==0 && i!=0)

            {

                System.out.println(i);

            }

        }

    }

}