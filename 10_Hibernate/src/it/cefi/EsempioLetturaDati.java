package it.cefi;

import java.io.File;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import it.cefi.models.Studente;

public class EsempioLetturaDati {

	public static void main(String[] args) {
		
		// La classe Configuration permette di istanziare un oggetto in
		// grado di leggere il contenuto del file "hibernate.cfg.xml".
		Configuration configuration = new Configuration();
		
		// Il metodo configure serve per leggere il contenuto del file "hibernate.cfg.xml".
		File file = new File("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.configure(file).buildSessionFactory();
		
		// Apro la connessione con il database...
		try (Session session = sessionFactory.openSession()) {
			// e avvio una transazione...
			session.getTransaction().begin();
			
			Studente matteo = session.get(Studente.class, 1);
			
			System.out.println(matteo.getId());
			System.out.println(matteo.getNome());
			System.out.println(matteo.getCognome());
			
			System.out.println("------------------------------");
			
			List<Studente> studenti = session.createQuery("from Studente", Studente.class).getResultList();
			studenti.forEach(s -> System.out.println(s.getNome()));
			
			// al termine della sessione chiamo un commit per rendere definitive
			// le operazioni che ho eseguito sulla tabella.
			session.getTransaction().commit();
		}
		
		
		
		
		
	}

}
