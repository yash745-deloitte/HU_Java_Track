import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Registration {
    
        String username, password, repassword;
        Registration () {
            Validate user = new Validate();

            Scanner sc = new Scanner(System.in);
            System.out.println("--Welcome to Register Page--");
            System.out.print("Enter Username: ");
            username = sc.nextLine();
            if(user.check_username(username)) {
                System.out.println("Duplicate User Found, Kindly Login!!");
            }
            else {
                System.out.print("Enter Password: ");
                password = sc.nextLine();
                System.out.print("Re-enter Password: ");
                repassword = sc.nextLine();
                if(password.equals(repassword)) {
                    if(user.Password_Validation(password)) {
                        try {
                            FileWriter file = new FileWriter("Login_Data.csv", true);
                            BufferedWriter bw = new BufferedWriter(file);
                            bw.write((username) + "," + (password)+"\n");
                            bw.close();
                            System.out.println("Registration Successful...");

                            FileWriter file2 = new FileWriter("User_Data.csv", true);
                            BufferedWriter bw2 = new BufferedWriter(file2);
                            bw2.write((username) + "," + (IDGenerator.generator())+","+("nil")+","+("nil")+","+("nil")+","+("nil")+","+("nil")+","+("nil")+","+("nil")+"\n");
                            bw2.close();
                            UserDataBase new_user = new UserDataBase(username);

                        } catch (Exception exception) {
                            System.out.println(exception.getMessage());
                        }
                    }
                    else {
                        System.out.println("Registration Unsuccessful !!");
                    }
                }
                else {
                    System.out.println("Password and Re-Password does not match...");
                    System.out.println("Registration Unsuccessful !!");
                }
            }
        }
    
}
