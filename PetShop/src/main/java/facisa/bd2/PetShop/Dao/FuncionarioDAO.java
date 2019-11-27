package facisa.bd2.PetShop.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import facisa.bd2.PetShop.Conecta;
import facisa.bd2.PetShop.Model.Funcionario;

@Repository
public class FuncionarioDAO {
	
	private Connection con;
	
	public FuncionarioDAO() throws ClassNotFoundException, SQLException{
		
		con = Conecta.getInstance().getConnection();		
	}
	
	public void cadastrarFuncionario1(Funcionario funcionario) {
		
		String sql = "INSERT INTO Funcionario(Matricula, Nome, Cpf, Endereco, Telefone, Salario, DtNasc, DtAdm, Funcao, DtDemi) VALUES(?,?,?,?,?,?,?,?,?,?)"; 
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, funcionario.getMatricula());
			preparador.setString(2, funcionario.getNome());
			preparador.setString(3, funcionario.getCpf());
			preparador.setString(4, funcionario.getEndereco());
			preparador.setString(5, funcionario.getTelefone());
			preparador.setDouble(6, funcionario.getSalario());
			preparador.setString(7, funcionario.getDtNasc());
			preparador.setString(8, funcionario.getDtAdm());
			preparador.setString(9, funcionario.getFuncao());
			preparador.setString(10, funcionario.getDtDemi());

			
			
			preparador.execute();
			preparador.close();	
			System.out.println("Inser��o realizada!");
			} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
			}
			}
	
	public void cadastrarFuncionario2(Funcionario funcionario) {
		
		String sql = "INSERT INTO Funcionario(Matricula, Nome, Cpf, Endereco, Telefone, DtNasc, DtAdm, Funcao, DtDemi) VALUES(?,?,?,?,?,?,?,?,?)"; 
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, funcionario.getMatricula());
			preparador.setString(2, funcionario.getNome());
			preparador.setString(3, funcionario.getCpf());
			preparador.setString(4, funcionario.getEndereco());
			preparador.setString(5, funcionario.getTelefone());
			preparador.setString(6, funcionario.getDtNasc());
			preparador.setString(7, funcionario.getDtAdm());
			preparador.setString(8, funcionario.getFuncao());
			preparador.setString(9, funcionario.getDtDemi());

			
			
			preparador.execute();
			preparador.close();	
			System.out.println("Inser��o realizada!");
			} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
			}
			}
	
	public void cadastrarFuncionario3(Funcionario funcionario) {
		
		String sql = "INSERT INTO Funcionario(Matricula, Nome, Cpf, Endereco, Salario, DtNasc, DtAdm, Funcao, DtDemi) VALUES(?,?,?,?,?,?,?,?,?)"; 
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, funcionario.getMatricula());
			preparador.setString(2, funcionario.getNome());
			preparador.setString(3, funcionario.getCpf());
			preparador.setString(4, funcionario.getEndereco());
			preparador.setDouble(5, funcionario.getSalario());
			preparador.setString(6, funcionario.getDtNasc());
			preparador.setString(7, funcionario.getDtAdm());
			preparador.setString(8, funcionario.getFuncao());
			preparador.setString(9, funcionario.getDtDemi());

			
			
			preparador.execute();
			preparador.close();	
			System.out.println("Inser��o realizada!");
			} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
			}
			} 
	
	public void updateFuncionario1(Funcionario funcionario, Long id) {
		String sql = "UPDATE funcionario SET nome = ? WHERE Matricula = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, funcionario.getNome());
		preparador.setLong(2, id);
		preparador.execute();
		preparador.close();
		System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
		
		
		
	}
	
	public void updateFuncionario2(Funcionario funcionario, String cpf) {
		String sql = "UPDATE funcionario SET nome = ? WHERE Cpf = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, funcionario.getNome());
		preparador.setString(2, cpf);
		preparador.execute();
		preparador.close();
		System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
		
			
	}
	
	public void updateFuncionario3(Funcionario funcionario, Long id) {
		String sql = "UPDATE funcionario SET endereco = ? WHERE Matricula = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, funcionario.getEndereco());
		preparador.setLong(2, id);
		preparador.execute();
		preparador.close();
		System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
	
	}
	
	public void updateFuncionario4(Funcionario funcionario, Long id) {
		String sql = "UPDATE funcionario SET funcao = ? WHERE Matricula = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, funcionario.getFuncao());
		preparador.setLong(2, id);
		preparador.execute();
		preparador.close();
		System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
	
	}
	
	public void updateFuncionario5(Funcionario funcionario, Long id) {
		String sql = "UPDATE funcionario SET DtDemi = ? WHERE Matricula = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, funcionario.getDtDemi());
		preparador.setLong(2, id);
		preparador.execute();
		preparador.close();
		System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
	
	}
	
	
	public void deleteFuncionario(Long id) {
		String sql = "DELETE FROM funcionario WHERE Matricula = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setLong(1, id);		
		preparador.execute();
		preparador.close();		
		System.out.println("Dele��o realizada!");
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
}
	
	public List<Funcionario> listarTodos() {
		try {
			con = ConexaoUtil.getInstance().getConnection();
			List<Funcionario> lista = new ArrayList<Funcionario>();
			String sql = "Select * from funcionario";
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet resultados = preparador.executeQuery();
			while (resultados.next()) {
				Funcionario func = new Funcionario();
				func.setCpf(resultados.getString("cpf"));
				func.setDtAdm(resultados.getString("DtAdm"));
				func.setDtDemi(resultados.getString("DtDemi"));
				func.setDtNasc(resultados.getString("DtNasc"));
				func.setEndereco(resultados.getString("endereco"));
				func.setMatricula(resultados.getInt("Matricula"));
				func.setNome(resultados.getString("nome"));
				func.setSalario(resultados.getDouble("salario"));
				func.setTelefone(resultados.getString("telefone"));
				func.setFuncao(resultados.getString("funcao"));
				
				lista.add(func);
			}

			return lista;
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
		return null;
	}

	public Funcionario buscarPorId(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Funcionario> buscarPorNome(String nome) {
		try {
			con = ConexaoUtil.getInstance().getConnection();
			List<Funcionario> lista = new ArrayList<Funcionario>();
			String sql = "Select * from funcionario where nome= ?";
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, nome);
			ResultSet resultados = preparador.executeQuery();
			while (resultados.next()) {
				Funcionario func = new Funcionario();
				func.setCpf(resultados.getString("cpf"));
				func.setDtAdm(resultados.getString("DtAdm"));
				func.setDtDemi(resultados.getString("DtDemi"));
				func.setDtNasc(resultados.getString("DtNasc"));
				func.setEndereco(resultados.getString("endereco"));
				func.setMatricula(resultados.getInt("Matricula"));
				func.setNome(resultados.getString("nome"));
				func.setSalario(resultados.getDouble("salario"));
				func.setTelefone(resultados.getString("telefone"));
				func.setFuncao(resultados.getString("funcao"));
				lista.add(func);
			}
			return lista;
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return null;		
	}
	
}
