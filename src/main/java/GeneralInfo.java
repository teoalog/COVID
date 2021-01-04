import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class GeneralInfo extends JFrame {

	private JPanel pgeneralinfo;
	private JFrame fgeneralinfo;

	/**
	 * Create the frame.
	 */
	public GeneralInfo() {
		pgeneralinfo = new JPanel();
		fgeneralinfo = new JFrame();
		fgeneralinfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fgeneralinfo.setBounds(100, 100, 500, 300);
		fgeneralinfo.setVisible(true);
		fgeneralinfo.setTitle("General information about SARS-CoV-2");
		fgeneralinfo.getContentPane().add(pgeneralinfo);
		pgeneralinfo.setLayout(null);
		
		
	}

}
