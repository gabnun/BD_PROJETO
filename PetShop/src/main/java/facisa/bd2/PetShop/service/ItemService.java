package facisa.bd2.PetShop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import facisa.bd2.PetShop.Dao.ItemDAO;
import facisa.bd2.PetShop.Model.Item;

@Service
public class ItemService {
	
	@Autowired
	private ItemDAO dao;
	
	public void inserirItem1(Item item) {
		dao.inserirItem1(item);
		
	}
	
	public void inserirItem2(Item item) {
		dao.inserirItem2(item);
		
	}
	
	public void inserirItem3(Item item) {
		dao.inserirItem3(item);
		
	}
	
	public void updateItem1(Item item, Long id) {
		dao.updateItem1(item, id);
	}
	
	public void updateItem2(Item item, Long id) {
		dao.updateItem2(item, id);
	}
	
	public void updateItem3(Item item, Long id) {
		dao.updateItem3(item, id);
	}
	
	public void updateItem4(Item item, Long id) {
		dao.updateItem4(item, id);
	}
	
	public void deletar1(Long id) {
		dao.deleteItem(id);
	}
	
	public List<Item> buscarTodos() throws Exception {
		return dao.listarTodos();
	}

	public List<Item> buscarTodosPorDescricao(String descricao) throws Exception {
		return dao.listarTodosPorDescricao(descricao);
	}

	public List<Item> buscarTodosPorTipo(String tipo) throws Exception {
		return dao.listarTodosPorTipo(tipo);
	}
	
}
