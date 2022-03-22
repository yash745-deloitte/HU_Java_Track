import java.io.Console;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
public class LoginUser {



        String username, password;
        LoginUser(){
            Validate user = new Validate();

            Scanner sc = new Scanner(System.in);
            System.out.println("--Welcome to Login Page--");
            System.out.print("Enter Username: ");
            username = sc.nextLine();

            if(user.check_username(username)) {
                System.out.print("Enter Password: ");
                password = sc.nextLine();
                if(user.check_password(username, password)) {
                    System.out.println("Login Successful...");

                    UserDataBase new_user = new UserDataBase(username);

                }
                else {
                    System.out.println("Password incorrect...");
                }
            }
            else {
                System.out.println("User not found, Kindly register...");

            }
        }
    }

