
public class Eody {
	public School[] allschools = new School[1000000000];
	public static int totalcases = 0;
	public static int numberofclosedschools = 0;
	
	public Eody(School[] allschools, int totalcases, int numberofclosedschools) {
		this.allschools = allschools;
		this.numberofclosedschools = numberofclosedschools;
		this.totalcases = totalcases;
	}

	public static void addCase() {
		totalcases ++;
	}
	
	public static void addClosedSchool() {
		numberofclosedschools ++;
	}
}
