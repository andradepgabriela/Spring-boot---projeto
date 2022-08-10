package br.com.fuctura.gerenciador.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fuctura.gerenciador.entidades.Partida;

@RestController
public class PartidaController {
	@RequestMapping(path="/Partida", method= RequestMethod.GET)
	public List<Partida> getPartida() {
		var j1 = new Partida();
		return List.of(j1);
	}

	@RequestMapping (path="/Partida", method = RequestMethod.POST)
	public void salvarPartida (@RequestBody Partida Partida){
		System.out.println(Partida.toString());

	}

	@RequestMapping (path="/Partida/{codigo}", method = RequestMethod.DELETE)
	public void deletarPartida (@PathVariable ("codigo") int cod){
		System.out.println(cod);
		
	}

	@RequestMapping(path="/Partida/{codigo}", method= RequestMethod.GET)
	public void getPartidaId (@PathVariable ("codigo") int cod){
		
	}


}
