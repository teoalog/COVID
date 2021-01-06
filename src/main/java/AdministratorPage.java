import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdministratorPage extends JFrame {

	private JPanel padmin;
	private JFrame fadmin;

	/**
	 * Create the frame.
	 */
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
		
		JMenu mnNewMenu = new JMenu("Add a case");
		mnNewMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object[] choices = {"Student", "Teacher"};
				Object option = JOptionPane.showInputDialog(null, "Would you like to add a case referring to a Student or a Teacher?", 
						"Choose an option", JOptionPane.DEFAULT_OPTION, null, choices, choices[0]);
				Case.readOption(option);
				
			}
		});
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Find");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_1_2 = new JMenu("Previous Case");
		mnNewMenu_1.add(mnNewMenu_1_2);
		
		JMenu mnNewMenu_1_3 = new JMenu("Student");
		mnNewMenu_1.add(mnNewMenu_1_3);
		
		JMenu mnNewMenu_1_4 = new JMenu("Teacher");
		mnNewMenu_1.add(mnNewMenu_1_4);
		
		JMenu mnNewMenu_1_5 = new JMenu("School");
		mnNewMenu_1.add(mnNewMenu_1_5);
		
		JMenu mnNewMenu_1_6 = new JMenu("Hospital");
		mnNewMenu_1.add(mnNewMenu_1_6);
		
		JMenu mnNewMenu_2 = new JMenu("View data");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_2_2 = new JMenu("All Cases");
		mnNewMenu_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Case.getAllcases();
			}
		});
		mnNewMenu_2.add(mnNewMenu_2_2);
		
		JMenu mnNewMenu_2_3 = new JMenu("All Students");
		mnNewMenu_2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Student.getAllstudents();
			}
		});
		mnNewMenu_2.add(mnNewMenu_2_3);
		
		JMenu mnNewMenu_2_4 = new JMenu("All Teachers");
		mnNewMenu_2_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Teacher.getAllteachers();
			}
		});
		mnNewMenu_2.add(mnNewMenu_2_4);
		
		JMenu mnNewMenu_2_5 = new JMenu("All Schools");
		mnNewMenu_2_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				School.getAllschools();
			}
		});
		mnNewMenu_2.add(mnNewMenu_2_5);
		
		JMenu mnNewMenu_2_6 = new JMenu("All Hospitals");
		mnNewMenu_2_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Hospital.getAllhospitals();
			}
		});
		mnNewMenu_2.add(mnNewMenu_2_6);
		
		JMenu mnNewMenu_3 = new JMenu("Log out");
		mnNewMenu_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		menuBar.add(mnNewMenu_3);
		
		
		
	
	}
}
