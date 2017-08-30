
package infirmayregister;


import java.util.Properties;
import java.util.*;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {
    
    

    public SendEmail(String to, String sub, String msg) {
        
                final String username  ="arjunreddykothakota@gmail.com";
                final String password="iamhappy";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

        
        try{
            
            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress("arjunreddykothakota@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            
            message.setSubject(sub);
            message.setText(msg);

            Transport.send(message);
            
            System.out.println("Mail is Sent");
            
        
        }
        
        catch(Exception e){
            throw new RuntimeException();
        }
        
        
        
    }
    
    
    
}
