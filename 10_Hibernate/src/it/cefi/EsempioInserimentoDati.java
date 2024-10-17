package it.cefi;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import it.cefi.models.Studente;

public class EsempioInserimentoDati {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure(new File("hibernate.cfg.xml"))
														   .buildSessionFactory();
		
		try (Session session = sessionFactory.openSession()) {
			session.getTransaction().begin();
			// Quando l'id è 0 significa che vogliamo inserire un nuovo dato nella tabella.
			Studente studente = new Studente(0, "Davide", "Remiddi");
			session.persist(studente);
			session.getTransaction().commit();
		}
		
	}

}
