package com.example.Revisao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

//Contato com banco de dados, pega as informações

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Revisao.model.Usuario;
import com.example.Revisao.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios") // http://localhost:8080/usuarios  //Endpoint
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;
	
	@PostMapping
	public ResponseEntity<Usuario> postUsuario(@RequestBody Usuario usuario){
		return ResponseEntity.status(200).body(repository.save(usuario));
	}
	@PutMapping
	public ResponseEntity<Usuario> putUsuario(@RequestBody Usuario usuario){
		return ResponseEntity.status(200).body(repository.save(usuario));
	}
	
	@DeleteMapping
	public void deleteUsuario(@RequestParam long id) {
		repository.deleteById(id);
	}
	
	@GetMapping
	public ResponseEntity<List<Usuario>> getAlUsuario(){         //ResponseEntity é como se fosse um objeto, ele manipula a informação feita para o front end  //Status e corpo para a pagina
		List<Usuario> listaUsuarios = repository.findAll();
		if(listaUsuarios.isEmpty()) {
			return ResponseEntity.status(204).build();
			}else {
				return ResponseEntity.status(200).body(listaUsuarios);
			}
		
		//return ResponseEntity.status(200).body(repository.findAll());    //retorno de que está dando erro:ok
		
		
	}
	//@GetMapping
	//public ResponseEntity<Usuario> getById(@RequestParam long id){
		//return
	//}
	
}
