package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import db.DB;
import entidades.Conta;

public class ContaDao {

	/** Conexao c. */
	private Connection c;

	/**
	 * Classe que recupera a conexao com o Banco.
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public ContaDao() throws ClassNotFoundException, SQLException {

		DB con = new DB();

		c = con.getConnection();

	}

	
	public void insereConta(Conta f) throws SQLException {

		String sql = "INSERT INTO Conta VALUES(?,?,?,?)";
		PreparedStatement ps = c.prepareStatement(sql);

		ps.setInt(1, f.getId());
		ps.setString(2, f.getData());
		ps.setDouble(3, f.getValor());
		
		
		ps.execute();
		ps.close();

	}

	public void atualizaConta(Conta f) throws SQLException {
		String sql = "update Conta?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setInt(1, f.getId());
		ps.setString(2, f.getData());
		ps.setDouble(3, f.getValor());
		ps.executeUpdate();
		ps.close();

	}

}