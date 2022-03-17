import java.util.*;
public class ReverseOrder {

        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Original String:-");
            String Original = scan.nextLine();


            List<String> mylist = new ArrayList<>(Arrays.asList(Original.split(",")));




            System.out.println("Original List : " + mylist);


            Collections.reverse(mylist);


            System.out.println("Modified List: " + mylist);

        }
    }

