package src.main.java;

import java.util.ArrayList;

public class Municipality {
	
	protected ArrayList<School> schools = new ArrayList<School>();
    private String municipality;
    private int casesinmunicipality = 0;
    private int closedschools = 0;
    private static int count = 0;
    protected static ArrayList<Municipality> allmunicipalities = new ArrayList<Municipality>();
    
    	public Municipality(String municipality, int casesinmunicipality, int closedschools ) {
    		this.municipality = municipality;
    		this.casesinmunicipality = casesinmunicipality;
    		this.closedschools = closedschools;
    		allmunicipalities.set(count,this);
    		count ++;
    	}
    	
    	public String getMunicipality() {
    		return municipality;
    	}
    	
    	public void setMunicipality(String municipality) {
    		this.municipality = municipality;
    	}
    	
    	public int getCasesinmunicipality() {
    		return casesinmunicipality;
    	}
    	
    	public void setCasesinmunicipality(int casesinmunicipality) {
    		this.casesinmunicipality = casesinmunicipality;
    	}
    	
    	public int getClosedschools() {
    		return closedschools;
    	}
    	
    	public void setClosedschools(int closedschools) {
    		this.closedschools = closedschools;
    	}
    	
  
    	/*This method informs a municipality about whether or
    	 * not one of its schools is closed
    	 */
    	static int id = -1;
    	public static void makeAnnouncement( int id) {
    		int i = 0;
    		boolean flag1 = false;
    		while (i < allmunicipalities.size() && flag1 == false) {
    			int j = 0;
    			boolean flag2 = false;
    			while (j < allmunicipalities.get(i).schools.size() && flag2 == false) {
    				if (allmunicipalities.get(i).schools.get(j).getSchoolid() == id &&  allmunicipalities.get(i).schools.get(j).getSchoolisclosed() == true) {
    					System.out.println("Το σχολείο " + allmunicipalities.get(i).schools.get(j).getNameofschool() + "είναι κλειστό");
    					allmunicipalities.get(i).closedschools ++;
    					flag2 = true;
    					flag1 = true;
    				}
    				j ++;
    			}
    			i ++;
    		}
    		
    		
    	}
}