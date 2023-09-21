package br.edu.ifam.chat.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mensagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Calendar dataHora;
	private String conteudo;
	private Contato emissor;
	private Contato receptor;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Calendar getDataHora() {
		return dataHora;
	}
	public void setDataHora(Calendar dataHora) {
		this.dataHora = dataHora;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public Contato getEmissor() {
		return emissor;
	}
	public void setEmissor(Contato emissor) {
		this.emissor = emissor;
	}
	public Contato getReceptor() {
		return receptor;
	}
	
	public void setReceptor(Contato receptor) {
		this.receptor = receptor;
	}
	
	

}
