import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Map;
import java.util.logging.Logger;

import javax.script.ScriptEngine;
import javax.script.ScriptException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Maps extends JFrame {

	private JPanel pmaps;
	private JFrame fmaps;

	/* Create the frame. */
	public Maps() {
		pmaps = new JPanel();
		fmaps = new JFrame();
		fmaps.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fmaps.setBounds(530, 240, 500, 300);
		fmaps.setVisible(true);
		fmaps.setTitle("Maps");
		fmaps.getContentPane().add(pmaps);
		pmaps.setLayout(null);
	}
	/* Display maps showing the situation of each school (closed or open due to COVID-19) */
}
