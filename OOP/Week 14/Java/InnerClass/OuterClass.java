class OuterClass {

    private int x = 0;

    public int getValue() {
        return x;
    }

    class InnerClass {
        public InnerClass() {
            x = 10;
        }
    }

    public static void main(String args[]) {
        OuterClass outerClass = new OuterClass();
        outerClass.getValue();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(outerClass.getValue());
    }





}