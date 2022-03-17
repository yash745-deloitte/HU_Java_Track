import java.util.*;
public class Shuffle_String {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st string: ");
        String str1 = scan.nextLine();
        System.out.print("Enter 2nd string: ");
        String str2 = scan.nextLine();
        System.out.print("Enter 3rd string: ");
        String str3 = scan.nextLine();

        int j=0,k=0;
        boolean istrue = true;
        for(int i=0;i<str3.length();i++)
        {
            if(j<str1.length() && str3.charAt(i) == str1.charAt(j))
            {
                j++;
            }
            else if(k<str2.length() && str3.charAt(i) == str2.charAt(k))
            {
                k++;
            }
            else
            {
                istrue = false;
                break;
            }
        }
        if(istrue)
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }


    }
}
