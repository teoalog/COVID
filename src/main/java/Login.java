import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel plogin;
	private JFrame flogin;
	private String schoolid;
	private String passw;
	private static final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

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
			/* When the Login Button is clicked, we check if the schoolid and the password is correct.
			 * If so we open the Administrator page, and otherwise we ask for another try */
			public void actionPerformed(ActionEvent e) {
				try {
					//if..else
				} catch (NullPointerException exc) {
					JOptionPane.showMessageDialog(null, "Wrong School ID or Password", "Please try again.", JOptionPane.ERROR_MESSAGE);
				} finally {
					dispose();
					JOptionPane.showMessageDialog(null, "We redirecting you to the Administrator's page. \nPlease wait...");
					AdministratorPage admin = new AdministratorPage();
			}
			}
		});
		lbutton.setBounds(191, 97, 80, 25);
		plogin.add(lbutton);
		
		JButton fpbutton = new JButton("Forgot Password?");
		fpbutton.addActionListener(new ActionListener() {
			/* When the Forgot Password Button is clicked, the user enters a contact email.
			 * We check if it is correct and we inform the user. */
			public void actionPerformed(ActionEvent e) {
				String email = JOptionPane.showInputDialog(null, "Write your e-mail and we will contact you for support. \nEmail: ",
						"Don't worry!", JOptionPane.INFORMATION_MESSAGE);
				while(isValidEmailAddress(email)== false) {
					JOptionPane.showMessageDialog(null, "Wrong Email address", "Please try again.", JOptionPane.ERROR_MESSAGE);
					email = JOptionPane.showInputDialog(null, "Write your e-mail and we will contact you for support. \nEmail: ",
							"Don't worry!", JOptionPane.INFORMATION_MESSAGE);
				}
				JOptionPane.showMessageDialog(null, "Thank you. We will contact you soon.");
				setVisible(false);
			}
		});
		fpbutton.setBounds(142, 134, 137, 29);
		plogin.add(fpbutton);
		
		
	}

	protected boolean isValidEmailAddress(String email) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
		
	}
}
