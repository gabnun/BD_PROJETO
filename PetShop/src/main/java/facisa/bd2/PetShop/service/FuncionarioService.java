package facisa.bd2.PetShop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import facisa.bd2.PetShop.Dao.FuncionarioDAO;
import facisa.bd2.PetShop.Model.Funcionario;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioDAO dao;
	
	public void cadastrarFuncionario1(Funcionario funcionario) {
		dao.cadastrarFuncionario1(funcionario);
	}
	
	public void cadastrarFuncionario2(Funcionario funcionario) {
		dao.cadastrarFuncionario2(funcionario);
	}
	
	public void cadastrarFuncionario3(Funcionario funcionario) {
		dao.cadastrarFuncionario3(funcionario);
	}
	
	public void updateFuncionario1(Funcionario funcionario, Long id) {
		dao.updateFuncionario1(funcionario, id);
	}
	
	public void updateFuncionario2(Funcionario funcionario, String cpf) {
		dao.updateFuncionario2(funcionario, cpf);;
	}
	
	public void updateFuncionario3(Funcionario funcionario, Long id) {
		dao.updateFuncionario3(funcionario, id);
	}
	
	public void updateFuncionario4(Funcionario funcionario, Long id) {
		dao.updateFuncionario4(funcionario, id);
	}
	
	public void updateFuncionario5(Funcionario funcionario, Long id) {
		dao.updateFuncionario5(funcionario, id);
	}
	
	public void deletarFuncionario(Long id) {
		dao.deleteFuncionario(id);
	}
	
	public List<Funcionario> buscarTodos(){
		return dao.listarTodos();
	}
	
	public List<Funcionario> buscarPorNome(String nome) {
		return dao.buscarPorNome(nome);
	}

}
