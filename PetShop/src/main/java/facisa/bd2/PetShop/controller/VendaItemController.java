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

import facisa.bd2.PetShop.Model.VendaItem;
import facisa.bd2.PetShop.service.VendaItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Venda Item controller")
@Controller
@RequestMapping("/vendaItem")
public class VendaItemController {
	
	
	@Autowired
	private VendaItemService service;
	
	@ApiOperation(value = "Inserir sabendo todos os dados")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Venda cadastrado com sucesso") })
	@PostMapping("/insertVI1")
	public ResponseEntity<Void> inserirVendaItem1(@RequestBody VendaItem vendaItem){
		service.inserirVendaItem1(vendaItem);;
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Inserir sem informar o desconto")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Venda cadastrado com sucesso") })
	@PostMapping("/insertVI2")
	public ResponseEntity<Void> inserirVendaItem2(@RequestBody VendaItem vendaItem){
		service.inserirVendaItem2(vendaItem);;
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Alterar NtFiscal, sabendo a nota fiscal")
	@PutMapping("/updateVI1/{nota}")
	public ResponseEntity<Void> UpdateVendaItem1(@RequestBody VendaItem vendaItem, @RequestParam int nota) throws Exception {
		service.UpdateVendaItem1(vendaItem, nota);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar ItemCod sabendo a nota fiscal")
	@PutMapping("/updateVI2/{NtFiscal}")
	public ResponseEntity<Void> UpdateVendaItem2(@RequestBody VendaItem vendaItem, @RequestParam int nota) throws Exception {
		service.UpdateVendaItem2(vendaItem, nota);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar FuncMat sabendo a nota fiscal")
	@PutMapping("/updateVI3/{NtFiscal}")
	public ResponseEntity<Void> UpdateVendaItem3(@RequestBody VendaItem vendaItem, @RequestParam int nota) throws Exception {
		service.UpdateVendaItem3(vendaItem, nota);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar dia, mês e ano sabendo a nota fiscal")
	@PutMapping("/updateVI4/{NtFiscal}")
	public ResponseEntity<Void> UpdateVendaItem4(@RequestBody VendaItem vendaItem, @RequestParam int nota) throws Exception {
		service.UpdateVendaItem4(vendaItem, nota);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar desconto")
	@PutMapping("/updateVI5/{NtFiscal}")
	public ResponseEntity<Void> UpdateVendaItem5(@RequestBody VendaItem vendaItem, @RequestParam int nota) throws Exception {
		service.UpdateVendaItem5(vendaItem, nota);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Deletar uma venda sabendo a nota fiscal")
	@DeleteMapping("/deletar1/{nota}")
	public ResponseEntity<Void> deletarVendaItem(@PathVariable int nota) throws Exception {
		service.deletarVendaItem(nota);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Mostrar todos as vendas dos itens")
	@GetMapping
	public ResponseEntity<List<VendaItem>> findAll() throws Exception {
		List<VendaItem> item = service.buscarTodos();
		return new ResponseEntity<List<VendaItem>>(item,HttpStatus.OK);
	}
	
	@ApiOperation(value = "Mostrar todos as vendas dos itens por vendedor")
	@GetMapping("/vendedor")
	public ResponseEntity<List<VendaItem>> findAllByVendedor(@RequestParam String vendedor) throws Exception {
		List<VendaItem> item = service.buscarTodosPorVendedor(vendedor);
		return new ResponseEntity<List<VendaItem>>(item,HttpStatus.OK);
	}
	
	@ApiOperation(value = "Mostrar todos as vendas dos itens")
	@GetMapping("/descricao")
	public ResponseEntity<List<VendaItem>> findAllByDescricao(@RequestParam String descricao) throws Exception {
		List<VendaItem> item = service.buscarTodosPorDescricao(descricao);
		return new ResponseEntity<List<VendaItem>>(item,HttpStatus.OK);
	}
	
	@ApiOperation(value = "Mostrar todos as vendas dos itens")
	@GetMapping("/mes-ano")
	public ResponseEntity<List<VendaItem>> findAllByMesAno(@RequestParam Integer mes, @RequestParam Integer ano) throws Exception {
		List<VendaItem> item = service.buscarTodosPorMesAno(mes, ano);
		return new ResponseEntity<List<VendaItem>>(item,HttpStatus.OK);
	}
	
	@ApiOperation(value = "Mostrar todos as vendas dos itens")
	@GetMapping("/matricula-codigo")
	public ResponseEntity<List<VendaItem>> findAllByMatriculaCodigo(@RequestParam Integer matricula, @RequestParam Integer codigo) throws Exception {
		List<VendaItem> item = service.buscarVendasItemFuncionario(matricula, codigo);
		return new ResponseEntity<List<VendaItem>>(item,HttpStatus.OK);
	}

}
