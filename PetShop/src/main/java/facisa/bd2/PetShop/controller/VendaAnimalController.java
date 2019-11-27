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

import facisa.bd2.PetShop.Model.VendaAnimal;
import facisa.bd2.PetShop.service.VendaAnimalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Venda Animal controller")
@Controller
@RequestMapping("/vendaAnimal")
public class VendaAnimalController {
	
	@Autowired
	private VendaAnimalService service;
	
	@ApiOperation(value = "Inserir sabendo todos os dados")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Venda cadastrado com sucesso") })
	@PostMapping("/insertVA1")
	public ResponseEntity<Void> inserirVendaAnimalA1(@RequestBody VendaAnimal vendaAnimal){
		service.inserirVendaAnimalA1(vendaAnimal);;
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Inserir sem informar o desconto")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Venda cadastrado com sucesso") })
	@PostMapping("/insertVA2")
	public ResponseEntity<Void> inserirVendaAnimalA2(@RequestBody VendaAnimal vendaAnimal){
		service.inserirVendaAnimalA2(vendaAnimal);;
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Alterar NotaFiscal, sabendo a nota fiscal")
	@PutMapping("/updateVendaA1/{NotaFiscal}")
	public ResponseEntity<Void> updateVendaA1(@RequestBody VendaAnimal vendaAnimal, @RequestParam int nota) throws Exception {
		service.updateVendaA1(vendaAnimal, nota);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar RegAnimal sabendo a nota fiscal")
	@PutMapping("/updateVendaA2/{NotaFiscal}")
	public ResponseEntity<Void> updateVendaA2(@RequestBody VendaAnimal vendaAnimal, @RequestParam int nota) throws Exception {
		service.updateVendaA2(vendaAnimal, nota);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar MatFunc sabendo a nota fiscal")
	@PutMapping("/updateVendaA3/{NotaFiscal}")
	public ResponseEntity<Void> updateVendaA3(@RequestBody VendaAnimal vendaAnimal, @RequestParam int nota) throws Exception {
		service.updateVendaA3(vendaAnimal, nota);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar dia, mês e ano sabendo a nota fiscal")
	@PutMapping("/updateVendaA4/{NotaFiscal}")
	public ResponseEntity<Void> updateVendaA4(@RequestBody VendaAnimal vendaAnimal, @RequestParam int nota) throws Exception {
		service.updateVendaA4(vendaAnimal, nota);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar desconto")
	@PutMapping("/updateVendaA5/{NotaFiscal}")
	public ResponseEntity<Void> updateVendaA5(@RequestBody VendaAnimal vendaAnimal, @RequestParam int nota) throws Exception {
		service.updateVendaA5(vendaAnimal, nota);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Deletar uma venda sabendo a nota fiscal")
	@DeleteMapping("/deletar1/{nota}")
	public ResponseEntity<Void> deletarVendaAnimal(@PathVariable int nota) throws Exception {
		service.deletarVendaAnimal(nota);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
	@ApiOperation(value = "Mostrar todos as vendas dos Animais")
	@GetMapping
	public ResponseEntity<List<VendaAnimal>> findAll() throws Exception {
		List<VendaAnimal> animal = service.buscarTodos();
		return new ResponseEntity<List<VendaAnimal>>(animal,HttpStatus.OK);
	}
	
	
	@ApiOperation(value = "Mostrar todos as vendas por Tipo")
	@GetMapping("/tipo")
	public ResponseEntity<List<VendaAnimal>> findAllByTipo(@RequestParam String tipo) throws Exception {
		List<VendaAnimal> animal = service.buscarTodosPorTipo(tipo);
		return new ResponseEntity<List<VendaAnimal>>(animal,HttpStatus.OK);
	}
	
	@ApiOperation(value = "Mostrar todos as vendas dos itens por vendedor")
	@GetMapping("/vendedor")
	public ResponseEntity<List<VendaAnimal>> findAllByVendedor(@RequestParam String vendedor) throws Exception {
		List<VendaAnimal> animal = service.buscarTodosPorVendedor(vendedor);
		return new ResponseEntity<List<VendaAnimal>>(animal,HttpStatus.OK);
	}

}
