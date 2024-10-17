package it.cefi;

import java.io.File;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import it.cefi.models.Studente;

public class EsempioNamedQuery {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure(new File("hibernate.cfg.xml"))
				   										   .buildSessionFactory();

		try (Session session = sessionFactory.openSession()) {
			session.getTransaction().begin();
			List<Studente> studenti = session.createNamedQuery("Studenti.beginM", Studente.class).getResultList();
			studenti.forEach(studente -> System.out.println(studente.getNome() + " " + studente.getCognome()));
			session.getTransaction().commit();
		}
		
	}
	
}
