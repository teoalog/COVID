import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;

public class Login extends JFrame {

	private JPanel plogin;
	private JFrame flogin;
	private String schoolid;
	private String passw;

	/**
	 * Create the frame.
	 */
	public Login() {
		plogin = new JPanel();
		flogin = new JFrame();
		flogin.setBounds(530, 240, 500, 300);
		flogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		flogin.setVisible(true);
		flogin.setTitle("Login");
		flogin.getContentPane().add(plogin);
		plogin.setLayout(null);
		
		JLabel user = new JLabel("School ID");
		user.setBounds(10, 20, 80, 25);
		plogin.add(user);
		
		JTextField username = new JTextField(20);
		username.setBounds(100, 20, 165, 25);
		plogin.add(username);
		schoolid = username.getText();
		
		JLabel password = new JLabel("Password");
		password.setBounds(10, 50, 80, 25);
		plogin.add(password);
		
		JPasswordField enterpass = new JPasswordField();
		enterpass.setBounds(100, 50, 165, 25);
		plogin.add(enterpass);
		passw = enterpass.getText();
		
		JButton lbutton = new JButton("Log In");
		lbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null, "We redirecting you to the Administrator's page. \nPlease wait...");
				AdministratorPage admin = new AdministratorPage();
			}
		});
		lbutton.setBounds(191, 97, 80, 25);
		plogin.add(lbutton);
		
		JButton fpbutton = new JButton("Forgot Password?");
		fpbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email = JOptionPane.showInputDialog(null, "Write your e-mail and we will contact you for support. \nEmail: ",
						"Don't worry!", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		fpbutton.setBounds(142, 134, 137, 29);
		plogin.add(fpbutton);
		
		
	}
}
