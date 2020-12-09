public class Main {
    public static void main(String args[]) {

        Student studentOne = new Student("Ali");
        Student studentTwo = new Student("Ahmed");
        Student studentThree = new Student("Aryan");

        studentOne.printInformation();
        studentTwo.printInformation();
        studentThree.printInformation();
        
        Student.changeProgram();

        studentOne.printInformation();
        studentTwo.printInformation();
        studentThree.printInformation();

    }

}
