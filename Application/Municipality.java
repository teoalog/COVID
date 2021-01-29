package covid;

import java.util.ArrayList;

public class Municipality {

    private int schoolid;
    private String municipality;
    private String area;
    private int casesInMunicipality;
    private int closedSchools;
    private static int count = 0;
    protected ArrayList<School> schools = new ArrayList<School>();
    protected static ArrayList<Municipality> allMunicipalities = new ArrayList<Municipality>();

    public Municipality (String municipality, String area, int casesInMunicipality, int closedSchools, int schoolid ) {
        this.municipality = municipality;
        this.area = area;
        this.casesInMunicipality = casesInMunicipality;
        this.closedSchools = closedSchools;
        this.schoolid = schoolid;
        allMunicipalities.add(this);
        count++;
    }

    /*This method informs a municipality about whether or not one of its schools is closed */
    static int id = -1;
    public static void makeAnnouncement(int id) {
        int i = 0;
        boolean flag1 = false;
        while (i < allMunicipalities.size() && !flag1) {
            int j = 0;
            boolean flag2 = false;
            while (j < allMunicipalities.get(i).schools.size() && !flag2) {
                if (allMunicipalities.get(i).schools.get(j).getSchoolid() == id && allMunicipalities.get(i).schools.get(j).getSchoolisclosed()) {
                    System.out.println("The school " + allMunicipalities.get(i).schools.get(j).getNameofschool() + "is closed.");
                    allMunicipalities.get(i).closedSchools++;
                    flag2 = true;
                    flag1 = true;
                }
                j ++;
            }
            i ++;
        }
    }

    public String toString() {
        return "Municipality: " + municipality + "\nArea: " + area + "\nSchool ID: " + schoolid;
    }
}
