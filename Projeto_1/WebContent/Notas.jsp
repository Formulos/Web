<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cool title</title>
</head>
<body>

<%@ page import="java.util.*,meuPacote.*" %>
<table border='1'>
	<% DAO dao = new DAO();
	 List<notas> notas = dao.getLista();
	 for (notas nota : notas ) { %>
	 <tr>
	 	<td><%=nota.getId()%></td>
		<td><%=nota.getTitulo()%></td>
		<td><%=nota.getTexto()%></td>
	</tr>
	<% } %>
</table>

</body>
</html>