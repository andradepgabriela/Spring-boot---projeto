package br.com.fuctura.gerenciador.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fuctura.gerenciador.entidades.Tecnico;

@RestController
public class TecnicosController {
	
	@RequestMapping(path ="/Tecnico", method = RequestMethod.GET)
	public List <Tecnico> getTecnico () {
		var j1 = new Tecnico();
		j1.setNome("Messi");
		j1.setIdade(25);
		return List.of(j1);
		
	}
		// http://localhost:9081/contrato/estudo
			@RequestMapping(path ="/Tecnico/get", method = RequestMethod.GET)
		public Tecnico getTecnico2 () {
			var j1 = new Tecnico();
			j1.setNome("CR7");
			
			return j1;
			
		}
			@RequestMapping (path="/Tecnico", method = RequestMethod.POST)
			public void salvar (@RequestBody Tecnico Tecnico){
				System.out.println(Tecnico.toString());
				
			}
			//http://localhost:9082/Tecnico/{id}
			//http://localhost:9082/Tecnico/1
			@RequestMapping (path="/Tecnico/{codigo}", method = RequestMethod.DELETE)
			public void deletar (@PathVariable ("codigo") int cod){
				System.out.println(cod);
				
			}
			

}
