class TeamLead extends Employee {

    private int shiftNumber;
    private float hourlyPay;
    private float annualSalary;
    private float softwareDevelopmentBonus;

    TeamLead(String name, int number, int shiftNumber, float hourlyPay, float annualSalary, float softwareDevelopmentBonus) {
        super(name, number);
        this.shiftNumber = shiftNumber;
        this.hourlyPay = hourlyPay;

        this.annualSalary = annualSalary;
        this.softwareDevelopmentBonus = softwareDevelopmentBonus;

        this.annualSalary *= softwareDevelopmentBonus;
    }

    public int getShiftNumber() {
        return this.shiftNumber;
    }

    public float getHourlyPay() {
        return this.hourlyPay;
    }

    public float getAnnualSalary() {
        return this.annualSalary;
    }
    
    public float getBonus() {
        return this.softwareDevelopmentBonus;
    }

    public void setShiftNumber(int shiftNumber) {
        this.shiftNumber = shiftNumber;
    }

    public void setHourlyPay(int hourlyPay) {
        this.hourlyPay = hourlyPay;
    }
    
    public void setAnnualSalary(float annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setBonus(float softwareDevelopmentBonus) {
        this.softwareDevelopmentBonus = softwareDevelopmentBonus;
        this.annualSalary *= this.softwareDevelopmentBonus;
    }

}
