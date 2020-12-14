package src.main.java.com.myteam.covidproject;

public class Municipality {
	
protected static School [] allschools = new School[10000]; /*all schools of a municipality are saved in an array */
    public String municipality;
    public int casesinmunicipality = 0; /*total number of cases in a municipality*/
    public int closedschools = 0; /*number of closed schools in a municipality*/
    private static int count; /*number of municipalities*/
    protected static Municipality[] allmunicipalities = new Municipality[100000];/*all municipalities are saved in an array*/
    
    
	
	public Municipality(School [] allschools, String municipality, int casesinmunicipality, int closedschools ) {
    		this.allschools = allschools;
    		this.municipality = municipality;
    		this.casesinmunicipality = casesinmunicipality;
    		this.closedschools = closedschools;
    		allmunicipalities[count] = this;
    		count ++;
    	}
    	
	/*informs the municipality in case of school's closing*/
	
    	static boolean closed = false;
    	static String area = "";
    	public static void makeAnnouncemet(boolean closed, String area) {
    		int i = 0;
    		boolean flag = false;
    		while (i < allmunicipalities.length && flag == false) {
    			if (allmunicipalities[i].municipality.equalsIgnoreCase(area)) {
    				int j = 0;
    				boolean flag2 = false;
    				while (j < allmunicipalities[i].allschools.length && flag == false) {
    					if ()
    				}
    			}
    		}
    		
    		
    		
    	}
}
