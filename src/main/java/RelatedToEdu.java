package covid;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RelatedToEdu extends JFrame {

	private JPanel pedu;
	private JFrame fedu;

	/* Create the frame. */
	public RelatedToEdu() {
		pedu = new JPanel();
		fedu = new JFrame();
		fedu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fedu.setBounds(530, 240, 500, 300);
		fedu.setVisible(true);
		fedu.setTitle("Information about SARS-CoV-2 related to Education");
		fedu.getContentPane().add(pedu);
		pedu.setLayout(null);
	}
	/* Show information for COVID-19 related to Education. */
}
