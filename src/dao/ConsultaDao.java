package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import db.DB;
import entidades.Consulta;

public class ConsultaDao {

	/** Conexao c. */
	private Connection c;

	/**
	 * Classe que recupera a conexao com o Banco.
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public ConsultaDao() throws ClassNotFoundException, SQLException {

		DB con = new DB();

		c = con.getConnection();

	}

	
	public void insereAgenda(Consulta f) throws SQLException {

		String sql = "INSERT INTO Consulta VALUES(?,?,?,?)";
		PreparedStatement ps = c.prepareStatement(sql);

		ps.setInt(1, f.getId());
		ps.setString(2, f.getData());
		ps.setString(3, f.getDesc());
		
		
		ps.execute();
		ps.close();

	}

	public void atualizaFuncionario(Consulta f) throws SQLException {
		String sql = "update Consulta?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setInt(1, f.getId());
		ps.setString(2, f.getData());
		ps.setString(3, f.getDesc());
		ps.executeUpdate();
		ps.close();

	}

}