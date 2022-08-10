package br.com.fuctura.gerenciador.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fuctura.gerenciador.entidades.Jogador;
import br.com.fuctura.gerenciador.respository.JogadorRepository;

@RestController // o Controlador recebe as requisições do cliente - o Controller devolve um
				// HTML, já o REST ele gera um JASON

public class JogadorController {

	@Autowired
	private JogadorRepository repo;

	@RequestMapping(path = "/jogador", method = RequestMethod.GET)
	public List<Jogador> getJogador() {
		return repo.findAll();

	}

	// http://localhost:9081/contrato/estudo
	@RequestMapping(path = "/jogador/{id}", method = RequestMethod.GET)
	public Optional<Jogador> getJogador2(long id) {
		return repo.findById(id);
	}
	
	@RequestMapping(path = "/jogador/nome/{nome}", method = RequestMethod.GET)
	public Optional<Jogador> getJogador2(@PathVariable("nome")String nome) {
		var x = repo.findByNome(nome);
		return x;

	}

	@RequestMapping(path = "/jogador", method = RequestMethod.POST)
	public void salvar(@RequestBody Jogador jogador) {
		repo.save(jogador);

	}

	// http://localhost:9082/jogador/{id}
	// http://localhost:9082/jogador/1
	@RequestMapping(path = "/jogador/{id}", method = RequestMethod.DELETE)
	public void deletar(@PathVariable("id") long id) {
		System.out.println(id);
		repo.deleteById(id);

	}

	@RequestMapping(path = "/jogador/{codigo}", method = RequestMethod.PUT)
	public void editar(@PathVariable("codigo") int cod, @RequestBody Jogador Jogador) {
		System.out.println(Jogador.toString());

	}

}
