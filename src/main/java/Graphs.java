import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphs extends JFrame {

	private JPanel pgraphs;
	private JFrame fgraphs;

	/**
	 * Create the frame.
	 */
	public Graphs() {
		pgraphs = new JPanel();
		fgraphs = new JFrame();
		fgraphs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fgraphs.setBounds(530, 240, 500, 300);
		fgraphs.setVisible(true);
		fgraphs.setTitle("Graphs");
		fgraphs.getContentPane().add(pgraphs);
		pgraphs.setLayout(null);
	}

}
