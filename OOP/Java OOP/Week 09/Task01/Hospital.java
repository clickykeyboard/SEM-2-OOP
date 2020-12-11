package Task01;

class HospitalManagementSystem {

    static int count = 0;
    static int outdoor = 0;
    static int indoor = 0;

    private int outdoorPatients;
    private int indoorPatients;

    static int totalPatients;

    public void indoorPatientVisit() {
        indoor++;
        totalPatients++;
        
        this.indoorPatients = indoor;
        
        System.out.println("Indoor patient visited");
    }

    public void outdoorPatientVisit() {
        outdoor++;
        totalPatients++;

        this.outdoorPatients = outdoor;
        
        System.out.println("Outdoor patient visited");
    }

    public void getIndoorPatientVisits() {
        System.out.println("Indoor patient visits: " + this.indoorPatients);
    }

    public void getOutdoorPatientVisits() {
        System.out.println("Outdoor patient visits: " + this.outdoorPatients);
    }

    public static void getTotalPatientVisits() {
        System.out.println("Total patient visits: " + totalPatients);
    }

}

