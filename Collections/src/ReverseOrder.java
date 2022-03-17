import java.util.*;
public class ReverseOrder {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of list:");
        int n = scan.nextInt() + 1;
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element of list:");
            str[i] = scan.nextLine();
        }
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            stack.push(str[i]);
        }

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }


    }
}

