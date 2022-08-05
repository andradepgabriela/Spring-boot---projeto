package br.com.fuctura.gerenciador.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fuctura.gerenciador.entidades.Jogador;

@RestController  //o Controlador recebe as requisições do cliente - o Controller devolve um HTML, já o REST ele gera um JASON

public class JogadorController {

	@RequestMapping(path ="/jogador", method = RequestMethod.GET)
	public List <Jogador> getJogador () {
		var j1 = new Jogador();
		j1.setNome("Messi");
		j1.setPeso(90.0);
		
		return List.of(j1);
		
	}
		// http://localhost:9081/contrato/estudo
			@RequestMapping(path ="/contrato/estudo", method = RequestMethod.GET)
		public Jogador getJogador2 () {
			var j1 = new Jogador();
			j1.setNome("CR7");
			j1.setPeso(87.0);
			
			return j1;
			
		}
			@RequestMapping (path="/jogador", method = RequestMethod.POST)
			public void salvar (@RequestBody Jogador Jogador){
				System.out.println(Jogador.toString());
				
			}
			//http://localhost:9082/jogador/{id}
			//http://localhost:9082/jogador/1
			@RequestMapping (path="/jogador/{codigo}", method = RequestMethod.DELETE)
			public void deletar (@PathVariable ("codigo") int cod){
				System.out.println(cod);
				
			}
			
			
}
