package br.com.fuctura.gerenciador.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fuctura.gerenciador.entidades.Contrato;

@RestController
public class ContratoController {
	
	@RequestMapping(path="/contrato", method= RequestMethod.GET)
	public List<Contrato> getContrato() {
		var j1 = new Contrato();
		return List.of(j1);
	}

	@RequestMapping (path="/Contrato", method = RequestMethod.POST)
	public void salvarContrato (@RequestBody Contrato Contrato){
		System.out.println(Contrato.toString());

	}

	@RequestMapping (path="/Contrato/{codigo}", method = RequestMethod.DELETE)
	public void deletarContrato (@PathVariable ("codigo") int cod){
		System.out.println(cod);
		
	}

	@RequestMapping(path="/Contrato/{codigo}", method= RequestMethod.GET)
	public void getContratoId (@PathVariable ("codigo") int cod){
		
	}


}
