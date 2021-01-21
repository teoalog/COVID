import javax.swing.JFrame;
import javax.swing.JPanel;

public class Help extends JFrame {

	private JPanel phelp;
	private JFrame fhelp;

	/* Create the frame */
	public Help() {
		phelp = new JPanel();
		fhelp = new JFrame();
		fhelp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fhelp.setBounds(530, 240, 500, 300);
		fhelp.setVisible(true);
		fhelp.setTitle("Help");
		fhelp.getContentPane().add(phelp);
		phelp.setLayout(null);
	}
	/* Shows instructions for the user of the application. */
}
