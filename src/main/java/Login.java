package covid;

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

	private static JPanel plogin;
	private static JFrame flogin;
	private static String schoolid;
	private static String passw;
	private static final String REGEX = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

	/* Create the frame. */
	public Login() {
		plogin = new JPanel();
		flogin = new JFrame();
		flogin.setBounds(530, 240, 500, 300);
		flogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		flogin.setVisible(true);
		flogin.setTitle("Login");
		flogin.add(plogin);
		plogin.setLayout(null);
		
		JLabel user = new JLabel("School ID");
		user.setBounds(10, 20, 80, 25);
		plogin.add(user);
		
		JTextField username = new JTextField();
		username.setBounds(100, 20, 165, 25);
		plogin.add(username);
		
		JLabel password = new JLabel("Password");
		password.setBounds(10, 50, 80, 25);
		plogin.add(password);
		
		JPasswordField enterpass = new JPasswordField();
		enterpass.setBounds(100, 50, 165, 25);
		plogin.add(enterpass);
		
		JButton lbutton = new JButton("Log In");
		lbutton.setBounds(191, 97, 80, 25);
		plogin.add(lbutton);

		lbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					schoolid = username.getText();
					passw = enterpass.getText();
					if (checkCredentials(Integer.parseInt(schoolid), passw)) {
						flogin.dispose();
						JOptionPane.showMessageDialog(null, "We are redirecting you to the Administrator's page.\nPlease wait...");
						AdministratorPage admin = new AdministratorPage();
					} else {
						JOptionPane.showMessageDialog(null, "Wrong School ID or Password", "Please try again.", JOptionPane.ERROR_MESSAGE);
					}
			}
		});
		
		JButton fpbutton = new JButton("Forgot Password?");
		fpbutton.addActionListener(new ActionListener() {
			/* When the Forgot Password Button is clicked, the user enters a contact email.
			 * We check if it is correct and we inform the user. */
			public void actionPerformed(ActionEvent e) {
				String email = JOptionPane.showInputDialog(null, "Write your e-mail and we will contact you for support.\nEmail: ",
						"Don't worry!", JOptionPane.INFORMATION_MESSAGE);
				while (isValidEmailAddress(email) == false) {
					JOptionPane.showMessageDialog(null, "Wrong Email address", "Please try again.", JOptionPane.ERROR_MESSAGE);
					email = JOptionPane.showInputDialog(null, "Write your e-mail and we will contact you for support.\nEmail: ",
							"Don't worry!", JOptionPane.INFORMATION_MESSAGE);
				}
				JOptionPane.showMessageDialog(null, "Thank you. We will contact you soon.");
				plogin.setVisible(false);
				flogin.setVisible(false);
			}
		});
		fpbutton.setBounds(142, 134, 137, 29);
		plogin.add(fpbutton);
	}

	/* The following method checks if the email address is valid. */
	protected boolean isValidEmailAddress(String email) {
		Pattern pattern = Pattern.compile(REGEX);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	private boolean checkCredentials(int id, String password) {
		int pos = School.findSchool(id);
		System.out.println(pos);
		System.out.println(School.allpasswords.get(pos));
		System.out.println(School.allschools.get(pos));
		System.out.println(id);
		System.out.println(password);
		if (pos == -1) {
			return false;
		} else {
			return password.equals(School.allpasswords.get(pos));
		}
	}
}
