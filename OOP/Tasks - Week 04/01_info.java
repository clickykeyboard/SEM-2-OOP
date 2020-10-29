class Information {

    private String name;
    private String address;
    private int age;
    private String phoneNumber;
    
    public Information(String name1, String address1, int age1, String phoneNumber1) {
        name = name1;
        address = address1;
        age = age1;
        phoneNumber = phoneNumber1;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name1) {
        name = name1;
    }

    public void setAddress(String address1) {
        address = address1;
    }

    public void setAge(int age1) {
        age = age1;
    }
    public void setPhoneNumber(String phoneNumber1) {
        phoneNumber = phoneNumber1;
    }

}
