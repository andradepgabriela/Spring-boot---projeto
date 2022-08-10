package br.com.fuctura.gerenciador.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fuctura.gerenciador.entidades.Gol;

@RestController
public class GolController {
	@RequestMapping(path="/Gol", method= RequestMethod.GET)
	public List<Gol> getGol() {
		var j1 = new Gol();
		return List.of(j1);
	}

	@RequestMapping (path="/Gol", method = RequestMethod.POST)
	public void salvarGol (@RequestBody Gol Gol){
		System.out.println(Gol.toString());

	}

	@RequestMapping (path="/Gol/{codigo}", method = RequestMethod.DELETE)
	public void deletarGol (@PathVariable ("codigo") int cod){
		System.out.println(cod);
		
	}

	@RequestMapping(path="/Gol/{codigo}", method= RequestMethod.GET)
	public void getGolId (@PathVariable ("codigo") int cod){
		
	}


}
