package it.polito.ai.businesslogic;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/* Il ContextListener si interfaccia con il container e riceve delle chiamate quando capita qualcosa di significativo.
 * Il codice vive nel container che ha ciclo vitale: accensione, spengnimento, ricezione delle richieste etc..
 * Utlizzato per gestire delle attività in background che durano per tutta la vita del contenitore.
 * */

@WebListener
public class AppContextListener implements ServletContextListener, HttpSessionListener {

	private ServletContext context = null;

	public void contextInitialized(ServletContextEvent contextEvent) {
		System.out.println("ServletContextListener started");	
		Set<TravelDocument> travelDocuments = new HashSet<TravelDocument>();
		
		/* Riempire il set con i vari travelDocument, bisogna ancora
		 * implementare i dettagli per distinguere i vari ticket*/
		
		this.context = contextEvent.getServletContext();
		context.setAttribute("test", "second");
	}

	public void contextDestroyed(ServletContextEvent contextEvent) {
		System.out.println("ServletContextListener destroyed");	

		this.context = null;
	}

	public void sessionCreated(HttpSessionEvent sessionEvent) {
		System.out.println("Session Created: ID=" + sessionEvent.getSession().getId());
		sessionEvent.getSession().setAttribute("loginService", new LoginServiceImpl());
		sessionEvent.getSession().setAttribute("cartService", new CartServiceImpl());
		sessionEvent.getSession().setAttribute("paymentService", new PaymentServiceImpl());

	}

	public void sessionDestroyed(HttpSessionEvent sessionEvent) {
		System.out.println("Session Destroyed: ID=" + sessionEvent.getSession().getId());	
	}





}
