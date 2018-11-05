import java.util.*;
class remvo
{
    public static void main(String[] args)
    {
        String str1,str2;
        Scanner s=new Scanner(System.in);
        System.out.print("Input the desired string:  ");
        str1=s.next();
        str2=str1.replaceAll("[AEIOUaeiou]"," ");
        System.out.print("String after removing out the vowels will be:  ");
        System.out.print(str2);
    }
}