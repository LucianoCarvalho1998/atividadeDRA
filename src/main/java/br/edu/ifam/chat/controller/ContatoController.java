package br.edu.ifam.chat.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifam.chat.model.Contato;

@RequestMapping("/Contato")
@RestController
public class ContatoController {
	
	List<Contato> contatos =  new ArrayList<>();
	
	@GetMapping
	ResponseEntity<List<Contato>> getContatos(){
		return ResponseEntity.ok(contatos);
	}
	
	@PostMapping
	ResponseEntity<Contato> setContato(@RequestBody Contato contato){
			contatos.add(contato);
			return ResponseEntity.created(null).body(contato);
		}
	
	@PutMapping("/(id)")
	void deleteContato(@PathVariable Long id) {
		
	}
}
