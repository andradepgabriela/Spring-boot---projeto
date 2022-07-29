package br.com.fuctura.aula2.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GeradorResumoGeral {
	@Autowired
	@Qualifier ("INSS")
	//  @Primary (usa essa quando quer dar prioridade)poe o primary na classe q quer priorizar tb
	private Calculadora gts;
	
public void exibirResumo (Double Salario) {
	System.out.println(gts.calcular(Salario));
	
}
}
