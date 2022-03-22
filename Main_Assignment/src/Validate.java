import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class Validate {
    public boolean Password_Validation(String str) {

            boolean upr = false, lwr = false, spl = false, dig = false;
            try {
                try {
                    if (str.length() < 5 || str.length() > 10)
                        throw new Exception("Password should be in a range of 5 to 10 characters...");
                } catch (Exception err) {
                    System.out.println(err.getMessage());
                    return false;
                }

                for(int i=0; i<str.length(); i++) {
                    if(Character.isUpperCase(str.charAt(i)))
                        upr = true;
                    if(Character.isLowerCase(str.charAt(i)))
                        lwr = true;
                    if(Character.isDigit(str.charAt(i)))
                        dig = true;
                    if(str.charAt(i) == '@' || str.charAt(i) == '#' || str.charAt(i) == '&' || str.charAt(i) == '%' || str.charAt(i) == '*' || str.charAt(i) == '!')
                        spl = true;
                }
                if(!upr)
                    throw new Exception("At least one Uppercase alphabet required...");
                if(!lwr)
                    throw new Exception("At least one Lowercase alphabet required...");
                if(!dig)
                    throw new Exception("At least one digit required...");
                if(!spl)
                    throw new Exception("At least one special characters “@ #  &  % * ! ”...");

            } catch (Exception err) {
                if(!upr)
                    System.out.println("At least one Uppercase alphabet required...");
                if(!lwr)
                    System.out.println("At least one Lowercase alphabet required...");
                if(!dig)
                    System.out.println("At least one digit required...");
                if(!spl)
                    System.out.println("At least one special characters “@ #  &  % * ! ”...");
                return false;
            }
            return true;
        }

        public boolean age_validate(String age) {
            try {
                if(Integer.parseInt(age) < 18 || Integer.parseInt(age) > 90)
                    throw new Exception("Age should be greater than 18 and less than 90...");
            } catch (Exception err) {
                System.out.println(err.getMessage());
                return false;
            }
            return true;
        }

        public boolean salary_validate(String salary) {
            try {
                if(Integer.parseInt(salary) <= 0)
                    throw new Exception("Salary should be above 0...");
            } catch (Exception err) {
                System.out.println(err.getMessage());
                return false;
            }
            return true;
        }

        public boolean number_validate(String phone) {
            try {
                if(phone.length() != 10)
                    throw new Exception("Phone number should be of 10 digits...");
                for(int i=0; i<phone.length(); i++)
                    if(!Character.isDigit(phone.charAt(i)))
                        throw new Exception("Phone number should only contain numbers...");
            } catch (Exception err) {
                System.out.println(err.getMessage());
                return false;
            }
            return true;
        }

        public boolean check_username(String username) {
            try {
                if(username.contains(" ")) {
                    throw new Exception("Username Should not contain Whitespaces");
                }
                BufferedReader br = new BufferedReader(new FileReader("Login_Data.csv"));
                String row;
                boolean found = false;
                while((row = br.readLine()) != null) {
                    String[] csv_data = row.split(",");
                    if(username.equals((csv_data[0]))) {
                        found = true;
                        break;
                    }
                }
                return found;
            }
            catch (Exception exception) {
                System.out.println(exception.getMessage());
                return false;
            }
        }

        public boolean check_password(String username, String password) {
            try {
                BufferedReader br = new BufferedReader(new FileReader("Login_Data.csv"));
                String row;
                boolean found = false;
                while((row = br.readLine()) != null) {
                    String[] data = row.split(",");
                    if(username.equals((data[0])) && password.equals((data[1]))) {
                        found = true;
                        break;
                    }
                }
                return found;
            } catch (Exception err) {
                System.out.println(err.getMessage());
                return false;
            }
        }
    
    
}
