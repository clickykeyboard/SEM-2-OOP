class Main {

    public static void main(String args[]) {
        
        
        SoftwareDeveloper softwareDeveloper = new SoftwareDeveloper("Haseeb", 1, 3, (float) 23.4);
        System.out.println(softwareDeveloper.getName());

        TeamLead teamLead = new TeamLead("Azam", 2, 3, (float) 43.23, (float) 100000, (float) 1.2);
        System.out.println(teamLead.getName());
        System.out.println(teamLead.getAnnualSalary());

        System.out.println(teamLead.getBonus());
        teamLead.setBonus((float) 1.5);
        System.out.println(teamLead.getAnnualSalary());

    }
    
}
