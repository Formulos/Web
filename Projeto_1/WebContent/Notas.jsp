

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
    <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>Justified Nav Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="justified-nav.css" rel="stylesheet">
  </head>
<body>
	
	<div class="container">
	
		<div class="masthead">
			<h3 class="text-muted">Project name</h3>
		</div>
		
		   
		
		<!-- Jumbotron -->
		<div class="jumbotron">
			<h1>Marketing stuff!</h1>
			<p class="lead">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet.</p>
			<p><a class="btn btn-lg btn-success" href="#" role="button">Cria</a></p>
		</div>
		
		<!-- Example row of columns -->
		<%@ page import="java.util.*,meuPacote.*" %>
		
		<div class="row">
			<div class="col-lg-4">
				<% DAO dao = new DAO();
				List<notas> notas = dao.getLista();
				for (notas nota : notas ) { %>
				<!-- <%=nota.getId()%> -->
				<h2><%=nota.getTitulo()%></h2>
				<p><%=nota.getTexto()%></p>
				<div class="columns">
				<form action="Remove" method="post">
				    <input type="submit" name="Delete" value="Delete" />
				</form>
					<p><a class="btn btn-primary" href="#" role="button"></a></p>
				</div>
				<% } %>
			</div>
		</div>
	</div>
	
	
	
    <!-- Bootstrap core JavaScript
	================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script>window.jQuery || document.write('<script src="../../../../assets/js/vendor/jquery.min.js"><\/script>')</script>
	<script src="../../../../assets/js/vendor/popper.min.js"></script>
	<script src="../../../../dist/js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="../../../../assets/js/ie10-viewport-bug-workaround.js"></script>
	

</body>
</html>