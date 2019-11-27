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

import facisa.bd2.PetShop.Model.Funcionario;
import facisa.bd2.PetShop.service.FuncionarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Funcionario controller")
@Controller
@RequestMapping("/funcionario")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService service;
	
	
	@ApiOperation(value = "Inserir informando todos os dados")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Funcionario cadastrado com sucesso") })
	@PostMapping("/insertFunc1")
	public ResponseEntity<Void> cadastrarFuncionario1(@RequestBody Funcionario funcionario){
		service.cadastrarFuncionario1(funcionario);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Inserir sem informar o salário")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Funcionario cadastrado com sucesso") })
	@PostMapping("/insertFunc2")
	public ResponseEntity<Void> cadastrarFuncionario2(@RequestBody Funcionario funcionario){
		service.cadastrarFuncionario2(funcionario);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Inserir sem informar o telefone")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Funcionario cadastrado com sucesso") })
	@PostMapping("/insertFunc3")
	public ResponseEntity<Void> cadastrarFuncionario3(@RequestBody Funcionario funcionario){
		service.cadastrarFuncionario3(funcionario);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Alterar o nome sabendo a matrícula")
	@PutMapping("/updateFuncionario1/{id}")
	public ResponseEntity<Void> updateFuncionario1(@RequestBody Funcionario funcionario, @RequestParam Long id) throws Exception {
		service.updateFuncionario1(funcionario, id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar o nome sabendo o CPF")
	@PutMapping("/updateFuncionario2/{cpf}")
	public ResponseEntity<Void> updateFuncionario2(@RequestBody Funcionario funcionario, @RequestParam String cpf) throws Exception {
		service.updateFuncionario2(funcionario, cpf);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar o endereço sabendo a matrícula")
	@PutMapping("/updateFuncionario3/{id}")
	public ResponseEntity<Void> updateFuncionario3(@RequestBody Funcionario funcionario, @RequestParam Long id) throws Exception {
		service.updateFuncionario3(funcionario, id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar a função sabendo  a matrícula ")
	@PutMapping("/updateFuncionario4/{id}")
	public ResponseEntity<Void> updateFuncionario4(@RequestBody Funcionario funcionario, @RequestParam Long id) throws Exception {
		service.updateFuncionario4(funcionario, id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar data de demissão sabendo a matrícula")
	@PutMapping("/updateFuncionario5/{id}")
	public ResponseEntity<Void> updateFuncionario5(@RequestBody Funcionario funcionario, @RequestParam Long id) throws Exception {
		service.updateFuncionario5(funcionario, id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Deletar um funcionário sabendo a matrícula")
	@DeleteMapping("/deletarFuncionario1/{id}")
	public ResponseEntity<Void> deletarFuncionario(@PathVariable Long id) throws Exception {
		service.deletarFuncionario(id);;
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Mostrar todos os funcionario")
	@GetMapping
	public ResponseEntity<List<Funcionario>> findAll() throws Exception {
		List<Funcionario> funcionario  = service.buscarTodos();
		return new ResponseEntity<List<Funcionario>>(funcionario, HttpStatus.OK);
	}

	@ApiOperation(value = "Mostrar os funcionario recebendo o nome")
	@GetMapping("/{nome}")
	public ResponseEntity<List<Funcionario>> findAllbyTpo(@PathVariable String nome) throws Exception {
		List<Funcionario> funcionario  = service.buscarPorNome(nome);
		return new ResponseEntity<List<Funcionario>>(funcionario, HttpStatus.OK);
	}

}
