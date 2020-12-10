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
}


