package br.com.dio.controller;

import br.com.dio.entity.Produto;
import br.com.dio.exception.ProdutoNullException;
import br.com.dio.exception.ProdutoPriceException;
import br.com.dio.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {
	@Autowired
	private ProdutoService service;

	//@RequestMapping(method = RequestMethod.POST, value="/save")

	@PostMapping(value = "")
	public ResponseEntity<Produto> salvaProduto(@RequestBody Produto produto){
		if(produto.getNome() == null || produto.getNome().length() <= 1 || produto.getPreco() == null )
			throw new ProdutoNullException();
		if( produto.getPreco() <= 0)
			throw new ProdutoPriceException();

		produto = service.save(produto);
		return ResponseEntity.ok().body(produto);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Produto> buscaProduto(@PathVariable Long id){
		Produto produto = service.findById(id);
		return ResponseEntity.ok().body(produto);
	}

	@GetMapping
	public ResponseEntity<List<Produto>> buscaTodosProdutos(){
		List<Produto> produtos = service.findAll();
		return ResponseEntity.ok().body(produtos);
	}


}
