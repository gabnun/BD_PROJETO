package facisa.bd2.PetShop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import facisa.bd2.PetShop.Model.Animal;
import facisa.bd2.PetShop.service.AnimalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Animal controller")
@Controller
@RequestMapping("/animal")
public class AnimalController {
	
	@Autowired
	private AnimalService service;
	
	@ApiOperation(value = "Inserir com todos os dados sendo fornecidos")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Animal cadastrado com sucesso") })
	@PostMapping("/inset1")
	public ResponseEntity<Void> inserirAnimal1(@RequestBody Animal animal){
		service.inserirAnimal1(animal);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Inserir sem informar peso, altura e data da última medição")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Animal cadastrado com sucesso") })
	@PostMapping("/inset2")
	public ResponseEntity<Void> inserirAnimal2(@RequestBody Animal animal){
		service.inserirAnimal2(animal);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Inserir sem informar o preço de venda")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Animal cadastrado com sucesso") })
	@PostMapping("/inset3")
	public ResponseEntity<Void> inserirAnimal3(@RequestBody Animal animal){
		service.inserirAnimal3(animal);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Inserir sem informar o preço de compra")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Animal cadastrado com sucesso") })
	@PostMapping("/inset4")
	public ResponseEntity<Void> inserirAnimal4(@RequestBody Animal animal){
		service.inserirAnimal4(animal);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Inserir sem informar o preço de compra e nem o de venda")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Animal cadastrado com sucesso") })
	@PostMapping("/inset5")
	public ResponseEntity<Void> inserirAnimal5(@RequestBody Animal animal){
		service.inserirAnimal5(animal);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Inserir sem informar a data de nascimento")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Animal cadastrado com sucesso") })
	@PostMapping("/inset6")
	public ResponseEntity<Void> inserirAnimal6(@RequestBody Animal animal){
		service.inserirAnimal6(animal);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	
	@ApiOperation(value = "Deletar por registro")
	@DeleteMapping("/deletarA1/{id}")
	public ResponseEntity<Void> deletarPorRegistr(@PathVariable Long id) throws Exception {
		service.deletar1(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Deletar por tipo")
	@DeleteMapping("/deletarA2/{tipo}")
	public ResponseEntity<Void> deletarPorTipo(@PathVariable String tipo) throws Exception {
		service.deletar2(tipo);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Atualizar altura, peso e data de medição")
	@PutMapping("/updateAnimal1/{id}")
	public ResponseEntity<Void> updateAnimal1(@RequestBody Animal animal, @RequestParam Long id) throws Exception {
		service.updateAnimal1(animal, id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar peso e data da última atualização")
	@PutMapping("/updateAnimal2/{id}")
	public ResponseEntity<Void> updateAnimal2(@RequestBody Animal animal, @RequestParam Long id) throws Exception {
		service.updateAnimal2(animal, id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar altura e data da última medição")
	@PutMapping("/updateAnimal3/{id}")
	public ResponseEntity<Void> updateAnimal3(@RequestBody Animal animal, @RequestParam Long id) throws Exception {
		service.updateAnimal3(animal, id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar o preço de venda")
	@PutMapping("/updateAnimal4/{id}")
	public ResponseEntity<Void> updateAnimal4(@RequestBody Animal animal, @RequestParam Long id) throws Exception {
		service.updateAnimal4(animal, id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar o preço de compra")
	@PutMapping("/updateAnimal5/{id}")
	public ResponseEntity<Void> updateAnimal5(@RequestBody Animal animal, @RequestParam Long id) throws Exception {
		service.updateAnimal5(animal, id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
	@ApiOperation(value = "Alterar  preço de compra e o de venda")
	@PutMapping("/updateAnimal6/{id}")
	public ResponseEntity<Void> updateAnimal6(@RequestBody Animal animal, @RequestParam Long id) throws Exception {
		service.updateAnimal6(animal, id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar tipo")
	@PutMapping("/updateAnimal7/{id}")
	public ResponseEntity<Void> updateAnimal7(@RequestBody Animal animal, @RequestParam Long id) throws Exception {
		service.updateAnimal7(animal, id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar raca")
	@PutMapping("/updateAnimal8/{id}")
	public ResponseEntity<Void> updateAnimal8(@RequestBody Animal animal, @RequestParam Long id) throws Exception {
		service.updateAnimal8(animal, id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar tipo e raca")
	@PutMapping("/updateAnimal9/{id}")
	public ResponseEntity<Void> updateAnimal9(@RequestBody Animal animal, @RequestParam Long id) throws Exception {
		service.updateAnimal9(animal, id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Mostrar todos os animais")
	@GetMapping
	public ResponseEntity<List<Animal>> findAll() throws Exception {
		List<Animal> animal = service.listarTodos();
		return new ResponseEntity<List<Animal>>(animal,HttpStatus.OK);
	}
	
	@ApiOperation(value = "Mostrar todos os animais por tipo")
	@GetMapping("/busca-por-tipo")
	public ResponseEntity<List<Animal>> findAllbyTpo(String tipo) throws Exception {
		List<Animal> animal = service.listarPorTipo(tipo);
		return new ResponseEntity<List<Animal>>(animal,HttpStatus.OK);
	}
	
}
