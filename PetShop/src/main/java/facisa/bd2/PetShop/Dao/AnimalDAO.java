package facisa.bd2.PetShop.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import facisa.bd2.PetShop.Conecta;
import facisa.bd2.PetShop.Model.Animal;

@Repository
public class AnimalDAO {
	
	private Connection con;
	
	public AnimalDAO() throws ClassNotFoundException, SQLException{
		
		con = Conecta.getInstance().getConnection();
		
	}
	
	public void cadastrarAnimal1(Animal animal) {
		
		String sql = "INSERT INTO Animal(Registro, Tipo, Peso, Altura, DtUltMed, Raca, PrecoCompra, PrecoVenda, DtNasc) VALUES(?,?,?,?,?,?,?,?,?)"; 
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, animal.getRegistro());
			preparador.setString(2, animal.getTipo());
			preparador.setDouble(3, animal.getPeso());
			preparador.setDouble(4, animal.getAltura());
			preparador.setString(5, animal.getDtUltMed());
			preparador.setString(6, animal.getRaca());
			preparador.setDouble(7, animal.getPrecoCompra());
			preparador.setDouble(8, animal.getPrecoVenda());
			preparador.setString(9, animal.getDtNasc());

			
			
			preparador.execute();
			preparador.close();	
			System.out.println("Inser��o realizada!");
			} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
			}
			}
	
	public void cadastrarAnimal2(Animal animal) {
		
		String sql = "INSERT INTO Animal(Registro, Tipo, Raca, PrecoCompra, PrecoVenda, DtNasc) VALUES(?,?,?,?,?,?)"; 
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, animal.getRegistro());
			preparador.setString(2, animal.getTipo());
			preparador.setString(3, animal.getRaca());
			preparador.setDouble(4, animal.getPrecoCompra());
			preparador.setDouble(5, animal.getPrecoVenda());
			preparador.setString(6, animal.getDtNasc());

			
			
			preparador.execute();
			preparador.close();	
			System.out.println("Inser��o realizada!");
			} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
			}
			}
	
	public void cadastrarAnimal3(Animal animal) {
		
		String sql = "INSERT INTO Animal(Registro, Tipo, Peso, Altura, DtUltMed, Raca, PrecoCompra, DtNasc) VALUES(?,?,?,?,?,?,?,?)"; 
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, animal.getRegistro());
			preparador.setString(2, animal.getTipo());
			preparador.setDouble(3, animal.getPeso());
			preparador.setDouble(4, animal.getAltura());
			preparador.setString(5, animal.getDtUltMed());
			preparador.setString(6, animal.getRaca());
			preparador.setDouble(7, animal.getPrecoCompra());
			preparador.setString(8, animal.getDtNasc());

			
			
			preparador.execute();
			preparador.close();	
			System.out.println("Inser��o realizada!");
			} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
			}
			}
	
	public void cadastrarAnimal4(Animal animal) {
		
		String sql = "INSERT INTO Animal(Registro, Tipo, Peso, Altura, DtUltMed, Raca, PrecoVenda, DtNasc) VALUES(?,?,?,?,?,?,?,?)"; 
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, animal.getRegistro());
			preparador.setString(2, animal.getTipo());
			preparador.setDouble(3, animal.getPeso());
			preparador.setDouble(4, animal.getAltura());
			preparador.setString(5, animal.getDtUltMed());
			preparador.setString(6, animal.getRaca());
			preparador.setDouble(7, animal.getPrecoVenda());
			preparador.setString(8, animal.getDtNasc());

			
			
			preparador.execute();
			preparador.close();	
			System.out.println("Inser��o realizada!");
			} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
			}
			}
	
	public void cadastrarAnimal5(Animal animal) {
		
		String sql = "INSERT INTO Animal(Registro, Tipo, Peso, Altura, DtUltMed, Raca, DtNasc) VALUES(?,?,?,?,?,?,?)"; 
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, animal.getRegistro());
			preparador.setString(2, animal.getTipo());
			preparador.setDouble(3, animal.getPeso());
			preparador.setDouble(4, animal.getAltura());
			preparador.setString(5, animal.getDtUltMed());
			preparador.setString(6, animal.getRaca());
			preparador.setString(7, animal.getDtNasc());

			
			
			preparador.execute();
			preparador.close();	
			System.out.println("Inser��o realizada!");
			} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
			}
			}
	
	public void cadastrarAnimal6(Animal animal) {
		
		String sql = "INSERT INTO Animal(Registro, Tipo, Peso, Altura, DtUltMed, Raca, PrecoCompra, PrecoVenda) VALUES(?,?,?,?,?,?,?,?)"; 
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, animal.getRegistro());
			preparador.setString(2, animal.getTipo());
			preparador.setDouble(3, animal.getPeso());
			preparador.setDouble(4, animal.getAltura());
			preparador.setString(5, animal.getDtUltMed());
			preparador.setString(6, animal.getRaca());
			preparador.setDouble(7, animal.getPrecoCompra());
			preparador.setDouble(8, animal.getPrecoVenda());
			
			
			preparador.execute();
			preparador.close();	
			System.out.println("Inser��o realizada!");
			} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
			}
			}
	
	
	public void updateAnimal1(Animal animal, Long id) {
		String sql = "UPDATE animal SET peso = ?, altura = ?, DtUltMed = ? WHERE Registro = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setDouble(1,animal.getPeso());
		preparador.setDouble(2, animal.getAltura());
		preparador.setString(3, animal.getDtUltMed());
		preparador.setLong(4, id);
		preparador.execute();
		preparador.close();
		System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
	}
	
	public void updateAnimal2(Animal animal, Long id) {
		String sql = "UPDATE animal SET peso = ?, DtUltMed = ? WHERE Registro = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setDouble(1,animal.getPeso());
		preparador.setString(2, animal.getDtUltMed());
		preparador.setLong(3, id);
		preparador.execute();
		preparador.close();
		System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
	}
	
	public void updateAnimal3(Animal animal, Long id) {
		String sql = "UPDATE animal SET altura = ?, DtUltMed = ? WHERE Registro = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setDouble(1, animal.getAltura());
		preparador.setString(2, animal.getDtUltMed());
		preparador.setLong(3, id);
		preparador.execute();
		preparador.close();
		System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
	}
	
	public void updateAnimal4(Animal animal, Long id) {
		String sql = "UPDATE animal SET PrecoVenda = ? WHERE Registro = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setDouble(1,animal.getPrecoVenda());
		preparador.setLong(2, id);
		preparador.execute();
		preparador.close();
		System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
	}
	
	public void updateAnimal5(Animal animal, Long id) {
		String sql = "UPDATE animal SET PrecoCompra = ? WHERE Registro = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setDouble(1,animal.getPrecoCompra());
		preparador.setLong(2, id);
		preparador.execute();
		preparador.close();
		System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
	}
	
	public void updateAnimal6(Animal animal, Long id) {
		String sql = "UPDATE animal SET PrecoCompra = ?, PrecoVenda = ? WHERE Registro = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setDouble(1,animal.getPrecoCompra());
		preparador.setDouble(2,animal.getPrecoVenda());
		preparador.setLong(3, id);
		preparador.execute();
		preparador.close();
		System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
	}
	
	public void updateAnimal7(Animal animal, long id) {
		String sql = "UPDATE animal SET Tipo = ? WHERE Registro = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1,animal.getTipo());
		preparador.setLong(2, id);
		preparador.execute();
		preparador.close();
		System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
	}
	
	public void updateAnimal8(Animal animal, Long id) {
		String sql = "UPDATE animal SET Raca = ? WHERE Registro = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1,animal.getRaca());
		preparador.setLong(2, id);
		preparador.execute();
		preparador.close();
		System.out.println("Altera��o realizada!");
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
	}
	
	public void updateAnimal9(Animal animal, Long id) {
		String sql = "UPDATE animal SET Tipo = ?, Raca = ? WHERE Registro = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1,animal.getTipo());
		preparador.setString(2,animal.getRaca());
		preparador.setLong(3, id);
		preparador.execute();
		preparador.close();
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
	}
	
	public void deleteAnimalViaRegistro(Long id) {
		String sql = "DELETE FROM animal WHERE Registro = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setLong(1, id);		
		preparador.execute();
		preparador.close();		
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
}
	
	public void deleteAnimalViaTipo(String tipo) {
		String sql = "DELETE FROM animal WHERE Tipo = ?";
		try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, tipo);		
		preparador.execute();
		preparador.close();		
		System.out.println("Dele��o realizada!");
		} catch (SQLException e) {
		System.out.println("Erro - "+ e.getMessage());
		}
}
	
	public List<Animal> listarTodos() {
		try {
			con = ConexaoUtil.getInstance().getConnection();
			List<Animal> lista = new ArrayList<Animal>();
			String sql = "Select * from animal";
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet resultados = preparador.executeQuery();
			while (resultados.next()) {
				Animal animal = new Animal();
				animal.setAltura(resultados.getDouble("altura"));
				animal.setDtNasc(resultados.getString("DtNasc"));
				animal.setDtUltMed(resultados.getString("DtUltMed"));
				animal.setPeso(resultados.getDouble("peso"));
				animal.setPrecoCompra(resultados.getDouble("precocompra"));
				animal.setPrecoVenda(resultados.getDouble("precovenda"));
				animal.setRaca(resultados.getString("raca"));
				animal.setRegistro(resultados.getInt("registro"));
				animal.setTipo(resultados.getString("tipo"));
				lista.add(animal);
			}

			return lista;
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
		return null;
	}
	
	public List<Animal> listarTodosPorTipo(String tipo) {
		try {
			con = ConexaoUtil.getInstance().getConnection();
			List<Animal> lista = new ArrayList<Animal>();
			String sql = "Select * from animal where tipo = ?";
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, tipo);
			ResultSet resultados = preparador.executeQuery();
			while (resultados.next()) {
				Animal ani = new Animal();
				ani.setAltura(resultados.getDouble("altura"));
				ani.setDtNasc(resultados.getString("DtNasc"));
				ani.setDtUltMed(resultados.getString("DtUltMed"));
				ani.setPeso(resultados.getDouble("peso"));
				ani.setPrecoCompra(resultados.getDouble("precocompra"));
				ani.setPrecoVenda(resultados.getDouble("precovenda"));
				ani.setRaca(resultados.getString("raca"));
				ani.setRegistro(resultados.getInt("registro"));
				ani.setTipo(resultados.getString("tipo"));
				lista.add(ani);
			}

			return lista;
		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
		return null;
	}

	public Animal buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
