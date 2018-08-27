import java.util.Scanner;

import java.lang.Math;

class Armstrong

{

        public static void main(String[] args)

        {

            Scanner s=new Scanner(System.in);

            System.out.println("Enter a number");

            int abc=s.nextInt();

            int i=100,j=abc;

            int count=0,astrong=0;

            while(j>0)

            {

                i=j%10;

                count++;

                j=j/10;

            }

            j=abc;

            while(j>0)

            {

                i=j%10;

                astrong+=Math.pow(i,count);

                j=j/10;

            }

            if(abc==astrong)

            {

                System.out.println(abc+" is an Armstrong number");

            }

            else

            {

                System.out.println(abc+" is not an Armstrong number");

            }

        }

}