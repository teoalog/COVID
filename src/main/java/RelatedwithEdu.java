import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class RelatedwithEdu extends JFrame {

	private JPanel pedu;
	private JFrame fedu;

	/**
	 * Create the frame.
	 */
	public RelatedwithEdu() {
		pedu = new JPanel();
		fedu = new JFrame();
		fedu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fedu.setBounds(530, 240, 500, 300);
		fedu.setVisible(true);
		fedu.setTitle("Information about SARS-CoV-2 related to Education");
		fedu.getContentPane().add(pedu);
		pedu.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Are you a student, a parent or a teacher? \n "
				+ "Learn about the impact of COVID-19 on the educational system.");
		pedu.add(lblNewLabel, BorderLayout.NORTH);
	}

}
