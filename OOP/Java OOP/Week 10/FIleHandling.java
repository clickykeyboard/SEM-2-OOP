import java.io.File;
import java.io.IOException;

class FileHandling {

    public static void createFile() {
        
        try {

            File file = new File("file.txt");

            if (file.createNewFile()) {
                System.out.println("Created new file: " + file.getName());
            } else {
                System.out.println("File already created!");
            }

        } catch (IOException ioError) {
            System.out.println("Error: " + ioError);
            ioError.printStackTrace();
        }

        
    }
    
}
