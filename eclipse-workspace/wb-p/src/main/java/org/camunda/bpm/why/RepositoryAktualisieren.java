package org.camunda.bpm.why;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class RepositoryAktualisieren implements JavaDelegate {
	private final static Logger LOGGER = Logger.getLogger("LOAN-REQUESTS");

	  public void execute(DelegateExecution execution) throws Exception {
	    LOGGER.info("Repository wird aktualisiert; Art der Änderung:" + execution.getVariable("anderung") + "'...");
	    LOGGER.info("Repository wird aktualisiert; Kunde ID:" + execution.getVariable("kundeid") + "'...");
	  }

}
