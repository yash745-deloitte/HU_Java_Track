import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentData
{
    public static void main(String[] args) {
        String line = "";

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Number of Top candidates you want to filter:-");
            int num = scan.nextInt();
            ArrayList<String> reqRecord = new ArrayList<>();


            BufferedReader bfr = new BufferedReader(new FileReader("C:\\Users\\yashmittal2\\Documents\\StudentData.csv"));
            line = bfr.readLine();
            reqRecord.add(line);



            while ((line = bfr.readLine()) != null) {
                String[] candidates = line.split(",");
                if (Integer.parseInt(candidates[4]) <= num) {
                    reqRecord.add(line);

                }
            }
            FileWriter f1 = new FileWriter("C:\\Users\\yashmittal2\\Documents\\SelectedStudents.csv");
            BufferedWriter bwd = new BufferedWriter(f1);
            PrintWriter out = new PrintWriter(bwd);
            for(String str: reqRecord)
            {
                out.println(str);
                out.flush();
            }

            System.out.println("Top" + num + "Records are saved successfully in SelectedStudents.csv ");
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\yashmittal2\\Documents\\SelectedStudents.csv"));
            while((line = br.readLine())!= null)
                System.out.println(line);


        }
        catch (IOException e)
        {
            e.printStackTrace();



        }
    }



}
