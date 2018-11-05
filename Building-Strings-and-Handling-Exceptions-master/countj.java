import java.util.*;
class countj
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int no=1,i;
        System.out.print("Enter the desired string:  ");
        String str=s.nextLine();
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                no++;
            }
        }
        System.out.print("Count of the string will be:  "+no);
    }
}