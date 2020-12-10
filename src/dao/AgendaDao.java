package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import db.DB;
import entidades.Agenda;

public class AgendaDao {

	/** Conexao c. */
	private Connection c;

	/**
	 * Classe que recupera a conexao com o Banco.
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public AgendaDao() throws ClassNotFoundException, SQLException {

		DB con = new DB();

		c = con.getConnection();

	}

	
	public void insereAgenda(Agenda f) throws SQLException {

		String sql = "INSERT INTO AGENDA VALUES(?,?,?,?)";
		PreparedStatement ps = c.prepareStatement(sql);

		ps.setString(1, f.getInicio());
		ps.setString(2, f.getFim());
		ps.setString(3, f.getData());
		
		
		ps.execute();
		ps.close();

	}

	public void atualizaFuncionario(Agenda f) throws SQLException {
		String sql = "update Agendas?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, f.getInicio());
		ps.setString(2, f.getFim());
		ps.setString(3, f.getData());
		ps.executeUpdate();
		ps.close();

	}

}