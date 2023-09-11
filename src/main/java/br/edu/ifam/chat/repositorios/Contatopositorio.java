package br.edu.ifam.chat.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifam.chat.model.Contato;

public interface Contatopositorio extends JpaRepository<Contato, Long> {

}
