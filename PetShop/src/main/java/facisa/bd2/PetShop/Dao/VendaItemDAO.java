package facisa.bd2.PetShop.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import facisa.bd2.PetShop.Conecta;
import facisa.bd2.PetShop.Model.VendaItem;

@Repository
public class VendaItemDAO {
	
	
private Connection con;
	
	public VendaItemDAO() throws ClassNotFoundException, SQLException{
		
		con = Conecta.getInstance().getConnection();
		
	}
	
	public void cadastrarVendaItem1(VendaItem vendaItem) {
		
		String sql = "INSERT INTO VendaItem(NtFiscal, ItemCod, FuncMat,  Dia, Mes, Ano, Desconto) VALUES(?,?,?,?,?,?,?)"; 
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, vendaItem.getNtFiscal());
			preparador.setInt(2, vendaItem.getItemCod());
			preparador.setInt(3, vendaItem.getFuncMat());
			preparador.setInt(4, vendaItem.getDia());
			preparador.setInt(5, vendaItem.getMes());
			preparador.setInt(6, vendaItem.getAno());
			preparador.setDouble(7, vendaItem.getDesconto());

			
			
			preparador.execute();
			preparador.close();	
			System.out.println("Inser��o realizada!");
			} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
			}
			}
	
	public void cadastrarVendaItem2(VendaItem vendaItem) {
		
		String sql = "INSERT INTO VendaItem(NtFiscal, ItemCod, FuncMat,  Dia, Mes, Ano, Desconto) VALUES(?,?,?,?,?,?,?)"; 
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, vendaItem.getNtFiscal());
			preparador.setInt(2, vendaItem.getItemCod());
			preparador.setInt(3, vendaItem.getFuncMat());
			preparador.setInt(4, vendaItem.getDia());
			preparador.setInt(5, vendaItem.getMes());
			preparador.setInt(6, vendaItem.getAno());
			preparador.setDouble(7, vendaItem.getDesconto());

			
			
			preparador.execute();
			preparador.close();	
			System.out.println("Inser��o realizada!");
			} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
			}
			}
	
	public void updateVendaI1(VendaItem vendaItem, int nota) {
		String sql = "UPDATE vendaitem SET NtFiscal = ? WHERE NtFiscal = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, vendaItem.getNtFiscal());
		preparador.setInt(2, nota);
		preparador.execute();
		preparador.close();
		System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
	}
	
	public void updateVendaI2(VendaItem vendaItem, int nota) {
		String sql = "UPDATE vendaitem SET ItemCod = ? WHERE NtFiscal = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, vendaItem.getItemCod());
		preparador.setInt(2, nota);
		preparador.execute();
		preparador.close();
		System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
	}
	
	public void updateVendaI3(VendaItem vendaItem, int nota) {
		String sql = "UPDATE vendaitem SET FuncMat = ? WHERE NtFiscal = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, vendaItem.getFuncMat());
		preparador.setInt(2, nota);
		preparador.execute();
		preparador.close();
		System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
	}
	
	public void updateVendaI4(VendaItem vendaItem, int nota) {
		String sql = "UPDATE vendaitem SET Dia = ?, Mes = ?, Ano = ? WHERE NtFiscal = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, vendaItem.getDia());
		preparador.setInt(2, vendaItem.getMes());
		preparador.setInt(3, vendaItem.getAno());
		preparador.setInt(4, nota);
		preparador.execute();
		preparador.close();
		System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
	}
	
	
	public void updateVendaI5(VendaItem vendaItem, int nota) {
		String sql = "UPDATE vendaitem SET Desconto = ? WHERE NtFiscal = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setDouble(1, vendaItem.getDesconto());
		preparador.setInt(2, nota);
		preparador.execute();
		preparador.close();
		System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
	}
	
	public void deleteVendaItem(int nota) {
		String sql = "DELETE FROM vendaitem WHERE NtFiscal = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, nota);		
		preparador.execute();
		preparador.close();		
		System.out.println("Dele��o realizada!");
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
}
	
	public List<VendaItem> buscarTodos() {
		try {
			con = ConexaoUtil.getInstance().getConnection();
			List<VendaItem> lista = new ArrayList<VendaItem>();
			String sql = "Select * FROM vendaitem vi, Funcionario f, Item i "
					+ "where f.matricula = vi.FuncMat and vi.ItemCod = i.codigo;";
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet resultados = preparador.executeQuery();
			while (resultados.next()) {
				VendaItem venda = new VendaItem();
				venda.setNtFiscal(resultados.getInt("NtFiscal"));
				venda.setFuncMat(resultados.getInt("FuncMat"));
				venda.setItemCod(resultados.getInt("ItemCod"));
				venda.setAno(resultados.getInt("ano"));
				venda.setMes(resultados.getInt("mes"));
				venda.setDia(resultados.getInt("dia"));
				venda.setComissaoI(resultados.getDouble("comissaoi"));
				venda.setDesconto(resultados.getDouble("desconto"));
				venda.setValorF(resultados.getDouble("valorf"));
				lista.add(venda);
			}

			return lista;
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
		return null;
	}

	public List<VendaItem> buscarTodosPorDescricao(String descricao) {
		try {
			con = ConexaoUtil.getInstance().getConnection();
			List<VendaItem> lista = new ArrayList<VendaItem>();
			String sql = "Select * FROM vendaitem vi, Item i where vi.ItemCod = i.codigo and i.descricao = ?;";
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, descricao);
			ResultSet resultados = preparador.executeQuery();
			while (resultados.next()) {
				VendaItem venda = new VendaItem();
				venda.setNtFiscal(resultados.getInt("NtFiscal"));
				venda.setFuncMat(resultados.getInt("FuncMat"));
				venda.setItemCod(resultados.getInt("ItemCod"));
				venda.setAno(resultados.getInt("ano"));
				venda.setMes(resultados.getInt("mes"));
				venda.setDia(resultados.getInt("dia"));
				venda.setComissaoI(resultados.getDouble("comissaoi"));
				venda.setDesconto(resultados.getDouble("desconto"));
				venda.setValorF(resultados.getDouble("valorf"));
				lista.add(venda);
			}

			return lista;
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
		return null;
	}

	public List<VendaItem> buscarTodosPorVendedor(String vendedor) {
		try {
			con = ConexaoUtil.getInstance().getConnection();
			List<VendaItem> lista = new ArrayList<VendaItem>();
			String sql = "Select * FROM vendaitem vi, Funcionario f where vi.FuncMat = f.matricula and f.nome = ?;";
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, vendedor);
			ResultSet resultados = preparador.executeQuery();
			while (resultados.next()) {
				VendaItem venda = new VendaItem();
				venda.setNtFiscal(resultados.getInt("NtFiscal"));
				venda.setFuncMat(resultados.getInt("FuncMat"));
				venda.setItemCod(resultados.getInt("ItemCod"));
				venda.setAno(resultados.getInt("ano"));
				venda.setMes(resultados.getInt("mes"));
				venda.setDia(resultados.getInt("dia"));
				venda.setComissaoI(resultados.getDouble("comissaoi"));
				venda.setDesconto(resultados.getDouble("desconto"));
				venda.setValorF(resultados.getDouble("valorf"));
				lista.add(venda);
			}

			return lista;
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
		return null;
	}

	public List<VendaItem> buscarTodosPorAnoMes(Integer ano, Integer mes) {
		try {
			con = ConexaoUtil.getInstance().getConnection();
			List<VendaItem> lista = new ArrayList<VendaItem>();
			String sql = "Select * FROM vendaitem vi, Item i where vi.ItemCod = i.codigo and vi.mes = ? and vi.ano = ? and i.descricao = 'Xampu';";
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, mes);
			preparador.setInt(2, ano);
			ResultSet resultados = preparador.executeQuery();
			while (resultados.next()) {
				VendaItem venda = new VendaItem();
				venda.setNtFiscal(resultados.getInt("NtFiscal"));
				venda.setFuncMat(resultados.getInt("FuncMat"));
				venda.setItemCod(resultados.getInt("ItemCod"));
				venda.setAno(resultados.getInt("ano"));
				venda.setMes(resultados.getInt("mes"));
				venda.setDia(resultados.getInt("dia"));
				venda.setComissaoI(resultados.getDouble("comissaoi"));
				venda.setDesconto(resultados.getDouble("desconto"));
				venda.setValorF(resultados.getDouble("valorf"));
				lista.add(venda);
			}

			return lista;
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
		return null;
	}

	public List<VendaItem> buscarTodosVendedorItem(Integer matricula, Integer item) {
		try {
			con = ConexaoUtil.getInstance().getConnection();
			List<VendaItem> lista = new ArrayList<VendaItem>();
			String sql = "Select * FROM vendaitem vi, Funcionario f, Item i "
					+ "where f.matricula = ? and i.codigo = ?;";
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, matricula);
			preparador.setInt(2, item);
			ResultSet resultados = preparador.executeQuery();
			while (resultados.next()) {
				VendaItem venda = new VendaItem();
				venda.setNtFiscal(resultados.getInt("NtFiscal"));
				venda.setFuncMat(resultados.getInt("FuncMat"));
				venda.setItemCod(resultados.getInt("ItemCod"));
				venda.setAno(resultados.getInt("ano"));
				venda.setMes(resultados.getInt("mes"));
				venda.setDia(resultados.getInt("dia"));
				venda.setComissaoI(resultados.getDouble("comissaoi"));
				venda.setDesconto(resultados.getDouble("desconto"));
				venda.setValorF(resultados.getDouble("ValorF"));
				lista.add(venda);
			}

			return lista;
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
		return null;
	}
	


}
