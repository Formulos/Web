<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>cool title 2227</title>
</head>
<body>

 <jsp:useBean id="dao" class="meuPacote.DAO"/>

 <table border="1">
 <tr>
 <td><b>#</b></td>
 <td><b>Titulos</b></td>
<td><b>Textos</b></td>
 </tr>
 <c:forEach var="Titulo" items="${dao.lista}" varStatus="id">
 <tr bgcolor="#${id.count%2 == 0 ? 'bbffcc' : 'ffffbb' }" >
 <td>${id.count}</td>
 <td>${Titulo.Titulos}</td>
<td>
 <td>${Titulo.Texto}</td>
 </tr>
 </c:forEach>

</table>
</body>
</html>