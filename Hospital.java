
public class Hospital {

	public String nameofhospital;
	public char area;
	protected static Hospital [] allhospitals = new Hospital[100000]; /*alla hospitals are saved in an array*/
	private static int count; /*counts the number of hospitals*/
	

	public Hospital(String nameofhospital, char area) {
		this.nameofhospital = nameofhospital;
		this.area =  area;
		allhospitals[count] = this;
		count++;
	}
	
	/*finds the nearest hospital for the patient*/
	public static void findHospital(int area) {
		boolean flag = false;
	for	(int i = 0; i < allhospitals.length; i++) {
		if (allhospitals[i].area == area) {
			System.out.println(allhospitals[i].area);
			flag = true;
		}
	}	
	if (flag == true) {
		System.out.println("nosokomeio se allo dhmo");
	}
	}
}
