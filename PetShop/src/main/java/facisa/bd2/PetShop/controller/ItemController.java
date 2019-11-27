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

import facisa.bd2.PetShop.Model.Item;
import facisa.bd2.PetShop.service.ItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@Api(value = "Item controller")
@Controller
@RequestMapping("/item")
public class ItemController {
	

		@Autowired
		private ItemService service;
		
		
		@ApiOperation(value = "Inserir um item sabendo todos os campos")
		@ApiResponses(value = { @ApiResponse(code = 201, message = "Item cadastrado com sucesso") })
		@PostMapping("/insert1")
		public ResponseEntity<Void> inserirItem1(@RequestBody Item item){
			service.inserirItem1(item);
			return new ResponseEntity<>(HttpStatus.CREATED);
		}
		
		@ApiOperation(value = "Inserir item sem validade")
		@ApiResponses(value = { @ApiResponse(code = 201, message = "Item cadastrado com sucesso") })
		@PostMapping("/insert2")
		public ResponseEntity<Void> inserirItem2(@RequestBody Item item){
			service.inserirItem2(item);
			return new ResponseEntity<>(HttpStatus.CREATED);
		}
		
		@ApiOperation(value = "Inserir item sem PreçoLoja")
		@ApiResponses(value = { @ApiResponse(code = 201, message = "Item cadastrado com sucesso") })
		@PostMapping("/insert3")
		public ResponseEntity<Void> inserirItem3(@RequestBody Item item){
			service.inserirItem3(item);
			return new ResponseEntity<>(HttpStatus.CREATED);
		}
		
		@ApiOperation(value = "Alterar PreçoFornecedor sabendo o código")
		@PutMapping("/updateItem1/{id}")
		public ResponseEntity<Void> updateItem1(@RequestBody Item item, @RequestParam Long id) throws Exception {
			service.updateItem1(item, id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		@ApiOperation(value = "Alterar PreçoLoja sabendo o código")
		@PutMapping("/updateItem2/{id}")
		public ResponseEntity<Void> updateItem2(@RequestBody Item item, @RequestParam Long id) throws Exception {
			service.updateItem2(item, id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		@ApiOperation(value = "Alterar PreçoFornecedor e PreçoLoja sabendo o código")
		@PutMapping("/updateItem3/{id}")
		public ResponseEntity<Void> updateItem3(@RequestBody Item item, @RequestParam Long id) throws Exception {
			service.updateItem3(item, id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		@ApiOperation(value = "Alterar descrição e tipo, sabendo o código")
		@PutMapping("/updateItem4/{id}")
		public ResponseEntity<Void> updateItem4(@RequestBody Item item, @RequestParam Long id) throws Exception {
			service.updateItem4(item, id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		@ApiOperation(value = "Deletar por registro")
		@DeleteMapping("/deletar1/{id}")
		public ResponseEntity<Void> deletarItem(@PathVariable Long id) throws Exception {
			service.deletar1(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		@ApiOperation(value = "Mostrar todos os itens")
		@GetMapping
		public ResponseEntity<List<Item>> findAll() throws Exception {
			List<Item> item = service.buscarTodos();
			return new ResponseEntity<List<Item>>(item,HttpStatus.OK);
		}
		
		@ApiOperation(value = "Mostrar todos os itens")
		@GetMapping("/dados")
		public ResponseEntity<List<Item>> findAllDados(String descricao) throws Exception {
			List<Item> item = service.buscarTodosPorDescricao(descricao);
			return new ResponseEntity<List<Item>>(item,HttpStatus.OK);
		}
			
		@ApiOperation(value = "Mostrar todos os itens de um tipo")
		@GetMapping("/tipo")
		public ResponseEntity<List<Item>> findAllbyTpo(String tipo) throws Exception {
			List<Item> animal = service.buscarTodosPorTipo(tipo);
			return new ResponseEntity<List<Item>>(animal,HttpStatus.OK);
		}


}
