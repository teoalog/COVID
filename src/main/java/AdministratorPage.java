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
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		menuBar.add(mnNewMenu_1);
	}
}
