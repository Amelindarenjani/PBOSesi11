

import java.io.*;

public class FileMerge {

    public static void main(String[] args) {

        String[] files = {"F:\\New folder\\students.csv", "F:\\New folder\\new_students.csv"};
        String mergedFile = "F:\\New folder\\mergeCSV.csv";
 
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile))) {

            for (String file : files) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        bw.newLine();
                        bw.write(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
