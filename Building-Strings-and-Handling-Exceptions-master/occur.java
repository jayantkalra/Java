import java.util.*;
class occur
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int count=1;
        String str1,str2;
        System.out.println("Enter the desired String:  ");
        str1=s.next();
        System.out.println("Enter the other desired string:  ");
        str2=s.next();
        if(str1.contains(str2))
        {
            count++;
            System.out.println("Occurence of string will be "+count);
        }
        else
        {
            System.out.print("Null occurence");
        }
    }
}