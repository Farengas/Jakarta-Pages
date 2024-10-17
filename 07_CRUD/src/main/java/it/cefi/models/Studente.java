package it.cefi.models;

public class Studente {

	private int id;
	private String nome;
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
