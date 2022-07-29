package br.com.fuctura.aula2.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier ("MULTA")

public class CalculadoraMulta implements Calculadora {
	//construtor
		public CalculadoraMulta() {
			System.out.println("Construindo CalculadoraMulta");
		}
		
		public Double calcular(Double salario) {
			return salario + 12.00;
		}
}
