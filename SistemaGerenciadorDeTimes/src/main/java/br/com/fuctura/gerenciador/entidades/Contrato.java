package br.com.fuctura.gerenciador.entidades;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Contrato {
private Double valor;
private LocalDate dtFim;
private LocalDate dtInicio;

}
