package org.camunda.bpm.why;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class PullRequest implements JavaDelegate {
	
	  private final static Logger LOGGER = Logger.getLogger("LOAN-REQUESTS");

	  public void execute(DelegateExecution execution) throws Exception {
	    LOGGER.info("Pull-Request wird gesendet; Art der Änderung:" + execution.getVariable("anderung") + "'...");
	    LOGGER.info("Pull-Request wird gesendet; Kunde ID:" + execution.getVariable("kundeid") + "'...");
	  }

}
