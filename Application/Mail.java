package covid;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;

public class Mail {

    /* Send email to given recipient using the corporate email account informaniacsteam@gmail.com. */
    public static void sendMail(String recipient, String text) {
        Properties properties = new Properties();

        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String email = "informaniacsteam@gmail.com";
        String password = "WeareInformaniacs!";

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(email, password);
            }
        });

        MimeMessage message = prepareMessage(session, email, recipient, text);

        try {
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    /* Prepares email message using given text. */
    public static MimeMessage prepareMessage(Session session, String email, String recipient, String text) {
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(email));
            message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(recipient));
            message.setSubject("A COVID-19 case was found in school!");
            message.setText(text);
            return message;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
