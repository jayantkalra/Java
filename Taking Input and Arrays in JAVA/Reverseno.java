import java.util.Scanner;

class Reverseno

{

	public static void main(String[] args)

	{

		int abc,j,count=0;

		int rev=0;

		Scanner n=new Scanner(System.in);

		System.out.println("Enter an integer");

		abc=n.nextInt();

		j=abc;

		while(j!=0)

		{

			count++;

			j=j/10;

		}

		for (int i=0;i<count;i++)

		{

			rev=rev*10;

			rev=rev+abc%10;

			abc=abc/10;

		}

		System.out.println("Reverse of the number is :");
		System.out.println(rev);

	}

}