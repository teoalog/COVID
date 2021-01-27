package covid;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;

public class Mail {
    public static void sendMail(String recipient) {
        Properties properties = new Properties();

        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String email = "midisspin@gmail.com";
        String password = "midisspin123";

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(email, password);
            }
        });

        MimeMessage message = prepareMessage(session, email, recipient);

        try {
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public static MimeMessage prepareMessage(Session session, String email, String recipient) {
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(email));
            message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(recipient));
            message.setSubject("COVID case was found in the school!");
            message.setText("ATTENTION!\nA new case was found!");
            return message;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String args[]) {
        sendMail("jfurhgjtiuhkgngkg@gmail.com");
    }
}
