package meuPacote;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Lista
 */


@WebServlet("/Lista")
public class Lista extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
		protected void service(HttpServletRequest request,
							HttpServletResponse response)
		throws ServletException, IOException {
			
		DAO dao = new DAO();
		
		List<notas> notas = dao.getLista();
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body><table border='1'>");
		out.println("<tr><td>ID</td><td>Titulo</td>" +
				"<td>Texto</td></tr>");
		
		for (notas nota : notas) {
		 out.println("<tr><td>" + nota.getId() + "</td>");
		 out.println("<td>" + nota.getTitulo() + "</td>");
		 out.println("<td>" + nota.getTexto()  + "</td>");
		 
		}
		out.println("</table></body></html>");

		dao.close();

		 }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lista() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
