<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Circle</title>
		<meta charset="UTF-8">
	</head>
	<body>
		<div>
			<h3>An error occurred</h3>
			<p><%= exception.getMessage() %></p>
			<a href="index.html">Return to index</a>
		</div>
	</body>
</html>
