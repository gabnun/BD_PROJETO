package facisa.bd2.PetShop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import facisa.bd2.PetShop.Dao.VendaItemDAO;
import facisa.bd2.PetShop.Model.VendaItem;

@Service
public class VendaItemService {
	
	@Autowired
	private VendaItemDAO dao;
	
	
	public void inserirVendaItem1(VendaItem vendaItem) {
		dao.cadastrarVendaItem1(vendaItem);
		
	}
	
	public void inserirVendaItem2(VendaItem vendaItem) {
		dao.cadastrarVendaItem2(vendaItem);
		
	}
	
	public void UpdateVendaItem1(VendaItem vendaItem, int nota) {
		dao.updateVendaI1(vendaItem, nota);
		
	}
	
	public void UpdateVendaItem2(VendaItem vendaItem, int nota) {
		dao.updateVendaI2(vendaItem, nota);
		
	}
	
	public void UpdateVendaItem3(VendaItem vendaItem, int nota) {
		dao.updateVendaI3(vendaItem, nota);
		
	}
	
	public void UpdateVendaItem4(VendaItem vendaItem, int nota) {
		dao.updateVendaI4(vendaItem, nota);
		
	}
	
	public void UpdateVendaItem5(VendaItem vendaItem, int nota) {
		dao.updateVendaI5(vendaItem, nota);
		
	}
	
	public void deletarVendaItem(int nota) {
		dao.deleteVendaItem(nota);
	}
	
	public List<VendaItem> buscarTodos(){
		return dao.buscarTodos();
	}
	
	public List<VendaItem> buscarTodosPorDescricao(String descricao){
		return dao.buscarTodosPorDescricao(descricao);
	}
	
	public List<VendaItem> buscarTodosPorVendedor(String nome){
		return dao.buscarTodosPorVendedor(nome);
	}
	
	public List<VendaItem> buscarTodosPorMesAno(Integer mes, Integer ano){
		return dao.buscarTodosPorAnoMes(ano, mes);
	}
	
	public List<VendaItem> buscarVendasItemFuncionario(Integer matricula, Integer codigo){
		return dao.buscarTodosVendedorItem(matricula, codigo);
	}

}
