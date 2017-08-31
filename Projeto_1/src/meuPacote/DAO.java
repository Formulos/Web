package meuPacote;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO {
	private Connection connection = null;
	public DAO() {
		try {
	 Class.forName("com.mysql.jdbc.Driver");
	 connection = DriverManager.getConnection("jdbc:mysql://localhost/projeto_1", "root", "1234");
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	 }
	
	public List<notas> getLista() {
		List<notas> notas = new ArrayList<notas>();
		
		PreparedStatement stmt;
		try {
			stmt = connection.
					prepareStatement("SELECT * FROM notas");
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				notas nota = new notas();
				nota.setId(rs.getInt("id"));
				nota.setTitulo(rs.getString("Titulo"));
				nota.setTexto(rs.getString("Texto"));
				notas.add(nota);
			}
			
			rs.close();
			stmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return notas;
		}
	
	public void adiciona(notas nota) {
		String sql = "INSERT INTO notas" +
		"(Titulo,Texto) values(?,?)";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1,nota.getTitulo());
			stmt.setString(2, nota.getTexto());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); }
		}
	
	public void close() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}
	
	public void altera(notas nota) {
		String sql = "UPDATE notas SET " +
		 "Titulo=?, Texto=? WHERE id=?";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, nota.getTitulo());
			stmt.setString(2, nota.getTexto());
			stmt.setInt(3, nota.getId());
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	public void remove(Integer id) {
		PreparedStatement stmt;
		try {
			stmt = connection
			 .prepareStatement("DELETE FROM notas WHERE id=?");
			stmt.setLong(1, id);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
}