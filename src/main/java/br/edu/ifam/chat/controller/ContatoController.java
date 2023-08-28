package br.edu.ifam.chat.controller;

import java.util.List;

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
	
	@GetMapping
	List<Contato> getAll(){
		return null;
	}
	
	@PostMapping
	Contato newContact(@RequestBody Contato contato) {
		return null;
	}
	
	@PutMapping("/(id)")
	void deleteContato(@PathVariable Long id) {
		
	}
}
