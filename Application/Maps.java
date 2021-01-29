package covid;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Maps extends JFrame {

    /* Opens webpage (in browser) of the Hellenic Government COVID-19 map. */
    public Maps() {
        try {
            Desktop web = Desktop.getDesktop();
            web.browse(new URI("https://covid19.gov.gr/covid-map/"));
        } catch (IOException | URISyntaxException e) {
            JOptionPane.showMessageDialog(null, "Connection to the website failed",
                    "Error: " + e.getMessage() + "Please try again or contact us.", JOptionPane.ERROR_MESSAGE);
        }
    }
}
