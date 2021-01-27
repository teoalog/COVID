package covid;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.TextArea;

public class Messages extends JFrame{
	
	private JPanel pmenu;
	private JFrame fmenu;
	
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
		/* Display the correct message according to the new case added (Student or Teacher) */
		if (o.equals("Student")) {
			Student st = Student.findStudent(id);
			Class cl = Class.findClass(st);
			String stmess = "ATTENTION!"+ "\n" + "A student of the class " + cl.getName() + " has been tested positive for COVID-19 and due to NPHO protocols for coronavirus transmission," 
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
			"If any student with no symptoms decides to be PCR tested for their own reason:"
			+ "\n" + "Should the test return a positive result, the student must remain in quarantine until 10 days have passed from the day they were tested (provided no symptoms appear)."
			+ "\n" + "Should the test return a negative result, the student must still remain in quarantine until 14 days have passed.\n"
			+ "\n" + 
			"The class will be closed during these 14 days and all areas will be thoroughly decontaminated.\n"
			+ "\n" +
			"Stay safe!\n";
			TextArea textArea = new TextArea(stmess);
			pmenu.add(textArea);
		} else {
			Teacher t = Teacher.findTeacher(id);
			Class cl = Class.findClass(t);
			String tmess = "ATTENTION!"+ "\n" + "A teacher has been tested positive for COVID-19 and due to NPHO protocols for coronavirus transmission," 
			+"\n" + "the students of the class " + cl.getName() + " need to abide by the following instructions, in order to prevent the further spread of the virus." 
			+ "\n" + "The teacher lectured in those classes for at least 2 hours in the 2 days prior to his showing symptoms.\n"
			+ "* Quarantine for a period of 14 days, before they return to school.\n"
			+ "\n"
			+ "If any symptoms compatible with COVID-19 are observed during this period, a PCR test should immediately be conducted."
			+ "\n" + "Should the test return a positive result, the student is considered a confirmed case and further instructions may be provided." 
			+ "\n" + "Should the test return a negative result, the student must still remain in quarantine until 14 days have passed.\n"
			+ "\n" + 
			"The testing of all students -including the ones with no symptoms- is not advised.\n"
			+ "\n"
			+ "If any student with no symptoms decides to be PCR tested for their own reason:"
			+ "\n" + "Should the test return a positive result, the student must remain in quarantine until 10 days have passed from the day they were tested (provided no symptoms appear)."
			+ "\n" + "Should the test return a negative result, the student must still remain in quarantine until 14 days have passed.\n"
			+ "\n" + 
			"The classes will be closed during these 14 days and all areas will be thoroughly decontaminated.\n"
			+ "\n" +
			"Stay safe!\n";
			TextArea textArea = new TextArea(tmess);
			pmenu.add(textArea);
		}
		
		JButton btnNewButton = new JButton("Send notification");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();

				JOptionPane.showMessageDialog(null, "A notification has been sent to the parents' and teachers' emails.\nStay safe!");
			}
		});
		btnNewButton.setBounds(180, 237, 138, 29);
		pmenu.add(btnNewButton);
		
	}
}
	