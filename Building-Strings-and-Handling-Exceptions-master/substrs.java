import java.util.*;
class substrs
{
    public static void main(String[] args)
    {
        String strs,substr;
        int i,j,len;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the new string of the data: ");
        strs=s.nextLine();
        len=strs.length();
        System.out.print("Substring of "+strs+" are:");
        for(i=0;i<len;i++)
        {
            for(j=0;j<len-i;j++)
            {
                substr=strs.substring(i,i+j);
                System.out.println(substr);
            }
        }
    }
}