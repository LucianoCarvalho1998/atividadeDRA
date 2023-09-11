package br.edu.ifam.chat.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifam.chat.model.Contato;
import br.edu.ifam.chat.repositorios.ContatoRepositorio;

@Service
public class ContatoService {

	List<Contato> contatos = new ArrayList<>();

	@Autowired
	ContatoRepositorio contatoRepositorio;

	public List<Contato> getContatos() {
		
		return contatoRepositorio.findAll();
	}

	public Contato getContato(Long id) {
		
	 Optional<Contato>optionalContato = contatoRepositorio.findById(id);
	 if(optionalContato.isPresent())
	   return optionalContato.get();
	 return new Contato();

	}

	public Contato setContato(Contato contato) {
		return contatoRepositorio.save(contato);
	}

	public Contato setContato(Long id, Contato contato) {
		Optional<Contato> optionalContato = contatoRepositorio.findById(id);
		if(optionalContato.isPresent()) {
			contato.setId(id);
		return contatoRepositorio.save(contato);
		}
		return new Contato();
	}

	public void deleteContato(Long id) {
		Optional<Contato>optionalContato= contatoRepositorio.findById(id);
		if(optionalContato.isPresent())
			contatoRepositorio.deleteById(id);
	}
}
