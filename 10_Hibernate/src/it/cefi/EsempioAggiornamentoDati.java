package it.cefi;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import it.cefi.models.Studente;

public class EsempioAggiornamentoDati {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure(new File("hibernate.cfg.xml"))
				   										   .buildSessionFactory();
		
		try (Session session = sessionFactory.openSession()) {
			session.getTransaction().begin();
			Studente studente = session.get(Studente.class, 8);
			studente.setCognome("Reale");
			// Il metodo merge assicura l'aggiornamento dei dati anche se l'oggetto proxy è detached.
			session.merge(studente);
			session.getTransaction().commit();
		}
		
	}

}
