class SuperClass {

    public SuperClass() {
        System.out.println("Creating super class!");
    }

    public void superClassMethod() {
        System.out.println("Printing superClassMethod!");
    }

    public void printBaseClassVariable() {
        System.out.println("");
    }

}

class BaseClass extends SuperClass {

    // private String baseClassVariable; 

}