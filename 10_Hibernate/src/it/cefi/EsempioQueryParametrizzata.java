package it.cefi;

import java.io.File;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import it.cefi.models.Studente;

public class EsempioQueryParametrizzata {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure(new File("hibernate.cfg.xml"))
				   										   .buildSessionFactory();
		
		try (Scanner scanner = new Scanner(System.in); 
				Session session = sessionFactory.openSession()) {

			session.getTransaction().begin();
			
			System.out.print("id: ");
			int id = scanner.nextInt();
			
			Query<Studente> query = session.createQuery("from Studente where id = :id_studente", Studente.class);
			query.setParameter("id_studente", id);
			
			Studente studente = query.getSingleResult();
			
			System.out.println(studente.getNome());
			System.out.println(studente.getCognome());
			
			session.getTransaction().commit();
			
		}
		
	}

}
