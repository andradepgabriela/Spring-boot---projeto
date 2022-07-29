package br.com.fuctura.aula2.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier ("FGTS")
public class CalculadoraFGTS implements Calculadora {
	
	//construtor
	public CalculadoraFGTS () {
		System.out.println("Construindo CalculadoraFGTS");
	}
	
	public Double calcular(Double salario) {
		return salario + 10.00;
	}
}
