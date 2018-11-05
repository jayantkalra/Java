import java.util.Scanner;
class revstr
{
    public static void main(String[] args)
    {
        System.out.print("Enter string to reverse:  ");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String reverse=" ";

        for(int i=str.length()-1;i>=0;i--)
        {
            reverse = reverse+str.charAt(i);
        }
        System.out.print("Reverse string is:  "+reverse);
    }
}