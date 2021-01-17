import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/* This window is for the responsible person for COVID-19 in every school. 
 * To access, you need the school id and the password.
 */

public class AdministratorPage extends JFrame {

	private JPanel padmin;
	private JFrame fadmin;

	/* Create the frame. */
	public AdministratorPage() {
		padmin = new JPanel();
		fadmin = new JFrame();
		fadmin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fadmin.setBounds(530, 240, 500, 300);
		fadmin.setVisible(true);
		fadmin.setTitle("Welcome!");
		fadmin.getContentPane().add(padmin);
		padmin.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		fadmin.setJMenuBar(menuBar);
		/* Menu to add a new Case. */
		JMenu mnNewMenu = new JMenu("Add a case");
		mnNewMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object[] choices = {"Student", "Teacher"};
				Object option = JOptionPane.showInputDialog(null, "Would you like to add a COVID-19 case referring to a Student or a Teacher?", 
						"Choose an option", JOptionPane.DEFAULT_OPTION, null, choices, choices[0]);
				Case.readOption(option);
				int reply = JOptionPane.showConfirmDialog(null, "Would you like to notify all contacts of the case? ", 
						"Send notification message", JOptionPane.YES_NO_OPTION);
				if(reply == JOptionPane.YES_OPTION) {
					Messages m = new Messages(option);					
				} else {
					
				}
			}
		});
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Find");
		menuBar.add(mnNewMenu_1);
		
		/* Menu to find a previous Case. */
		JMenu mnNewMenu_1_2 = new JMenu("Previous Case");
		mnNewMenu_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = JOptionPane.showInputDialog(null, "Please enter the ID of the Case you wish to find: ",
						"Enter Case ID");
				Case c = Case.findPreviousCase(Integer.parseInt(id));
				if (c.equals(null)) {
					JOptionPane.showMessageDialog(null, "The Case with ID: " + id + " was not found in our Database.");
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Here is the information about the Case you looked for: " + c.toString());
				}
			}
		});
		mnNewMenu_1.add(mnNewMenu_1_2);
		/* Menu to find a Student. */
		JMenu mnNewMenu_1_3 = new JMenu("Student");
		mnNewMenu_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = JOptionPane.showInputDialog(null, "Please enter the ID of the Student you wish to find: ",
						"Enter Student ID");
				Student s = Student.findStudent(Integer.parseInt(id));
				if (s.equals(null)) {
					JOptionPane.showMessageDialog(null, "The Student with ID: " + id + " was not found in our Database.");
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Here is the information about the Student you looked for: " + s.toString());
				}
			}
		});
		mnNewMenu_1.add(mnNewMenu_1_3);
		/* Menu to find a Teacher. */
		JMenu mnNewMenu_1_4 = new JMenu("Teacher");
		mnNewMenu_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = JOptionPane.showInputDialog(null, "Please enter the ID of the Teacher you wish to find: ",
						"Enter Teacher ID");
				Teacher t = Teacher.findTeacher(Integer.parseInt(id));
				if (t.equals(null)) {
					JOptionPane.showMessageDialog(null, "The Teacher with ID: " + id + " was not found in our Database.");
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Here is the information about the Teacher you looked for: " + t.toString());
				}
			}
		});
		mnNewMenu_1.add(mnNewMenu_1_4);
		/* Menu to find a School. */
		JMenu mnNewMenu_1_5 = new JMenu("School");
		mnNewMenu_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = JOptionPane.showInputDialog(null, "Please enter the ID of the School you wish to find: ",
						"Enter School ID");
				School sch;
				if (Integer.parseInt(id) != -1) {
					sch = School.allschools.get(Integer.parseInt(id));
					JOptionPane.showMessageDialog(null, "Here is the information about the School you looked for: " + sch.toString());
				} else {
					JOptionPane.showMessageDialog(null, "The School with ID: " + id + " was not found in our Database.");
					dispose();
				}
			}
		});
		mnNewMenu_1.add(mnNewMenu_1_5);
		/* Menu to find a Hospital in the area of the given School. */
		JMenu mnNewMenu_1_6 = new JMenu("Hospital");
		mnNewMenu_1_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = JOptionPane.showInputDialog(null, "Please enter the ID of the School to find the nearest reference hospital in the area: ",
						"Enter School ID");
				Hospital h = Hospital.findHospital(Integer.parseInt(id));
				if (h.equals(null)) {
					JOptionPane.showMessageDialog(null, "We are sorry but we did not find a hospital in the area of the School with ID: " + id);
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Here is the information about the Hospital nearest to the School with ID: " 
							+ id + "\n" + h.toString());	
				}
			}
		});
		mnNewMenu_1.add(mnNewMenu_1_6);
		
		JMenu mnNewMenu_2 = new JMenu("View data");
		menuBar.add(mnNewMenu_2);
		/* Menu to view All Cases entered in the Application. */
		JMenu mnNewMenu_2_2 = new JMenu("All Cases");
		mnNewMenu_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Case.getAllcases();
			}
		});
		mnNewMenu_2.add(mnNewMenu_2_2);
		/* Menu to view All Students registered in the Application. */
		JMenu mnNewMenu_2_3 = new JMenu("All Students");
		mnNewMenu_2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Student.getAllstudents();
			}
		});
		mnNewMenu_2.add(mnNewMenu_2_3);
		/* Menu to view All Teachers registered in the Application. */
		JMenu mnNewMenu_2_4 = new JMenu("All Teachers");
		mnNewMenu_2_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Teacher.getAllteachers();
			}
		});
		mnNewMenu_2.add(mnNewMenu_2_4);
		/* Menu to view All Schools registered in the Application. */
		JMenu mnNewMenu_2_5 = new JMenu("All Schools");
		mnNewMenu_2_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				School.getAllschools();
			}
		});
		mnNewMenu_2.add(mnNewMenu_2_5);
		/* Menu to view All reference Hospitals for COVID-19. */
		JMenu mnNewMenu_2_6 = new JMenu("All Hospitals");
		mnNewMenu_2_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Hospital.getAllhospitals();
			}
		});
		mnNewMenu_2.add(mnNewMenu_2_6);
		/* Menu to Log out of the Administrator's window. */
		JMenu mnNewMenu_3 = new JMenu("Log out");
		mnNewMenu_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				fadmin.dispose();
			}
		});
		menuBar.add(mnNewMenu_3);
		
		
		
	
	}
}
