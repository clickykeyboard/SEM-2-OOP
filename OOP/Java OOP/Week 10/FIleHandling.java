import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

class FileHandling {

    public static File createFile() {
        
        try {

            File file = new File("file.txt");

            if (file.createNewFile()) {
                System.out.println("Created new file: " + file.getName());
                return file;
            } else {
                System.out.println("File already created!");
            }

        } catch (IOException ioError) {
            System.out.println("Error: " + ioError);
            ioError.printStackTrace();
        }

        return null;

        
    }

    public static void writeFile() {
        
        createFile();
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("file.txt");
            fileWriter.write("Hello world");
            fileWriter.close();
        } catch (IOException ioError) {
            System.out.println("Error: " + ioError);
            ioError.printStackTrace();
        } finally {
            // fileWriter.close();
        }

    }

    public static void readFile(File file) {
        try {
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                System.out.println(data);
                fileReader.close();
            }

        } catch (IOException ioError) {
            System.out.println("Error: " + ioError);
            ioError.printStackTrace();
        }
    }
    
}
