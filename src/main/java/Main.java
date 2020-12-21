package src.main.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String option;
		int cont = 1;
		int id = 0;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Δωσε ονομα σχολειου");
		option = scanner.nextLine();

		while (cont!=0){
		System.out.println("Πατηστε 1 για μαθητη και 2 για καθηγητη");
		cont = scanner.nextInt();

		switch(cont){
		case 0:
			break;
		case 1:
			System.out.println("Παρακαλω δωστε το id του μαθητη");
			id = scanner.nextInt();
			Case.addNewCase(id, option );
			break;
		case 2:
			System.out.println("Παρακαλω δωστε το id του καθηγητη");
			id = scanner.nextInt();
			break;
		default:
			System.out.println("Λαθος καταχωρηση");
		}

	    }





}
}

