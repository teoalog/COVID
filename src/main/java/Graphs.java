import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JOptionPane;

public class Graphs {

	private Desktop web = Desktop.getDesktop();
	
	public Graphs() {
		/* Opens page (in browser) with live COVID-19 statistics from all over the world */
		try {
			web.browse(new URI("https://covid19info.live"));
		} catch (IOException | URISyntaxException e) {
			JOptionPane.showMessageDialog(null, "Connection to the website failed", 
					"Error: " + e.getMessage() + "Please try again or contact us.", JOptionPane.ERROR_MESSAGE);
		}
	}
}
