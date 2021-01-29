package covid;

import javax.swing.*;

public class Help extends JFrame {

    private static final String text = "Start page ribbon"
            + "\n\nHome: Go to the start page."
            + "\n\nAbout COVID-19: See information about the coronavirus."
            + "\n\n\tGeneral information: Check out general information about SARS-CoV-2, symptoms to look out for & the most effective prevention methods."
            + "\n\n\tRelated to Education: Check out more specific information regarding schools."
            + "\n\nStatistics: See quantitative data concerning the pandemic."
            + "\n\n\tMaps: Interact with the National Public Health Organization’s map, containing information about the regional impact of the pandemic."
            + "\n\n\tGraphs: Check out the official data from the World Health Organization, including interactive graphs, showing the true scale of the pandemic."
            + "\n\nLogin: Go to the Login page. Here, the administrator can enter his credentials to obtain access to the Administrator’s page."
            + "\nIn case they forget the password, they are prompted to enter an email address to be contacted by our support team."
            + "\n\nHelp: You are here! Understand the fundamentals of the COVID-19 School App."
            + "\n\nExit: Exit the App. Sure you want to do this?"
            + "\n\n\nAdministrator’s page ribbon"
            + "\n\nAdd a case: Add a new confirmed case of a student or teacher by entering their ID. The option to inform the students and teacher of the case’s class is also given."
            + "\n\nFind: Select one of the options to find a specific Case, Student, Teacher or School, using the respective ID, and check the associated status."
            + "\nSelect the “Hospital” option to find the nearest reference hospital of a particular School."
            + "\n\nView data: By selecting one of the options, all data related to saved Students, Teachers, Schools and Hospitals can be seen. Data about saved Cases can also be retrieved for statistical purposes."
            + "\n\nLog out: Log out of the Administrator’s page.";

    /* Creates the frame to display a scrollable text area containing the above text.
     * Shows instructions for the application user (User Manual).
     */
    public Help() {
        JFrame fhelp = new JFrame();
        fhelp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fhelp.setBounds(150, 100, 1250, 600);
        fhelp.setVisible(true);
        fhelp.setTitle("Help");
        JTextArea textArea = new JTextArea(text);
        textArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(textArea);
        fhelp.add(scroll);
    }
}
