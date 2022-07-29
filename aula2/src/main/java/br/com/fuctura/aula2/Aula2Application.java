package br.com.fuctura.aula2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.fuctura.aula2.beans.CalculadoraFGTS;
import br.com.fuctura.aula2.beans.CalculadoraResumo;
import br.com.fuctura.aula2.config.ServiceConfig;

@SpringBootApplication
public class Aula2Application {

	public static void main(String[] args) {
//		SpringApplication.run(Aula2Application.class, args);
	
	var contexto = new AnnotationConfigApplicationContext (ServiceConfig.class);

	//contexto.getBean(null);
	
	var fgts = contexto.getBean(CalculadoraFGTS.class);
//	System.out.println(fgts.calcular(1.90));
	
//	var NaoVai = contexto.getBean(NaoEhBean.class);        - Não tem anotação Bean, nem Component
	
	var resumo = contexto.getBean(CalculadoraResumo.class);
	var rinss = contexto.getBean(CalculadoraResumo.class);

	resumo.exibirResumo (2.3);

	}

}
