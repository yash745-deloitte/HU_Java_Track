import java.util.Scanner;
import java.util.*;

public class Password_Validation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Valid Password:- ");
        String pswrd = scan.nextLine();

        try
        {
            boolean upper = true;
            boolean lower = true;
            boolean digit = true;
            boolean special = true;
            if(pswrd.length() < 5 )
            {
                throw  new ArithmeticException("Password too Short !!");
            }
            else if(pswrd.length() > 10 )
            {
                throw  new ArithmeticException("Password too Long !!");
            }
            for(int i=0;i<pswrd.length();i++)
            {
                if(Character.isUpperCase(pswrd.charAt(i))){
                   upper = false;
                }
                if(Character.isLowerCase(pswrd.charAt(i)))
                {
                    lower = false;
                }
                if(Character.isDigit(pswrd.charAt(i)))
                {
                    digit = false;
                }
                if(pswrd.charAt(i)=='@' || pswrd.charAt(i)=='#' || pswrd.charAt(i)=='&' || pswrd.charAt(i)=='*'

                || pswrd.charAt(i)=='!' || pswrd.charAt(i)=='%')
                {
                    special = false;
                }
            }

            if(upper)
            {
                throw new Exception("At least one uppercase alphabet required.");
            }
            if(lower)
            {
                throw new Exception("At least one lowercase alphabet required.");
            }
            if(digit)
            {
                throw new Exception("At least one Digit Required.");
            }
            if(special)
            {
                throw new Exception("At least one special Character Required");
            }
            System.out.println("Password is Valid !!");


        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
