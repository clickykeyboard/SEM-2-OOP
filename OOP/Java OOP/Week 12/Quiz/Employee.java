class Employee extends EmployeeStructure {
    
    private String name;
    private int number;

    Employee(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public int getNumber() {
        return this.number;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setNumber(int number) {
        this.number = number;
    }
    
}
