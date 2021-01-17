public class Eody {
	private static Eody eody = null;
	public int totalcases;
	
	private Eody() {
	 totalcases = 0;
	}
	public static Eody getInstance() {
	   if (null == eody) {
		   eody = new Eody();
	   }
	   return eody;
   }
   public int getTotalcases() {
	  return totalcases;
   }
/* This method increases the number of total cases when a new case is entered. */
   public void addCaseToEody() {
	  totalcases = totalcases + 1;
   }

}