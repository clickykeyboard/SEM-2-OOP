abstract class AbstractConstructor {

    abstract public void abstractClassFunction();

    AbstractConstructor(String abstractString) {
        System.out.println("Calling Abstract Class constructor");
        System.out.println(abstractString);
    }

}

class ClassA extends AbstractConstructor {

    ClassA(String abstractString) {
        super(abstractString);
        System.out.println("Calling ClassA constructor");
    }

    public void abstractClassFunction() {
        System.out.println("Abstract class function implemented in ClassA");
    }

}
