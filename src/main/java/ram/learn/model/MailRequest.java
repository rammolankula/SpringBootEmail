package ram.learn.model;

import lombok.Data;

@Data
public class MailRequest {
	/*
	 * it is a class to create a Mail Request Example as below
	 * 
	 * { 
	 * "name": "Ram", 
	 * "to":"ram.m@olivecrypto.com", 
	 * "from": "ramu.molankula.poorna@gmail.com",
	 * "subject": "Email Check" 
	 * }
	 * 
	 * 
	 * To specify source to receiver 
	 * 
	 */
	private String name;
	private String to;
	private String from;
	private String subject;

}
