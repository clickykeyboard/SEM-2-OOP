package Task;

public class Main {
    public static void main(String args[]) {
        HospitalManagementSystem hospitalManagementSystem = new HospitalManagementSystem();

        // Indoor visits
        hospitalManagementSystem.indoorPatientVisit();
        hospitalManagementSystem.indoorPatientVisit();
        hospitalManagementSystem.getIndoorPatientVisits();

        // Outdoor visits
        hospitalManagementSystem.outdoorPatientVisit();
        hospitalManagementSystem.outdoorPatientVisit();
        hospitalManagementSystem.getOutdoorPatientVisits();

        // Total visits
        HospitalManagementSystem.getTotalPatientVisits();
    }
}
