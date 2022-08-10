package br.com.fuctura.gerenciador.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fuctura.gerenciador.entidades.Estadio;

@RestController
public class EstadioController {
	
	@RequestMapping(path="/Estadio", method= RequestMethod.GET)
	public List<Estadio> getEstadio() {
		var j1 = new Estadio();
		return List.of(j1);
	}

	@RequestMapping (path="/Estadio", method = RequestMethod.POST)
	public void salvarEstadio (@RequestBody Estadio Estadio){
		System.out.println(Estadio.toString());

	}

	@RequestMapping (path="/Estadio/{codigo}", method = RequestMethod.DELETE)
	public void deletarEstadio (@PathVariable ("codigo") int cod){
		System.out.println(cod);
		
	}

	@RequestMapping(path="/Estadio/{codigo}", method= RequestMethod.GET)
	public void getEstadioId (@PathVariable ("codigo") int cod){
		
	}



}
