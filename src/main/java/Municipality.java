import java.util.ArrayList;

public class Municipality {
	
	private String municipality;
    private int casesInMunicipality = 0;
    private int closedSchools = 0;
    private static int count = 0;
    protected ArrayList<School> schools = new ArrayList<School>();
    protected static ArrayList<Municipality> allMunicipalities = new ArrayList<Municipality>();
    
    public Municipality(String municipality, int casesInMunicipality, int closedSchools ) {
    	this.municipality = municipality;
    	this.casesInMunicipality = casesInMunicipality;
    	this.closedSchools = closedSchools;
    	allMunicipalities.set(count, this);
    	count++;
    }
    	
    public String getMunicipality() {
    	return municipality;
    }
    	
    public int getCasesInMunicipality() {
    	return casesInMunicipality;
    }
    	
    public void setCasesInMunicipality(int casesInMunicipality) {
    	this.casesInMunicipality = casesInMunicipality;
    }
    	
    public int getClosedSchools() {
    	return closedSchools;
    }
    	
    public void setClosedSchools(int closedSchools) {
    	this.closedSchools = closedSchools;
    }
    	
    /*This method informs a municipality about whether or
    * not one of its schools is closed
    */
    static int id = -1;
    public static void makeAnnouncement(int id) {
    	int i = 0;
    	boolean flag1 = false;
    	while (i < allMunicipalities.size() && flag1 == false) {
    		int j = 0;
    		boolean flag2 = false;
    		while (j < allMunicipalities.get(i).schools.size() && flag2 == false) {
    			if (allMunicipalities.get(i).schools.get(j).getSchoolid() == id &&  allMunicipalities.get(i).schools.get(j).getSchoolisclosed() == true) {
					System.out.println("The school " + allmunicipalities.get(i).schools.get(j).getNameofschool() + "is closed.");
    					allmunicipalities.get(i).closedschools++;
    					flag2 = true;
    					flag1 = true;
    			}
    			j ++;
    		}
    		i ++;
    	}		
    }
}
