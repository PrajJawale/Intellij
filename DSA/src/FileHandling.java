import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        // The file to write t

        String filename = "praj1.txt";
        String content = "Hi PJ";


        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename));){
            writer.write(content);
            System.out.println("Write the content successfully");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
