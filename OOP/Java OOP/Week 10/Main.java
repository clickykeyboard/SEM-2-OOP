import java.io.File;

class Main {
    public static void main(String args[]) {
        File file = FileHandling.createFile();
        FileHandling.readFile(file);
    }
}