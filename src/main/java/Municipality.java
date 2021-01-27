package covid;

import java.util.ArrayList;

public class Municipality {
	
	private int schoolid;
	private String municipality;
	private String area;
    private int casesInMunicipality = 0;
    private int closedSchools = 0;
    private static int count = 0;
    protected ArrayList<School> schools = new ArrayList<School>();
    protected static ArrayList<Municipality> allMunicipalities = new ArrayList<Municipality>();
    
    public Municipality(String municipality, String area, int casesInMunicipality, int closedSchools, int schoolid ) {
    	this.municipality = municipality;
    	this.area = area;
    	this.casesInMunicipality = casesInMunicipality;
    	this.closedSchools = closedSchools;
    	this.schoolid = schoolid;
    	allMunicipalities.add(this);
    	count++;
    }
    
    public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
    }
    
    public int getSchoolid() {
		return schoolid;
	}

	public void setSchoolid(int schoolid) {
		this.schoolid = schoolid;
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
		String s = "Municipality";
		return "Municipality: " + municipality + "\nArea: " + area + "\nSchool ID: " + schoolid;
	}
}
