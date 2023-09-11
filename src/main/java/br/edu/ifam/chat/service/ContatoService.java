package br.edu.ifam.chat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.ifam.chat.model.Contato;

@Service
public class ContatoService {
	
	List<Contato> contatos =  new ArrayList<>();
	
	public List<Contato> getContatos(){
		return contatos;
	}
	public Contato getContato(int id) {
		return contatos.get(id);
		
	}
 
	public void setContato(Contato contato) {
		contatos.add(contato);
	}
	
	public void setContato(int id,Contato contato) {
		contatos.set(id, contato);
	}
	public void deleteContato(int id) {
		contatos.remove(id);
	}
}
