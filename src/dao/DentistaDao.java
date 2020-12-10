package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import db.DB;
import entidades.Dentista;

public class DentistaDao {

	/** Conexao c. */
	private Connection c;

	/**
	 * Classe que recupera a conexao com o Banco.
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public DentistaDao() throws ClassNotFoundException, SQLException {

		DB con = new DB();

		c = con.getConnection();

	}

	/**
	 * Metodo que insere dados do funcionario na tabela FUNCIONARIO do Banco de
	 * dados.
	 * 
	 * @param f
	 * @throws SQLException
	 */
	public void insereDentista(Dentista f) throws SQLException {

		String sql = "INSERT INTO Dentista VALUES(?,?,?,?)";
		PreparedStatement ps = c.prepareStatement(sql);

		ps.setInt(1, f.getId());
		ps.setString(2, f.getCargo());
		ps.setDouble(3, f.getSalario());
		ps.execute();
		ps.close();

	}

	public void atualizaDentista(Dentista f) throws SQLException {
		String sql = "update FUNCIONARIO set CARGO = ?, MATRICULA = ?, DATA_ADMISSAO = ? where ID_FUNCIONARIO = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setInt(1, f.getId());
		ps.setString(2, f.getCargo());
		ps.setDouble(3, f.getSalario());
		ps.executeUpdate();
		ps.close();

	}

}