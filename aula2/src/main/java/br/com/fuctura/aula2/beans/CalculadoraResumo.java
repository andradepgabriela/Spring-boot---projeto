package br.com.fuctura.aula2.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculadoraResumo {

	@Autowired
	private CalculadoraFGTS fgts; // injetar do contexto no meu código
	@Autowired
	private CalculadoraINSS inss;

	public void exibirResumo(Double salario) {
		var resultado = fgts.calcular(salario);
		var rinss = inss.calcular(salario); // rinss = resultado inss (novo nome)

		System.out.println(resultado);
		System.out.println(rinss);
	}
}
