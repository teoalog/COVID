import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI {

	private JFrame frmCovidSchoolApp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmCovidSchoolApp.setVisible(true);
					window.initialize();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmCovidSchoolApp = new JFrame();
		frmCovidSchoolApp.setVisible(true);
		frmCovidSchoolApp.setTitle("COVID-19 School App");
		frmCovidSchoolApp.setBounds(400, 200, 750, 400);
		frmCovidSchoolApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* Setting up the menu */
		JMenuBar menuBar = new JMenuBar();
		frmCovidSchoolApp.setJMenuBar(menuBar);
		
		JMenu mnHome = new JMenu("Home");
		mnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmCovidSchoolApp.setVisible(true);
			}
		});
		menuBar.add(mnHome);
		
		JMenu mnNewMenu_1 = new JMenu("About COVID-19");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("General information");
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GeneralInfo ginfo = new GeneralInfo();
				ginfo.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Related with Education");
		mntmNewMenuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RelatedwithEdu edu = new RelatedwithEdu();
				edu.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu = new JMenu("Statistics");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Maps");
		mntmNewMenuItem_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel pmaps = new JPanel();
				JFrame fmaps = new JFrame();
				fmaps.setBounds(530, 240, 500, 300);
				fmaps.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				fmaps.setVisible(true);
				fmaps.getContentPane().add(pmaps);
				fmaps.setTitle("Maps");
				pmaps.setLayout(null);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Graphs");
		mntmNewMenuItem_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel pgraphs = new JPanel();
				JFrame fgraphs = new JFrame();
				fgraphs.setBounds(530, 240, 500, 300);
				fgraphs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				fgraphs.setVisible(true);
				fgraphs.getContentPane().add(pgraphs);
				fgraphs.setTitle("Login");
				pgraphs.setLayout(null);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_2 = new JMenu("Login");
		mnNewMenu_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login log = new Login();
				log.setVisible(true);	
			}
		});
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Help");
		mnNewMenu_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Help h1 = new Help();
				h1.setVisible(true);
			}
		});
		
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_4 = new JMenu("Exit");
		mnNewMenu_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		menuBar.add(mnNewMenu_4);
		
		
	}
		
}
