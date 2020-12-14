package src.main.java.com.myteam.covidproject;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Case {
	
	public static ArrayList<Case> totalcasesList = new ArrayList<Case>();
	int numofcases = 0;
	int girls = 0;
	int boys = 0;
	private int idofcase;
	private Date date;
	
	public Case(int idofcase, Date date) {
		this.idofcase = idofcase;
		this.date = date;
		totalcasesList.add(this);
		numofcases ++;
	}
	public int getId() {
		return idofcase;
	}
	public void setId(int idofcase) {
		this.idofcase =idofcase;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String toString() {
		return idofcase + " " + date;
	}
	public static void readOption() {
		int cont = 1;
		int id = 0;
		Date d;
		Scanner scanner = new Scanner(System.in);
		
		while (cont!=0){
		System.out.println("Πατηστε 1 για μαθητη και 2 για καθηγητη");
		cont = scanner.nextInt();
		
		switch(cont){
		case 0:
			break;
		case 1:
			System.out.println("Παρακαλω δωστε το id του μαθητη");
			id = scanner.nextInt();
			d = new Date();
			addNewCase(id, d);
			break;
		case 2:
			System.out.println("Παρακαλω δωστε το id του καθηγητη");
			d = new Date();
			id = scanner.nextInt();
			addNewCase(id, d);
			break;
		default:
			System.out.println("Λαθος καταχωρηση");
		}
	
	    }

	}
	public static void addNewCase(int idofcase, Date date ) {
		Case c = new Case(idofcase, date);
	}
	
}
