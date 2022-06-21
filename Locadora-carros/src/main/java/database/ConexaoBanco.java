package database;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class ConexaoBanco {
	
	//objeto de conexao - est�tico para poder ser acessado sem instanciar objeto
	private static ConexaoBanco conexaoBanco;
	
	//esse m�todo verifica se ja existe um objeto instanciado dentro da aplica��o
	public static ConexaoBanco getInstancia() {
		if (conexaoBanco == null) {
			conexaoBanco = new ConexaoBanco();
	    }
		return conexaoBanco;
	}
		//essa condi��o nao deixa o mesmo objeto ser instanciado 2x
	    //se ja existe uma conex�o j� instanciada, ele retorna - se n�o > cria uma nova
		
	    //este objeto � do pkg 'sql.Connection'
	    //m�todo para fazer a conex�o
		public Connection getConnection() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/db_java", "root", "root");
		
		}
		
		public static void main(String[]args) {
			String message = "Conex�o com o Banco de Dados estabelecida com sucesso! :)";
			try {
				System.out.println(getInstancia().getConnection());
				System.out.print(message);				
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}

}
