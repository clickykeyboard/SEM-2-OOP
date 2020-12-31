class SoftwareDeveloper extends Employee {

    private int shiftNumber;
    private float hourlyPay;
    
    SoftwareDeveloper(String name, int number, int shiftNumber, float hourlyPay) {
        super(name, number);
        this.shiftNumber = shiftNumber;
        this.hourlyPay = hourlyPay;
    }

    public int getShiftNumber() {
        return this.shiftNumber;
    }

    public float getHourlyPay() {
        return this.hourlyPay;
    }

    public void setShiftNumber(int shiftNumber) {
        this.shiftNumber = shiftNumber;
    }

    public void setHourlyPay(int hourlyPay) {
        this.hourlyPay = hourlyPay;
    }
}
