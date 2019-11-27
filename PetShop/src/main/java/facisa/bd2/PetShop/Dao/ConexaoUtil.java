package facisa.bd2.PetShop.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConexaoUtil {

	private static ResourceBundle config; // A variavel serve para capturar o arquivo config, onde est�o as propriedades
											// para conectar. Esse tipo de arquivo � utilizado no padr�o de projeto DAO
	private static ConexaoUtil conexaoUtil; //

	// Construtor responsavel por recuperar o arquivo;
	public ConexaoUtil() {
		config = ResourceBundle.getBundle("config"); // Metodo responsavel por buscar o arquivo;

	}

	// Metodo responsavel por verificar se existe instancia do banco, e caso n�o
	// tenha, criar a instancia;
	public static ConexaoUtil getInstance() {
		if (conexaoUtil == null) {
			conexaoUtil = new ConexaoUtil();
		}
		return conexaoUtil;

	}

	// Metodo que ir� fazer a conex�o com o banco de dados.
	public Connection getConnection() throws SQLException {
		try {
			String url = config.getString("aprendendodbc.conexao"); // O metodo getString passa por parametro o nome que
			String user = config.getString("aprendendodbc.usuario");
			String password = config.getString("aprendendodbc.senha");
			Class.forName(config.getString("aprendendodbc.driver"));
			return (Connection) DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
