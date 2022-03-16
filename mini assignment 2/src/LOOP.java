
    import java.util.Scanner;

    public class LOOP {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter no. of rows: ");
            int n = sc.nextInt();
            Pattern P = new Pattern(n);


        }

    }


    class Pattern {

        Pattern (int n) {
            for (int i = 1; i <= n; i++)
            {

                for (int j = n; j > i; j--)
                {
                    System.out.print(" ");
                }

                for (int k = 1; k <= i; k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 1; i < n; i++)
            {

                for (int j = 1; j <= i; j++)
                {
                    System.out.print(" ");
                }

                for (int k = n; k > i; k--)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

