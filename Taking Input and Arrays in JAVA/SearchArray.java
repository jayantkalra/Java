import java.util.Scanner;

class SearchArray

{

    public static void main(String[] args)

    {

        int i;

        int flag=0;

        Scanner s=new Scanner(System.in);

        int[] Arry=new int[]{1,4,6,7,8,9,10};

        System.out.println("Enter number to search");

        int abc=s.nextInt();

        for(i=0;i<Arry.length;i++)

        {

            if(abc==Arry[i])

            {

                System.out.println("Number found at pos : "+i);

                flag=1;

                break;

            }


        }

        if(flag==0)

        {

            System.out.println("Number doesn't exist in array");

        }

    }

}