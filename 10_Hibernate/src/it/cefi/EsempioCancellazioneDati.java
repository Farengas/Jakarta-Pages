package it.cefi;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import it.cefi.models.Studente;

public class EsempioCancellazioneDati {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure(new File("hibernate.cfg.xml"))
				   										   .buildSessionFactory();
		
		try (Session session = sessionFactory.openSession()) {
			session.getTransaction().begin();
			Studente studente = session.get(Studente.class, 7);
			session.remove(studente);
			session.getTransaction().commit();
		}
		
		
	}

}
