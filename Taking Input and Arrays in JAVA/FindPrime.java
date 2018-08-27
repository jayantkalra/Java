import java.util.Scanner;

class FindPrime

{

    public static void main(String[] args)

    {

        int i,k;

        int flag=0;

        Scanner s=new Scanner(System.in);

        System.out.println("Enter the limit");

        int abc=s.nextInt();

        System.out.println("Prime Numbers:");
        for(i=2;i<=abc;i++)

        {

            for(k=1;k<=i;k++)

            {

                if(i%k==0)

                {

                    flag+=1;

                }

            }

            if(flag<=2)

            {

                System.out.println(i);

            }

            flag=0;

        }

    }

}