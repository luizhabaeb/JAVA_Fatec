package dataAccessObj;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.ConexaoBanco;
import dto.Cliente;

public class ClienteDAO {
	
	public void inserir(Cliente cliente) throws ClassNotFoundException, SQLException {
		Connection connection = ConexaoBanco.getInstancia().getConnection();
		
		String sql = "INSERT INTO tbl_cliente(nome_cliente, cpf_cliente, telefone_cliente, email_cliente) values (?, ?, ?, ?)";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setString (1, cliente.getNome ());
		statement.setString (2, cliente.getCpf());
		statement.setString (3, cliente.getTelefone());
		statement.setString (4, cliente.getEmail());
		statement.execute();
		connection.close();
	}
	   
	
}
