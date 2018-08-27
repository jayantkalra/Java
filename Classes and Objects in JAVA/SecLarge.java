import java.util.Scanner;

class SecLarge

{

    public static void main(String[] args)

    {

        Scanner s=new Scanner(System.in);

        int i,j,tempo;

        int count=1;

        int[] Arry=new int[10];

        System.out.println("Enter the elements");

        for(i=0;i<10;i++)

        {

            Arry[i]=s.nextInt();

        }

        for(i=0;i<10;i++)

        {

            for(j=i;j<10;j++)

            {

                if(Arry[j]>Arry[i])

                {

                    tempo=Arry[i];

                    Arry[i]=Arry[j];

                    Arry[j]=tempo;

                }

            }

        }

    for(i=0;i<10;i++)

    {

        if(count==0)

        {

            System.out.println("Second Largest element in the array : "+Arry[i]);

        }

        count--;

    }

    }

}