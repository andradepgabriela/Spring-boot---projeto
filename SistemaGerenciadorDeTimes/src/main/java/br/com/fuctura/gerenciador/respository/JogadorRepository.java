package br.com.fuctura.gerenciador.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fuctura.gerenciador.entidades.Jogador;

// diferença entre CRUDRepository e JPARepository - JPA herda de outra interface, ele ordena
// ele herda do CRUD, se nao quer ordenaçao e paginaçao usa o CRUD
@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Long> {

	public Optional<Jogador> findByNome(String nome); // findBy+atrib q quer usar - ou findJogadorByNome
// findByNomeAndPeso (String nome, Double Peso);na ordem de cada variavel
	// List<Jogador> findJogadoresByNome

}
