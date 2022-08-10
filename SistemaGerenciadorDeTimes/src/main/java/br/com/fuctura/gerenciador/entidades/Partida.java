package br.com.fuctura.gerenciador.entidades;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class Partida {
private Time mandante;
private Time visitante;
private LocalDate data;
private List<Gol> Placar;

}
