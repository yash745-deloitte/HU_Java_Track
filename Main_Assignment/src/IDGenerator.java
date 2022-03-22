
import java.io.BufferedReader;
import java.io.FileReader;


public class IDGenerator {

    public static String generator(){
            try {
                String id = "1000";
                BufferedReader br = new BufferedReader(new FileReader("User_Data.csv"));
                String row;
                while ((row = br.readLine()) != null) {
                    String[] data = row.split(",");
                    Integer x = Integer.parseInt(data[1]) + 1;
                    id = x.toString();
                }
                return id;
            } catch (Exception error) {
                System.out.println(error.getMessage());
                return "";
            }
        }
    }

