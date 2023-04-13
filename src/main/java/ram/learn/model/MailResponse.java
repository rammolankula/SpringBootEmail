package ram.learn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MailResponse {
	/*
	 * MailResponse class for Status of mail which we have sended to receiver
	 * 
	 * { "status": true, "message": "mail send to : shailendrakp@olivecrypto.com " }
	 * 
	 * This Json we will get if mail reaches successfully to receiver
	 * 
	 **/
	private boolean status;
	private String message;

}
