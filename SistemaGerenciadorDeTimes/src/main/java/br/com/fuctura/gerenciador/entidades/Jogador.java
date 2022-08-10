package br.com.fuctura.gerenciador.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

//@Data ja puxa getter e setter, preferir nao usar em entidade
@Getter
@Setter
//em entidades preferir usar Getter e Setter
@Entity
@Table(name = "tb_jogador")

public class Jogador {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; // o ID tem que ficar no inicio
	private String nome;
	private Double peso;

}
