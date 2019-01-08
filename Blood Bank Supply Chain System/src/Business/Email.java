/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author barua
 */
public class Email {

    public boolean sendMail(String strTo, String strSubject, String strBody, String password, String emailFrom) {
        String d_email = emailFrom,
                //d_password = "Rahul@12345",
                d_password = password,
                d_host = "smtp.gmail.com",
                d_port = "465";

        Properties props = new Properties();
        props.put("mail.smtp.user", d_email);
        props.put("mail.smtp.host", d_host);
        props.put("mail.smtp.port", d_port);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.socketFactory.port", d_port);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");

        try {
            Session session = Session.getDefaultInstance(props, null);
            MimeMessage msg = new MimeMessage(session);
            msg.setText(strBody);
            msg.setSubject(strSubject);
            msg.setFrom(new InternetAddress(d_email));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(strTo));
            msg.saveChanges();

            Transport transport = session.getTransport("smtp");
            transport.connect(d_host, d_email, d_password);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();
            return true;
        } catch (Exception mex) {
            mex.printStackTrace();
            return false;
        }

    }

}
