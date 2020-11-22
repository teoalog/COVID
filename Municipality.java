
public class Municipality {
	
	protected static School [] allschools = new School[10000];
    public String municipality;
    public int casesinmunicipality = 0;
    public int closedschools = 0;
    private static int count;
    protected static Municipality[] allmunicipalities = new Municipality[100000];
    
    	public Municipality(School [] allschools, String municipality, int casesinmunicipality, int closedschools ) {
    		this.allschools = allschools;
    		this.municipality = municipality;
    		this.casesinmunicipality = casesinmunicipality;
    		this.closedschools = closedschools;
    		allmunicipalities[count] = this;
    		count ++;
    	}
    	
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
