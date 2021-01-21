import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Messages extends JFrame{
	
	private JPanel pmenu;
	private JFrame fmenu;
	String stmess = "ATTENTION!"+ "\n" + "A student of class B1 has been tested positive for COVID-19 and due to NPHO protocols for coronavirus transmission," 
			+ "\n" +  "the students of this class need to abide by the following instructions, in order to prevent the further spread of the virus.\n"
			+ "\n" + 
			"* Quarantine for a period of 14 days, before they return to school.\n"
			+ "\n" + 
			"If any symptoms compatible with COVID-19 are observed during this period, a PCR test should immediately be conducted."
			+ "\n" + "Should the test return a positive result, the student is considered a confirmed case and further instructions may be provided." 
			+ "\n" + "Should the test return a negative result, the student must still remain in quarantine until 14 days have passed.\n"
			+ "\n" + 
			"The testing of all students -including the ones with no symptoms- is not advised.\n"
			+ "\n" + 
			"If any student with no symptoms decides to be PCR tested for their own reason: "
			+ "\n" + "Should the test return a positive result, the student must remain in quarantine until 10 days have passed from the day they were tested (provided no symptoms appear)."
			+ "\n" + "Should the test return a negative result, the student must still remain in quarantine until 14 days have passed.\n"
			+ "\n" + 
			"The class will be closed during these 14 days and all areas will be thoroughly decontaminated.\n"
			+ "\n" +
			"Stay safe!\n";
	String tmess = "ΠΡΟΣΟΧΗ!"+ "\n" + "Ένας Καθηγητής έχει διαγνωστεί ως θετικός στον Covid-19 και με βάση το πρωτόκολλο του ΕΟΔΥ για την διαχείριση του κορωνοϊου θα πρέπει να ακολουθηθούν" 
			+"\n" + "τα παρακάτω μέτρα για την αποφυγή της διασποράς του ιού από τους μαθητές των τμήματων Α2, Γ3 στα οποία είχε παρουσία τουλάχιστον" 
			+ "\n" + "2 διδακτικές ώρες, 48 ώρες πριν παρουσιάσει συμπτώματα του ιού.\n" + 
			"Είναι υποχρεωτική η παραμονή των μαθητών σε καραντίνα διάρκειας 14 ημερών και επιστροφή τους στο σχολείο μετά το πέρας των 14 ημερών. \n" + 
			"\n" + 
			"Εάν κατά τη διάρκεια της 14ήμερης καραντίνας, ο μαθητής εκδηλώσει συμπτώματα συμβατά με COVID-19, θα πρέπει να υποβληθεί σε εργαστηριακό έλεγχο."
			+"\n" + "Εάν το μοριακό τεστ είναι θετικό, αντιμετωπίζεται ως επιβεβαιωμένο περιστατικό." 
			+"\n" + "Εάν το μοριακό τεστ είναι αρνητικό, παραμένει σε καραντίνα έως την ολοκλήρωση του 14ημέρου. \n" + 
			"\n" + 
			"Δε συνίσταται καθολικός εργαστηριακός έλεγχος των ασυμπτωματικών μαθητών. \n" + 
			"\n" + 
			"Εάν κατά τη διάρκεια της 14ήμερης καραντίνας, ασυμπτωματικός μαθητής, κάνει με δική του πρωτοβουλία ή για εξατομικευμένους λόγους εργαστηριακό έλεγχο, τότε: "
			+"\n" + "Εάν το μοριακό τεστ είναι θετικό, παραμένει σε κατ’ οίκον απομόνωση για 10 ημέρες από την ημέρα διενέργειας του τεστ (εφόσον παραμένει ασυμπτωματικό). "
			+"\n" + "Εάν το μοριακό τεστ είναι αρνητικό, παραμένει σε καραντίνα έως την ολοκλήρωση του 14ημέρου.\n" + 
			"\n" + 
			"Τα τμήματα Α2, Γ3 θα παραμείνουν κλειστά για αυτές τις 14 ημερες και θα γίνει εντατικός καθαρισμός σε όλους τους χώρους. Μείνετε υγιείς!\n" + 
			"";

	/**
	 * Create the frame.
	 */
	public Messages(Object o) {
		pmenu = new JPanel();
		fmenu = new JFrame();
		fmenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fmenu.setBounds(530, 240, 500, 300);
		fmenu.setVisible(true);
		fmenu.setTitle("Message Notification");
		fmenu.getContentPane().add(pmenu);
		pmenu.setLayout(null);
		JLabel lblNewLabel1 = new JLabel(stmess);
		lblNewLabel1.setBounds(6, 6, 488, 243);
		pmenu.add(lblNewLabel1);
		/* Display the correct message according to the new case added (Student or Teacher) */
		if (o.equals("Student")) {
			JLabel lblNewLabel = new JLabel(stmess);
			lblNewLabel.setBounds(6, 6, 488, 243);
			pmenu.add(lblNewLabel);
		} else {
			JLabel lblNewLabel = new JLabel(tmess);
			lblNewLabel.setBounds(6, 6, 488, 243);
			pmenu.add(lblNewLabel);
		}
		
		JButton btnNewButton = new JButton("Send notification");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null, "Notification sent to parents' and teachers' phones. \nStay safe!");
			}
		});
		btnNewButton.setBounds(180, 237, 138, 29);
		pmenu.add(btnNewButton);
		
	}
}
	