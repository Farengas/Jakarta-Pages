package it.cefi.models;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "studenti")
@NamedQueries({
	@NamedQuery(name = "Studenti.findAll", query = "from Studente"),
	@NamedQuery(name = "Studenti.beginM", query = "from Studente where nome like 'M%'")
})
public class Studente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Basic
	private String nome;
	
	@Basic
	private String cognome;

	public Studente() {}

	public Studente(int id, String nome, String cognome) {
		setId(id);
		setNome(nome);
		setCognome(cognome);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

}
