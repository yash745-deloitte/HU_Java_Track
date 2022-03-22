import java.util.*;
import java.io.*;

public class UserDataBase {

    UserDataBase(String username){
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("********** Welcome to User Database **********");
                System.out.println("Press 1 to Add User Data");
                System.out.println("Press 2 to List User Data");
                System.out.println("Press 3 to Update User Data");
                System.out.println("Press 4 to Delete User Data");
                System.out.println("Press 5 to Exit");
                System.out.print("Select Option: ");
                int option = sc.nextInt();
                sc.nextLine();
                switch (option) {
                    case 0:
                        System.exit(0);

                    case 1:
                        add(username);

                        break;

                    case 2:
                        list(username);

                        break;

                    case 3:
                        update(username);

                        break;

                    case 4:
                        delete(username);
                        break;

                    case 5:
                        HomePage.main(null);
                        break;

                    default:
                        System.out.println("Make a Valid Choice!!");
                }
            }
        }

        public void add(String username)
        {
            List<List<String>> records = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader("User_Data.csv"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    records.add(Arrays.asList(values));
                }
            }
            catch (Exception err) {
                System.out.println(err.getMessage());
            }
            try {
                String[] cols = {"Name","Age","Company-Name","Designation","Salary","Address","Phone-Number"};
                int index = 0;
                boolean flag = false;
                while(index < records.size()) {
                    if(username.equals(records.get(index).get(0))) {
                        System.out.println("Username : " + records.get(index).get(0));
                        System.out.println("User ID : " + records.get(index).get(1));
                        int i = 2;
                        Validate user = new Validate();

                        while (i < records.get(index).size()) {
                            if (records.get(index).get(i).equals("nil")) {
                                flag = true;
                                System.out.println("**** Write nil if want to leave empty ****");
                                System.out.print("Enter the " + cols[i - 2] + " : ");
                                Scanner sc = new Scanner(System.in);
                                String entry = sc.nextLine();
                                while(entry.isBlank()){
                                    System.out.println("Invalid Input");
                                    System.out.print("Enter the " + cols[i - 2] + " : ");
                                    entry = sc.nextLine();
                                }
                                while(i == 3 && !user.age_validate(entry)) {
                                    System.out.print("Enter a Valid " + cols[i - 2] + " : ");
                                    entry = sc.nextLine();
                                    records.get(index).set(i, entry);
                                }
                                while(i == 6 && !user.salary_validate(entry)) {
                                    System.out.print("Enter a Valid " + cols[i - 2] + " : ");
                                    entry = sc.nextLine();
                                    records.get(index).set(i, entry);
                                }
                                while(i == 8 && !user.number_validate(entry)) {
                                    System.out.print("Enter a Valid " + cols[i - 2] + " : ");
                                    entry = sc.nextLine();
                                    records.get(index).set(i, entry);
                                }
                                records.get(index).set(i, entry);
                            }
                            else {
                                System.out.println(cols[i - 2] + " : " + records.get(index).get(i));
                            }
                            i++;
                        }
                    }
                    index++;
                }
                try (PrintWriter writer = new PrintWriter("User_Data.csv")) {
                    for(int i=0;i<records.size();i++) {
                        for (int j = 0; j < records.get(i).size(); j++) {
                            writer.write((records.get(i).get(j))+",");
                        }
                        writer.write("\n");
                    }
                    if(flag)
                        System.out.println("Data Added");
                    else{
                        System.out.println("Data Already Exists !!");
                    }
                } catch (FileNotFoundException e) {
                    System.out.println(e.getMessage());
                }

            } catch (Exception err) {
                System.out.println(err.getMessage());
            }
        }

        public void list(String username)
        {
            List<List<String>> records = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader("User_Data.csv"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");

                    records.add(Arrays.asList(values));
                }
            } catch (Exception err) {
                System.out.println(err.getMessage());
            }
            try {
                String[] cols = {"Name", "Age", "Company-Name", "Designation", "Salary", "Address", "Phone-Number"};
                int index = 0;
                while (index < records.size()) {
                    if (username.equals(records.get(index).get(0))) {
                        System.out.println("Username : " + records.get(index).get(0));
                        System.out.println("User ID : " + records.get(index).get(1));
                        int i = 2;
                        while (i < records.get(index).size()) {
                            System.out.println(cols[i - 2] + " : " + records.get(index).get(i));
                            i++;
                        }
                    }
                    index++;
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }



        }

        public void update(String username)
        {
            List<List<String>> records = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader("User_Data.csv"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");

                    records.add(Arrays.asList(values));
                }
            }
            catch (Exception err) {
                System.out.println(err.getMessage());
            }
            try {
                String[] cols = {"Name","Age","Company-Name","Designation","Salary","Address","Phone-Number"};
                int index = 0;
                while(index < records.size()) {
                    if(username.equals(records.get(index).get(0))) {
                        System.out.println("Username : " + records.get(index).get(0));
                        System.out.println("User ID : " + records.get(index).get(1));
                        int i = 2;
                        System.out.println("0 Go to Main Menu");
                        while (i < records.get(index).size()){
                            System.out.println(i-1+". "+cols[i-2]);
                            i++;
                        }
                        Scanner sc = new Scanner(System.in);
                        outer:
                        while (true) {
                            System.out.print("Select Value you want to Update : ");
                            int choice = sc.nextInt();
                            Validate user = new Validate();
                            switch (choice) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    System.out.println("**** Write nil to give a blank value ****");
                                    System.out.print("Enter the " + cols[choice - 1] + " : ");
                                    sc.nextLine();
                                    String field = sc.nextLine();
                                    while(field.isBlank()){
                                        System.out.println("Invalid Input");
                                        System.out.print("Enter the " + cols[i - 2] + " : ");
                                        field = sc.nextLine();
                                    }
                                    while (choice + 1 == 3 && !user.age_validate(field)) {
                                        System.out.print("Enter a Valid " + cols[choice - 1] + " : ");
                                        field = sc.nextLine();
                                        records.get(index).set(choice + 1, field);
                                    }
                                    while (choice + 1 == 6 && !user.salary_validate(field)) {
                                        System.out.print("Enter a Valid " + cols[choice - 1] + " : ");
                                        field = sc.nextLine();
                                        records.get(index).set(choice + 1, field);
                                    }
                                    while (choice + 1 == 8 && !user.number_validate(field)) {
                                        System.out.print("Enter a Valid " + cols[choice - 1] + " : ");
                                        field = sc.nextLine();
                                        records.get(index).set(choice + 1, field);
                                    }
                                    records.get(index).set(choice + 1, field);
                                    System.out.println("Data Updated");
                                    break;
                                case 0:
                                    break outer;
                                default:
                                    System.out.println("Enter a Valid Choice");
                            }
                        }
                    }
                    index++;
                }
                try (PrintWriter writer = new PrintWriter("User_Data.csv")) {
                    for(int i=0;i < records.size();i++) {
                        for (int j = 0; j < records.get(i).size(); j++) {
                            writer.write((records.get(i).get(j))+",");
                        }
                        writer.write("\n");
                    }
                    System.out.println("Database Successfully Updated");
                } catch (FileNotFoundException e) {
                    System.out.println(e.getMessage());
                }

            } catch (Exception err) {
                System.out.println(err.getMessage());
            }

        }
        public void delete(String username)
        {
            List<List<String>> records = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader("User_Data.csv"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");

                    records.add(Arrays.asList(values));
                }
            }
            catch (Exception err) {
                System.out.println(err.getMessage());
            }
            try {
                String[] cols = {"Name","Age","Company-Name","Designation","Salary","Address","Phone-Number"};
                int index = 0;
                while(index < records.size()) {
                    if(username.equals(records.get(index).get(0))) {
                        System.out.println("Username : " + records.get(index).get(0));
                        System.out.println("User ID : " + records.get(index).get(1));
                        int i = 2;
                        System.out.println("0. Go to Main Menu");
                        while (i < records.get(index).size()){
                            System.out.println(i-1+". "+cols[i-2]);
                            i++;
                        }
                        Scanner sc = new Scanner(System.in);
                        outer:
                        while (true) {
                            System.out.print("Select Value you want to Delete : ");
                            int choice = sc.nextInt();
                            Validate user = new Validate();
                            switch (choice) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    records.get(index).set(choice + 1, "nil");
                                    System.out.println("Data Updated");
                                    break;
                                case 0:
                                    break outer;
                                default:
                                    System.out.println("Enter a Valid Choice");
                            }
                        }
                    }
                    index++;
                }
                try (PrintWriter writer = new PrintWriter("User_Data.csv")) {
                    for(int i=0;i < records.size();i++) {
                        for (int j = 0; j < records.get(i).size(); j++) {
                            writer.write((records.get(i).get(j))+",");
                        }
                        writer.write("\n");
                    }
                    System.out.println("Database Successfully Updated");
                } catch (FileNotFoundException e) {
                    System.out.println(e.getMessage());
                }

            } catch (Exception err) {
                System.out.println(err.getMessage());
            }

        }

}
