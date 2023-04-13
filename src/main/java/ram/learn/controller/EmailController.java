package ram.learn.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ram.learn.emailservice.EmailService;
import ram.learn.model.MailRequest;
import ram.learn.model.MailResponse;

@RestController
public class EmailController {
	/*
	 * Controller to send the request to receiver
	 * 
	 *  @RequestBody
	 *  Map<key,Value>
	 * 
	 * */
	
	@Autowired
	private EmailService service;

	@PostMapping("/sendingEmail")
	public MailResponse sendEmail(@RequestBody MailRequest request) {
		Map<String, Object> model = new HashMap<>();
		model.put("Name", request.getName());
		model.put("location", "Hyderabad,India");
		return service.sendEmail(request, model);

	}

}
