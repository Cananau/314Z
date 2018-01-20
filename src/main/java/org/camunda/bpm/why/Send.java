package org.camunda.bpm.why;

import java.util.logging.Logger;

import javax.mail.MessagingException;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class Send implements JavaDelegate {
	
	public static void mail (String subject, String content, String email) throws MessagingException {
		SendMail.sendMail(subject, content, email);
	}
	
	private final static Logger LOGGER = Logger.getLogger("LOAN-REQUESTS");

	  public void execute(DelegateExecution execution) throws Exception {
		  String email = (String) execution.getVariable("email");
		  
		  
		mail("Ihre Anfordeung wurde erfüllt","Ihre Anforderung wurde erfüllt und wir bedanken uns dass Sie unsere Service benutzt haben.",email);
	  }

}
