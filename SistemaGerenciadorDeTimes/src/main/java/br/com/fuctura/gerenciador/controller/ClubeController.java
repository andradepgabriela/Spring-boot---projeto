package br.com.fuctura.gerenciador.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fuctura.gerenciador.entidades.Clube;
import br.com.fuctura.gerenciador.entidades.Jogador;
import br.com.fuctura.gerenciador.entidades.Time;

@RestController
public class ClubeController {
	
@RequestMapping(path="/clube", method= RequestMethod.GET)
public List<Clube> getClube() {
	var j1 = new Clube();
	j1.setNome("Messi");
	j1.setDtFundacao(null);
	j1.setSite("ukhdeuxh");
	j1.setNmPresidente("gjgg");
	//j1.
//	j1.setIdade(25);
	return List.of(j1);
}
@RequestMapping (path="/clube", method = RequestMethod.POST)
public void salvarClube (@RequestBody Clube clube){
	System.out.println(clube.toString());
}




@RequestMapping (path="/clube/{codigo}", method = RequestMethod.DELETE)
public void deletarClube (@PathVariable ("codigo") int cod){
	System.out.println(cod);
	
}

@RequestMapping(path="/clube/{codigo}", method= RequestMethod.GET)
public void getClubeId (@PathVariable ("codigo") int cod){
	
}


@RequestMapping (path="/Time/{codigo}", method = RequestMethod.PUT)
public void editar (@PathVariable ("codigo") int cod, @RequestBody Time Time){
	System.out.println(Time.toString());
	
}


}

