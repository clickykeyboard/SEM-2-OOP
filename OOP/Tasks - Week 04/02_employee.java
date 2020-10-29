class Employee {

    private String name;
    private String idNumber;
    private int department;
    private String jobTitle;

    public Employee(String name1, String idNumber1, int department1, String jobTitle1) {
        name = name1;
        jobTitle = jobTitle1;
        department = department1;
        jobTitle = jobTitle1;
    }

    public String getName() {
        return name;
    }

    public String getIDNumber() {
        return idNumber;
    }

    public int getDepartment() {
        return department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setName(String name1) {
        name = name1;
    }

    public void setIdNumber(String idNumber1) {
        idNumber = idNumber1;
    }

    public void setDepartment(int department1) {
        department = department1;
    }

    public void setJobTitle(String jobTitle1) {
        jobTitle = jobTitle1;
    }

}

class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
    }
}
