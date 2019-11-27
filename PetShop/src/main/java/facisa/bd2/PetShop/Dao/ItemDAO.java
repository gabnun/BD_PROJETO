package facisa.bd2.PetShop.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import facisa.bd2.PetShop.Conecta;
import facisa.bd2.PetShop.Model.Item;

@Repository
public class ItemDAO {
	
	private Connection con;
	
	public ItemDAO() throws ClassNotFoundException, SQLException{
		
		con = Conecta.getInstance().getConnection();		
	}
	
	public void inserirItem1(Item item) {
		
		String sql = "INSERT INTO Item(Codigo, Descricao, Tipo,  PrecoFornecedor, PrecoLoja, Validade, Quantidade) VALUES(?,?,?,?,?,?,?)"; 
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, item.getCodigo());
			preparador.setString(2, item.getDescricao());
			preparador.setString(3, item.getTipo());
			preparador.setDouble(4, item.getPrecoFornecedor());
			preparador.setDouble(5, item.getPrecoLoja());
			preparador.setString(6, item.getValidade());
			preparador.setInt(7, item.getQuantidade());

			
			
			preparador.execute();
			preparador.close();	
			System.out.println("Inser��o realizada!");
			} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
			}
			}
	
	public void inserirItem2(Item item) {
		
		String sql = "INSERT INTO Item(Codigo, Descricao, Tipo,  PrecoFornecedor, PrecoLoja, Quantidade) VALUES(?,?,?,?,?,?)"; 
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, item.getCodigo());
			preparador.setString(2, item.getDescricao());
			preparador.setString(3, item.getTipo());
			preparador.setDouble(4, item.getPrecoFornecedor());
			preparador.setDouble(5, item.getPrecoLoja());
			preparador.setInt(6, item.getQuantidade());

			
			
			preparador.execute();
			preparador.close();	
			System.out.println("Inser��o realizada!");
			} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
			}
			}
	
	public void inserirItem3(Item item) {
		
		String sql = "INSERT INTO Item(Codigo, Descricao, Tipo,  PrecoFornecedor, Validade, Quantidade) VALUES(?,?,?,?,?,?)"; 
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, item.getCodigo());
			preparador.setString(2, item.getDescricao());
			preparador.setString(3, item.getTipo());
			preparador.setDouble(4, item.getPrecoFornecedor());
			preparador.setString(5, item.getValidade());
			preparador.setInt(6, item.getQuantidade());

			
			
			preparador.execute();
			preparador.close();	
			System.out.println("Inser��o realizada!");
			} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
			}
			}
	
	
	
	public void updateItem1(Item item, Long id) {
		String sql = "UPDATE item SET PrecoFornecedor = ? WHERE Codigo = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setDouble(1, item.getPrecoFornecedor());
		preparador.setLong(2, id);
		preparador.execute();
		preparador.close();
		System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
	}
	
		public void updateItem2(Item item, Long id) {
			String sql = "UPDATE item SET PrecoLoja = ? WHERE Codigo = ?";
			try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setDouble(1, item.getPrecoLoja());
			preparador.setLong(2, id);
			preparador.execute();
			preparador.close();
			System.out.println("Altera��o realizada!");
			} catch (SQLException e) {
			System.out.println("Erro - "+ e.getMessage());
			}	
		
		
	}
		
		public void updateItem3(Item item, Long id) {
			String sql = "UPDATE item SET PrecoFornecedor = ?, PrecoLoja = ? WHERE Codigo = ?";
			try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setDouble(1, item.getPrecoFornecedor());
			preparador.setDouble(2, item.getPrecoLoja());
			preparador.setLong(3, id);
			preparador.execute();
			preparador.close();
			System.out.println("Altera��o realizada!");
			} catch (SQLException e) {
			System.out.println("Erro - "+ e.getMessage());
			}
		}
		
		public void updateItem4(Item item, Long id) {
			String sql = "UPDATE item SET Descricao = ?, Tipo = ? WHERE Codigo = ?";
			try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, item.getDescricao());
			preparador.setString(2, item.getTipo());
			preparador.setLong(3, id);
			preparador.execute();
			preparador.close();
			System.out.println("Altera��o realizada!");
			} catch (SQLException e) {
			System.out.println("Erro - "+ e.getMessage());
			}
		}
		
		public void deleteItem(Long id) {
			String sql = "DELETE FROM item WHERE Codigo = ?";
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
		
		public List<Item> listarTodos() throws SQLException {
			try {
				con = ConexaoUtil.getInstance().getConnection();
				List<Item> lista = new ArrayList<Item>();
				String sql = "Select * from item";
				PreparedStatement preparador = con.prepareStatement(sql);
				ResultSet resultados = preparador.executeQuery();
				while (resultados.next()) {
					Item item = new Item();
					item.setCodigo(resultados.getInt("codigo"));
					item.setDescricao(resultados.getString("descricao"));
					item.setTipo(resultados.getString("tipo"));
					item.setPrecoFornecedor(resultados.getDouble("precofornecedor"));
					item.setPrecoLoja(resultados.getDouble("precoloja"));
					item.setQuantidade(resultados.getInt("quantidade"));
					item.setValidade(resultados.getString("validade"));
					lista.add(item);
				}

				return lista;
			} catch (SQLException e) {
				System.out.println("Erro - " + e.getMessage());
			}
			return null;
		}
		
		public List<Item> listarTodosPorDescricao(String descricao) throws SQLException {
			try {
				con = ConexaoUtil.getInstance().getConnection();
				List<Item> lista = new ArrayList<Item>();
				String sql = "Select * from item where descricao = ?";
				PreparedStatement preparador = con.prepareStatement(sql);
				preparador.setString(1, descricao);
				ResultSet resultados = preparador.executeQuery();
				while (resultados.next()) {
					Item item = new Item();
					item.setCodigo(resultados.getInt("codigo"));
					item.setDescricao(resultados.getString("descricao"));
					item.setTipo(resultados.getString("tipo"));
					item.setPrecoFornecedor(resultados.getDouble("precofornecedor"));
					item.setPrecoLoja(resultados.getDouble("precoloja"));
					item.setQuantidade(resultados.getInt("quantidade"));
					item.setValidade(resultados.getString("validade"));
					lista.add(item);
				}

				return lista;
			} catch (SQLException e) {
				System.out.println("Erro - " + e.getMessage());
			}
			return null;
		}
		
		public List<Item> listarTodosPorTipo(String tipo) throws SQLException {
			try {
				con = ConexaoUtil.getInstance().getConnection();
				List<Item> lista = new ArrayList<Item>();
				String sql = "Select * from item where tipo = ?";
				PreparedStatement preparador = con.prepareStatement(sql);
				preparador.setString(1, tipo);
				ResultSet resultados = preparador.executeQuery();
				while (resultados.next()) {
					Item item = new Item();
					item.setCodigo(resultados.getInt("codigo"));
					item.setDescricao(resultados.getString("descricao"));
					item.setTipo(resultados.getString("tipo"));
					item.setPrecoFornecedor(resultados.getDouble("precofornecedor"));
					item.setPrecoLoja(resultados.getDouble("precoloja"));
					item.setQuantidade(resultados.getInt("quantidade"));
					item.setValidade(resultados.getString("validade"));
					lista.add(item);
				}

				return lista;
			} catch (SQLException e) {
				System.out.println("Erro - " + e.getMessage());
			}
			return null;
		}

		public Item buscarPorId(Integer id) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}

}
