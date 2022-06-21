package database;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class ConexaoBanco {
	
	//objeto de conexao - estático para poder ser acessado sem instanciar objeto
	private static ConexaoBanco conexaoBanco;
	
	//esse método verifica se ja existe um objeto instanciado dentro da aplicação
	public static ConexaoBanco getInstancia() {
		if (conexaoBanco == null) {
			conexaoBanco = new ConexaoBanco();
	    }
		return conexaoBanco;
	}
		//essa condição nao deixa o mesmo objeto ser instanciado 2x
	    //se ja existe uma conexão já instanciada, ele retorna - se não > cria uma nova
		
	    //este objeto é do pkg 'sql.Connection'
	    //método para fazer a conexão
		public Connection getConnection() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/db_java", "root", "root");
		
		}
		
		public static void main(String[]args) {
			String message = "Conexão com o Banco de Dados estabelecida com sucesso! :)";
			try {
				System.out.println(getInstancia().getConnection());
				System.out.print(message);				
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}

}
