import java.util.Scanner;

public class HomePage {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while(true) {
                System.out.println("********** Welcome to User Database **********");
                System.out.println("Press 1 for Login");
                System.out.println("Press 2 for Register");
                System.out.print("Select Option: ");
                char option = sc.next().charAt(0);
                sc.nextLine();
                switch (option) {
                    case '1':
                        LoginUser existing_user = new LoginUser();
                        break;

                    case '2':
                        Registration new_user = new Registration();
                        break;

                    case '0':
                        System.exit(0);

                    default:
                        System.out.println("Make a valid Choice !!");
                }


            }
        }

}
