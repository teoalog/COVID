package src.main.java;

import javax.swing.*;
import java.awt.*;
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
		
		JMenuBar menuBar = new JMenuBar();
		frmCovidSchoolApp.setJMenuBar(menuBar);
		
		JMenu mnHome = new JMenu("Home");
		mnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		menuBar.add(mnHome);
		
		JMenu mnNewMenu_1 = new JMenu("About COVID-19");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("General information");
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Related with Education");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu = new JMenu("Statistics");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Map");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Graphs");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_2 = new JMenu("Login");
		mnNewMenu_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel loginpanel = new JPanel();
				JFrame loginframe = new JFrame();
				loginframe.setBounds(530, 240, 500, 300);
				loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				loginframe.setVisible(true);
				loginframe.getContentPane().add(loginpanel);
				loginframe.setTitle("Login");
				loginpanel.setLayout(null);
				
				JLabel user = new JLabel("School ID");
				user.setBounds(10, 20, 80, 25);
				loginpanel.add(user);
				
				JTextField username = new JTextField(20);
				username.setBounds(100, 20, 165, 25);
				loginpanel.add(username);
				
				JLabel password = new JLabel("Password");
				password.setBounds(10, 50, 80, 25);
				loginpanel.add(password);
				
				JPasswordField enterpass = new JPasswordField();
				enterpass.setBounds(100, 50, 165, 25);
				loginpanel.add(enterpass);
				
				JButton lbutton = new JButton("Log In");
				lbutton.setBounds(10, 80, 80, 25);
				loginpanel.add(lbutton);
				
				JButton fpbutton = new JButton("Forgot Password?");
				fpbutton.setBounds(100, 80, 180, 25);
				loginpanel.add(fpbutton);
			}
		});
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Help");
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
