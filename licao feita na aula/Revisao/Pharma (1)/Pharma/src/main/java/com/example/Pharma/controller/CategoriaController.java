package com.example.Pharma.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//o controller serve para fazer a conexao com o front e o service faz o crud
//O controller passa as coisas para o serve e ele encaminha para o front

import com.example.Pharma.model.Categoria;
import com.example.Pharma.repository.CategoriaRepository;
import com.example.Pharma.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
@CrossOrigin("*") //Ele permite acesso aos recursos a partir de origens diferentes
public class CategoriaController {

	@Autowired
	private CategoriaRepository  repositoryC;
	
	@Autowired
	private CategoriaService serviceC;
	
	
	@GetMapping
	public ResponseEntity <List<Categoria>> pegarTodasCategorias(){
		List<Categoria> listaDeCategorias = repositoryC.findAll();
		if(listaDeCategorias.isEmpty()) {
			return ResponseEntity.status(204).build();
	} else {
		return ResponseEntity.status(200).body(listaDeCategorias);
		
	     }
	}
	
	@GetMapping("/id/{id_categoria}")
	public ResponseEntity<Optional<Categoria>> buscarCategoriaPorId(@PathVariable(value = "id_categoria") Long idCategoria){    //um comando para descobrir se o que ta dentro dele é vazio ou não
    Optional<Categoria>idDaCategoria = repositoryC.findById(idCategoria);                                            //o OPTIONAL SÓ RECEBE 1 VALOR ESPECIFICO        //ele retorno o idCategoria, o findById vai no banco de dados verifica se ele tem algo lá (se sim, ele retorna o valor que é o idDaCategoria e se não, volta e fala que não tem nada.
	
    if(idDaCategoria.isEmpty()) {
    	return ResponseEntity.status(204).build();
    }else {
    	return ResponseEntity.status(200).body(idDaCategoria);
    	
    }
    
	}
	
	@GetMapping("/buscar")
    public ResponseEntity<Object> buscarCategoriaPorNome(@RequestParam String nomeCategoria) {
		List<Object>listaDeCategorias = repositoryC.findAllByNomeCategoriaContaining(nomeCategoria);
		if(listaDeCategorias.isEmpty()) {
			return ResponseEntity.status(400).body("Teste");
		}else {
			return ResponseEntity.status(200).body(listaDeCategorias);
		}
	}

	@PostMapping("/salvar")
	   public ResponseEntity<Object> salvarNovaCategoria(@RequestBody Categoria novaCategoria){
          return serviceC.cadastrarNovaCategoria(novaCategoria)	
        		  .map(verificandoCategoria ->ResponseEntity.status(200).body(verificandoCategoria))      //Como se fosse o If
        		  .orElse(ResponseEntity.status(400).body("Categoria já cadastrada, verifique "));      //como se fosse o Else
	}

	@PutMapping("/atualizar/{id_categoria}")
	public ResponseEntity<Object> remodelarCategoria(@PathVariable(value = "id_categoria") Long idCategoria,
     @Valid @RequestBody Categoria atualizacaoCategoria) {
    	 return serviceC.atualizarCategoria(idCategoria, atualizacaoCategoria)
    		 .map(categoriaAtualizada -> ResponseEntity.status(201).body(categoriaAtualizada))
    		 .orElse(ResponseEntity.status(400).body("Categoria inexistente "));

	}
	
	@DeleteMapping("/deletar")
	public ResponseEntity<String> deletarCategoria(@RequestParam Long idCategoria){
	return serviceC.deletarIdCategoria(idCategoria)
		.map(categoriaDeletada -> ResponseEntity.status(400).body("Categoria não localiada"))
		.orElse(ResponseEntity.status(200).body("Categoria deletada."));
    }
}