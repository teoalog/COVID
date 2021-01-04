import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
		fadmin.setTitle("");
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
						"Click a button", JOptionPane.DEFAULT_OPTION, null, choices, choices[0]);
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
		
		JMenu mnNewMenu_2 = new JMenu("Log out");
		mnNewMenu_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		menuBar.add(mnNewMenu_2);
		
	
	}
}
