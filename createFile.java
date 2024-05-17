import java.io.*;

public class createFile {
    public static void main(String[]args){
        try{
            File f = new File("F:\\students.csv");
            if (f.createNewFile()){
                System.out.println("File created: "+f.getName());
            }
            else{
                System.out.println("File already exist.");
            }
        }
        catch (IOException e){
            System.out.println("An error occured");
                e.printStackTrace();
        }
    }
}
