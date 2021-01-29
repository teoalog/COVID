package covid;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SchoolApp {

    private JFrame frmCovidSchoolApp;

    /* Launch the application. */
    public static void main(String[] args) {
        Read.readText("Student.txt", "Student");
        Read.readText("Teacher.txt", "Teacher");
        Read.readText("Class.txt", "Class");
        Read.readText("School.txt", "School");
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SchoolApp window = new SchoolApp();
                    window.frmCovidSchoolApp.setVisible(true);
                    window.initialize();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /* Create the application. */
    public SchoolApp() {
        initialize();
    }

    /* Initialize the contents of the frame. */
    private void initialize() {

        frmCovidSchoolApp = new JFrame();
        frmCovidSchoolApp.setTitle("COVID-19 School App");
        frmCovidSchoolApp.setBounds(270, 130, 960, 650);
        frmCovidSchoolApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon img = new ImageIcon("background.jpeg");
        JLabel background = new JLabel(img);
        frmCovidSchoolApp.add(background);

        /* Setting up the menu */
        JMenuBar menuBar = new JMenuBar();
        frmCovidSchoolApp.setJMenuBar(menuBar);

        JMenu mnHome = new JMenu("Home");
        mnHome.addMouseListener(new MouseAdapter() {
            /* When this menu is clicked, it prompts to the Homepage */
            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });
        menuBar.add(mnHome);

        JMenu mnNewMenu_1 = new JMenu("About COVID-19");
        menuBar.add(mnNewMenu_1);

        JMenu mntmNewMenuItem = new JMenu("General information");
        mntmNewMenuItem.addMouseListener(new MouseAdapter() {
            /* When this menu is clicked, it goes to the Window General Information */
            @Override
            public void mouseClicked(MouseEvent e) {
                new GeneralInfo();
            }
        });
        mnNewMenu_1.add(mntmNewMenuItem);

        JMenu mntmNewMenuItem_1 = new JMenu("Related to Education");
        mntmNewMenuItem_1.addMouseListener(new MouseAdapter() {
            /* When this menu is clicked, it goes to the Window Information related to Education and COVID-19 */
            @Override
            public void mouseClicked(MouseEvent e) {
                new RelatedToEdu();
            }
        });
        mnNewMenu_1.add(mntmNewMenuItem_1);

        JMenu mnNewMenu = new JMenu("Statistics");
        menuBar.add(mnNewMenu);

        JMenu mntmNewMenuItem_2 = new JMenu("Maps");
        mntmNewMenuItem_2.addMouseListener(new MouseAdapter() {
            /* When this menu is clicked, it goes to the Window displaying the Map */
            @Override
            public void mouseClicked(MouseEvent e) {
                new Maps();
            }
        });
        mnNewMenu.add(mntmNewMenuItem_2);

        JMenu mntmNewMenuItem_3 = new JMenu("Graphs");
        mntmNewMenuItem_3.addMouseListener(new MouseAdapter() {
            /* When this menu is clicked, it goes to the Window with Graphs */
            @Override
            public void mouseClicked(MouseEvent e) {
                new Graphs();
            }
        });
        mnNewMenu.add(mntmNewMenuItem_3);

        JMenu mnNewMenu_2 = new JMenu("Login");
        mnNewMenu_2.addMouseListener(new MouseAdapter() {
            /* When this menu is clicked, it goes to the Login Page */
            @Override
            public void mouseClicked(MouseEvent e) {
                new Login();
            }
        });
        menuBar.add(mnNewMenu_2);

        JMenu mnNewMenu_3 = new JMenu("Help");
        mnNewMenu_3.addMouseListener(new MouseAdapter() {
            /* When this menu is clicked, it goes to the Help page */
            @Override
            public void mouseClicked(MouseEvent e) {
                new Help();
            }
        });

        menuBar.add(mnNewMenu_3);

        JMenu mnNewMenu_4 = new JMenu("Exit");
        mnNewMenu_4.addMouseListener(new MouseAdapter() {
            /* When this menu is clicked, it exits the program */
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
        menuBar.add(mnNewMenu_4);
    }
}
