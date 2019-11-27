package facisa.bd2.PetShop.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import facisa.bd2.PetShop.Conecta;
import facisa.bd2.PetShop.Model.VendaAnimal;

@Repository
public class VendaAnimalDAO {

	private Connection con;
	
	public VendaAnimalDAO() throws ClassNotFoundException, SQLException{
		
		con = Conecta.getInstance().getConnection();		
	}

	public void cadastrarVendaAnimal1(VendaAnimal vendaAnimal) {
		
		String sql = "INSERT INTO VendaAnimal(NotaFiscal, RegAnimal, MatFunc,  Dia, Mes, Ano, Desconto) VALUES(?,?,?,?,?,?,?)";

		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, vendaAnimal.getNotaFiscal());
			preparador.setInt(2, vendaAnimal.getRegAnimal());
			preparador.setInt(3, vendaAnimal.getMatFunc());
			preparador.setInt(4, vendaAnimal.getDia());
			preparador.setInt(5, vendaAnimal.getMes());
			preparador.setInt(6, vendaAnimal.getAno());
			preparador.setDouble(7, vendaAnimal.getDesconto());

			preparador.execute();
			preparador.close();
			System.out.println("Inser��o realizada!");
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
	}
	
	public void cadastrarVendaAnimal2(VendaAnimal vendaAnimal){
		
		String sql = "INSERT INTO VendaAnimal(NotaFiscal, RegAnimal, MatFunc,  Dia, Mes, Ano) VALUES(?,?,?,?,?,?)";

		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, vendaAnimal.getNotaFiscal());
			preparador.setInt(2, vendaAnimal.getRegAnimal());
			preparador.setInt(3, vendaAnimal.getMatFunc());
			preparador.setInt(4, vendaAnimal.getDia());
			preparador.setInt(5, vendaAnimal.getMes());
			preparador.setInt(6, vendaAnimal.getAno());

			preparador.execute();
			preparador.close();
			System.out.println("Inser��o realizada!");
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
	}
	
	
	public void updateVendaA1(VendaAnimal vendaAnimal, int nota) {
		String sql = "UPDATE vendaanimal SET NotaFiscal = ? WHERE NotaFiscal = ?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, vendaAnimal.getNotaFiscal());
			preparador.setInt(2, nota);
			preparador.execute();
			preparador.close();
			System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
	}
	
	public void updateVendaA2(VendaAnimal vendaAnimal, int nota) {
		String sql = "UPDATE vendaanimal SET RegAnimal = ? WHERE NotaFiscal = ?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, vendaAnimal.getRegAnimal());
			preparador.setInt(2, nota);
			preparador.execute();
			preparador.close();
			System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
	}
	
	public void updateVendaA3(VendaAnimal vendaAnimal, int nota) {
		String sql = "UPDATE vendaanimal SET MatFunc = ? WHERE NotaFiscal = ?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, vendaAnimal.getMatFunc());
			preparador.setInt(2, nota);
			preparador.execute();
			preparador.close();
			System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
	}
	
	public void updateVendaA4(VendaAnimal vendaAnimal, int nota) {
		String sql = "UPDATE vendaanimal SET Dia = ?, Mes = ?, Ano = ? WHERE NotaFiscal = ?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, vendaAnimal.getDia());
			preparador.setInt(2, vendaAnimal.getMes());
			preparador.setInt(3, vendaAnimal.getAno());
			preparador.setInt(4, nota);
			preparador.execute();
			preparador.close();
			System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
	}
	
	public void updateVendaA5(VendaAnimal vendaAnimal, int nota) {
		String sql = "UPDATE vendaanimal SET Desconto = ? WHERE NotaFiscal = ?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setDouble(1, vendaAnimal.getDesconto());
			preparador.setInt(2, nota);
			preparador.execute();
			preparador.close();
			System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
	}

	public void deleteVendaA(int nota) {
		String sql = "DELETE FROM vendaanimal WHERE NotaFiscal = ?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, nota);
			preparador.execute();
			preparador.close();
			System.out.println("Dele��o realizada!");
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
	}
	
	public List<VendaAnimal> listarTodos() throws SQLException {
		try {
			con = ConexaoUtil.getInstance().getConnection();
			List<VendaAnimal> lista = new ArrayList<VendaAnimal>();
			String sql = "Select * from vendaanimal";
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet resultados = preparador.executeQuery();
			while (resultados.next()) {
				VendaAnimal venda = new VendaAnimal();
				venda.setNotaFiscal(resultados.getInt("notafiscal"));
				venda.setMatFunc(resultados.getInt("MatFunc"));
				venda.setRegAnimal(resultados.getInt("RegAnimal"));
				venda.setAno(resultados.getInt("ano"));
				venda.setMes(resultados.getInt("mes"));
				venda.setDia(resultados.getInt("dia"));
				venda.setComissaoA(resultados.getDouble("comissaoa"));
				venda.setDesconto(resultados.getDouble("desconto"));
				venda.setValorFinal(resultados.getDouble("valorfinal"));
				lista.add(venda);
			}

			return lista;
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
		return null;
	}
	
	public List<VendaAnimal> listarTodosPorTipo(String tipo) throws SQLException {
		try {
			con = ConexaoUtil.getInstance().getConnection();
			List<VendaAnimal> lista = new ArrayList<VendaAnimal>();
			String sql = "Select * from vendaanimal,animal where vendaanimal.RegAnimal = animal.Registro and animal.tipo = ?";
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, tipo);
			ResultSet resultados = preparador.executeQuery();
			while (resultados.next()) {
				VendaAnimal venda = new VendaAnimal();
				venda.setNotaFiscal(resultados.getInt("notafiscal"));
				venda.setMatFunc(resultados.getInt("MatFunc"));
				venda.setRegAnimal(resultados.getInt("RegAnimal"));
				venda.setAno(resultados.getInt("ano"));
				venda.setMes(resultados.getInt("mes"));
				venda.setDia(resultados.getInt("dia"));
				venda.setComissaoA(resultados.getDouble("comissaoa"));
				venda.setDesconto(resultados.getDouble("desconto"));
				venda.setValorFinal(resultados.getDouble("valorfinal"));
				lista.add(venda);
			}

			return lista;
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
		return null;
	}

	public List<VendaAnimal> listarTodosPorNomeVendedor(String nomeVendedor) throws SQLException {
		try {
			con = ConexaoUtil.getInstance().getConnection();
			List<VendaAnimal> lista = new ArrayList<VendaAnimal>();
			String sql = "Select * from vendaanimal where tipo = ?";
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, nomeVendedor);
			ResultSet resultados = preparador.executeQuery();
			while (resultados.next()) {
				VendaAnimal venda = new VendaAnimal();
				venda.setNotaFiscal(resultados.getInt("notafiscal"));
				venda.setMatFunc(resultados.getInt("MatFunc"));
				venda.setRegAnimal(resultados.getInt("RegAnimal"));
				venda.setAno(resultados.getInt("ano"));
				venda.setMes(resultados.getInt("mes"));
				venda.setDia(resultados.getInt("dia"));
				venda.setComissaoA(resultados.getDouble("comissao"));
				venda.setDesconto(resultados.getDouble("desconto"));
				venda.setValorFinal(resultados.getDouble("valorfinal"));
				lista.add(venda);
			}

			return lista;
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
		return null;
	}

	
	public VendaAnimal buscarPorId(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
