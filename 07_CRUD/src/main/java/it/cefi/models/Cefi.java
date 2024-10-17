package it.cefi.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

public final class Cefi {

	private static final String URL = "jdbc:mysql://localhost/cefi";
	private static final String USER = "root";
	private static final String PASSWORD = "1234";
	
	private Cefi() {}
	
	public static void insertStudente(Studente studente) throws SQLException {
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
			String sql = "insert into studenti (nome, cognome) values (?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, studente.getNome());
			preparedStatement.setString(2, studente.getCognome());
			preparedStatement.executeUpdate();
		}
	}
	
	public static List<Studente> getStudenti() throws SQLException {
		List<Studente> studenti = new ArrayList<>();
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from studenti");
			while (resultSet.next()) {
				studenti.add(new Studente(
						resultSet.getInt("id"), 
						resultSet.getString("nome"), 
						resultSet.getString("cognome")));
			}
		}
		return studenti;
	}
	
	public static Studente getStudente(int id) throws SQLException {
		Studente studente = null;
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
			String sql = "select * from studenti where id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				studente = new Studente(
						resultSet.getInt("id"), 
						resultSet.getString("nome"), 
						resultSet.getString("cognome"));
			}
		}
		return studente;
	}
	
	public static void updateStudente(Studente studenteAggiornato) throws SQLException {
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
			String sql = "update studenti set nome = ?, cognome = ? where id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, studenteAggiornato.getNome());
			preparedStatement.setString(2, studenteAggiornato.getCognome());
			preparedStatement.setInt(3, studenteAggiornato.getId());
			preparedStatement.executeUpdate();
		}
	}
	
	public static void deleteStudente(int id) throws SQLException {
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
			String sql = "delete from studenti where id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
		}
	}
	
}
