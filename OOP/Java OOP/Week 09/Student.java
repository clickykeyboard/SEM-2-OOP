public class Student {
    
    public static String program = "BSCS";
    private String name;
    static int count = 0;
    private int rollNumber;

    Student(String name) {
        this.name = name;
        count++;
        this.rollNumber = count;
        System.out.println(this.rollNumber);
    }

    static void changeProgram() {
        program = "BSIT";
    }
    
    void printInformation() {
        System.out.println("Name: " + this.name);
        System.out.println("Program: " + program);
        System.out.println("Roll number: " + this.rollNumber);
        System.out.println("------------");
    }

}
