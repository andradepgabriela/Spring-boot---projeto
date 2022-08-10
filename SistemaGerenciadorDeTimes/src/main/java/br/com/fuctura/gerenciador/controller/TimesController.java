package br.com.fuctura.gerenciador.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fuctura.gerenciador.entidades.Time;

@RestController
public class TimesController {
	
	@RequestMapping(path ="/Time", method = RequestMethod.GET)
	public List <Time> getTime () {
		var j1 = new Time();
	//	j1.setNome("Messi");
		//j1.setIdade(25);
		return List.of(j1);
		
	}
		// http://localhost:9081/contrato/estudo
			@RequestMapping(path ="/times/estudo", method = RequestMethod.GET)
		public Time getTime2 () {
			var j1 = new Time();
			j1.setCategoria("CR7");
			
			return j1;
			
		}
			@RequestMapping (path="/Time", method = RequestMethod.POST)
			public void salvar (@RequestBody Time Time){
				System.out.println(Time.toString());
				
			}
			//http://localhost:9082/Time/{id}
			//http://localhost:9082/Time/1
			@RequestMapping (path="/Time/{codigo}", method = RequestMethod.DELETE)
			public void deletar (@PathVariable ("codigo") int cod){
				System.out.println(cod);
				
			}

	
	
}
