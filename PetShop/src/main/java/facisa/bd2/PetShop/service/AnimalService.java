package facisa.bd2.PetShop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import facisa.bd2.PetShop.Dao.AnimalDAO;
import facisa.bd2.PetShop.Model.Animal;

@Service
public class AnimalService {
	
	@Autowired
	private AnimalDAO dao;
	
	public void inserirAnimal1(Animal animal) {
		dao.cadastrarAnimal1(animal);
	}
	
	public void inserirAnimal2(Animal animal) {
		dao.cadastrarAnimal2(animal);
	}
	
	public void inserirAnimal3(Animal animal) {
		dao.cadastrarAnimal3(animal);
	}
	
	public void inserirAnimal4(Animal animal) {
		dao.cadastrarAnimal4(animal);
	}
	
	public void inserirAnimal5(Animal animal) {
		dao.cadastrarAnimal5(animal);
	}
	
	public void inserirAnimal6(Animal animal) {
		dao.cadastrarAnimal6(animal);
	}
	
	public void deletar1(Long id) {
		dao.deleteAnimalViaRegistro(id);
	}
	
	public void deletar2(String tipo) {
		dao.deleteAnimalViaTipo(tipo);
	}
	
	public void updateAnimal1(Animal animal, Long id) {
		dao.updateAnimal1(animal, id);
	}
	
	public void updateAnimal2(Animal animal, Long id) {
		dao.updateAnimal2(animal, id);
	}
	
	public void updateAnimal3(Animal animal, Long id) {
		dao.updateAnimal3(animal, id);
	}
	
	public void updateAnimal4(Animal animal, Long id) {
		dao.updateAnimal4(animal, id);
	}
	
	public void updateAnimal5(Animal animal, Long id) {
		dao.updateAnimal5(animal, id);
	}
	
	public void updateAnimal6(Animal animal, Long id) {
		dao.updateAnimal6(animal, id);
	}
	
	public void updateAnimal7(Animal animal, Long id) {
		dao.updateAnimal7(animal, id);
	}
	
	public void updateAnimal8(Animal animal, Long id) {
		dao.updateAnimal8(animal, id);
	}
	
	public void updateAnimal9(Animal animal, Long id) {
		dao.updateAnimal9(animal, id);
	}
	
	public List<Animal> listarTodos(){
		return dao.listarTodos();
	}
	
	public List<Animal> listarPorTipo(String tipo){
		return dao.listarTodosPorTipo(tipo);
	}

}
