import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String filename = "F://java/example.txt";
        if (args.length > 0)
            filename = args[0];

        for (String line : new TextFile(filename)) {
            System.out.println(line);
            
        }




    }
}
