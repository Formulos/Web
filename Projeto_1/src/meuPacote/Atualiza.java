package meuPacote;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Atualiza
 */
@WebServlet("/Atualiza")
public class Atualiza extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request,
	 HttpServletResponse response)
	
	throws ServletException, IOException {
	 PrintWriter out = response.getWriter();
	 out.println("<html><body>");
	 out.println("<form method='post'>");
	 out.println("ID: <input type='number' name='id'><br>");
	 out.println("Titulo: <input type='text' name='Titulo'><br>");
	 out.println("Texto: <input type='text' name='Texto'><br>");
	 out.println("<input type='submit' value='Submit'>");
	 out.println("</form>");
	 out.println("<body><html>");
	}
	@Override
	protected void doPost(HttpServletRequest request,
	 HttpServletResponse response)
	throws ServletException, IOException {
	DAO dao = new DAO();
	notas nota = new notas();
	nota.setId(Integer.valueOf(request.getParameter("id")));
	nota.setTitulo(request.getParameter("Titulo"));
	nota.setTexto(request.getParameter("Texto"));
	
	dao.altera(nota);
	PrintWriter out = response.getWriter();
	out.println("<html><body>");
	out.println("atualizado" + nota.getTitulo());
	out.println("</body></html>");
	dao.close();

	}
       


}
