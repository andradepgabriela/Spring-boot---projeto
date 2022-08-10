package br.com.fuctura.gerenciador.entidades;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Clube {
private String nome;
private String nmPresidente;
private LocalDate dtFundacao;
private String site;
@Override
public String toString() {
	return "Clube [nome=" + nome + ", nmPresidente=" + nmPresidente + ", dtFundacao=" + dtFundacao + ", site=" + site
			+ "]";
}



}
