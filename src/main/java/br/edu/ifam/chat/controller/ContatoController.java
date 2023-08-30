package br.edu.ifam.chat.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifam.chat.model.Contato;
import br.edu.ifam.chat.service.ContatoService;

@RequestMapping("/Contato")
@RestController
public class ContatoController {
	
	List<Contato> contatos =  new ArrayList<>();
	
	@Autowired
	ContatoService contatoservice;
	
	@GetMapping
	ResponseEntity<List<Contato>> getContato(){
		List<Contato>contatos = contatoservice.getContatos();
		if(contatos.isEmpty()) 
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(contatos);
		
		return ResponseEntity.ok(contatos);
	}
	
	@PostMapping
	ResponseEntity<Contato> setContato(@RequestBody Contato contato){
			contatos.add(contato);
			return ResponseEntity.created(null).body(contato);
		}
	
	@PutMapping("/(id)")
	ResponseEntity<Contato> getContato(@PathVariable int id){
		try {
			return ResponseEntity.ok(contatoservice.getContato(id));
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Contato());
		}
	}
}
