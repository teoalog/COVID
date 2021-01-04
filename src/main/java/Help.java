import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Help extends JFrame {

	private JPanel phelp;
	private JFrame fhelp;

	/**
	 * Create the frame.
	 */
	public Help() {
		phelp = new JPanel();
		fhelp = new JFrame();
		fhelp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fhelp.setBounds(530, 240, 500, 300);
		fhelp.setVisible(true);
		fhelp.setTitle("General information about SARS-CoV-2");
		fhelp.getContentPane().add(phelp);
		phelp.setLayout(null);
	}

}
