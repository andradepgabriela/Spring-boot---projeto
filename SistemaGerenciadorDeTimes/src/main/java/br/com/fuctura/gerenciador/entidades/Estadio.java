package br.com.fuctura.gerenciador.entidades;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Estadio {
private String nome;
private String apelido;
private LocalDate dtConstrucao;
private LocalDate dtInauguracao;
private int capacidade;
	
}
