<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<title>MySQL</title>
		<meta charset="UTF-8">
	</head>
	<body>
		<div>
			<table border="1">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>CountryCode</th>
						<th>District</th>
						<th>Population</th>
					</tr>
				</thead>
				<tbody>
				<% 
					// Le coordinate di accesso al database world di MySQL
					final String URL = "jdbc:mysql://localhost/world";
					final String USERNAME = "root";
					final String PASSWORD = "1234";
				
					// Stabilisco la connessione con il server di MySQL
					try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
						
						// Istanzio un oggetto in grado di eseguire comandi sql
						Statement statement = connection.createStatement();
						
						// Eseguo una query di selezione al fine di ottenere un ResultSet di dati
						ResultSet resultSet = statement.executeQuery("select * from city");
						
						// Vado ad iterare sul ResultSet
						while (resultSet.next()) {
							out.println("<tr>");
							out.println("<td>" + resultSet.getInt("id") + "</td>");
							out.println("<td>" + resultSet.getString("name") + "</td>");
							out.println("<td>" + resultSet.getString("countrycode") + "</td>");
							out.println("<td>" + resultSet.getString("district") + "</td>");
							out.println("<td>" + resultSet.getInt("population") + "</td>");
							out.println("</tr>");
						}
					}
				%>
				</tbody>
			</table>
		</div>
	</body>
</html>
