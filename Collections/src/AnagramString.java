import java.util.HashMap;
import java.util.*;

public class AnagramString {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st String: ");
        String str1 = scan.nextLine();
        System.out.println("Enter 2nd String");
        String str2 = scan.nextLine();

        boolean istrue = true;

        HashMap<Character, Integer> hmap = new HashMap<>();
        for (int i=0;i<str1.length();i++)
        {
            hmap.put(str1.charAt(i),1);
        }

        for(int i=0;i<str2.length();i++)
        {
            if(hmap.containsKey(str2.charAt(i)))
            {
                continue;
            }
            else
            {
                istrue = false;
                break;
            }
        }

        if(istrue)
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not an Anagram");
        }

    }
}
