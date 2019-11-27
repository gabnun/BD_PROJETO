package facisa.bd2.PetShop.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import facisa.bd2.PetShop.Dao.VendaAnimalDAO;
import facisa.bd2.PetShop.Model.VendaAnimal;

@Service
public class VendaAnimalService {
	
	
	@Autowired
	private VendaAnimalDAO dao;
	
	
	public void inserirVendaAnimalA1(VendaAnimal vendaAnimal) {
		dao.cadastrarVendaAnimal1(vendaAnimal);
		
	}
	
	public void inserirVendaAnimalA2(VendaAnimal vendaAnimal) {
		dao.cadastrarVendaAnimal2(vendaAnimal);
		
	}
	
	public void updateVendaA1(VendaAnimal vendaAnimal, int nota) {
		dao.updateVendaA1(vendaAnimal, nota);
		
	}
	
	public void updateVendaA2(VendaAnimal vendaAnimal, int nota) {
		dao.updateVendaA2(vendaAnimal, nota);
		
	}
	
	public void updateVendaA3(VendaAnimal vendaAnimal, int nota) {
		dao.updateVendaA3(vendaAnimal, nota);
		
	}
	
	public void updateVendaA4(VendaAnimal vendaAnimal, int nota) {
		dao.updateVendaA4(vendaAnimal, nota);
		
	}
	
	public void updateVendaA5(VendaAnimal vendaAnimal, int nota) {
		dao.updateVendaA5(vendaAnimal, nota);
		
	}
	
	public void deletarVendaAnimal(int nota) {
		dao.deleteVendaA(nota);
	}
	
	public List<VendaAnimal> buscarTodos() throws SQLException{
		return dao.listarTodos();
	}
	
	public List<VendaAnimal> buscarTodosPorTipo(String tipo) throws SQLException{
		return dao.listarTodosPorTipo(tipo);
	}
	
	public List<VendaAnimal> buscarTodosPorVendedor(String nome) throws SQLException{
		return dao.listarTodosPorNomeVendedor(nome);
	
	}	
	

}
