package ram.learn.emailservice;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import ram.learn.model.MailRequest;
import ram.learn.model.MailResponse;



@Service
public class EmailService {
	
	
	@Autowired
	private JavaMailSender sender;
	
	
	@Autowired
	private Configuration config;
	
	
	public MailResponse sendEmail(MailRequest request, Map<String, Object> model) {
		/*To Creating object to create the Response mail*/
		MailResponse response = new MailResponse();
		
		/* Creating Mimemessage object to send created response*/
		MimeMessage message = sender.createMimeMessage();
		try {
			// set mediaType /*MIME Message Helper is used represents the style message*/
			MimeMessageHelper helper = new MimeMessageHelper(message, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
					StandardCharsets.UTF_8.name());
			// add attachment
			//helper.addAttachment("logo.png", new ClassPathResource("logo.png"));

			/*To specify the source folder of template which we have created*/
			Template t = config.getTemplate("templateEmail.ftl");
			
			/*freeMarker to read the data which we have provided in template.ftl FreeMarker*/
			String html = FreeMarkerTemplateUtils.processTemplateIntoString(t, model);

			/*Setting the Request JSON to Message helper of mime*/
			helper.setTo(request.getTo());
			helper.setText(html, true);
			helper.setSubject(request.getSubject());
			helper.setFrom(request.getFrom());
			//Sending To receiver
			sender.send(message);
          
			//after the sending mail to receiver to preparing response to send Request initiator
			response.setMessage("mail send to : " + request.getTo());
			response.setStatus(Boolean.TRUE);

		} catch (MessagingException | IOException | TemplateException e) {
			response.setMessage("Mail Sending failure : "+e.getMessage());
			response.setStatus(Boolean.FALSE);
		}

		return response;
	}


}
