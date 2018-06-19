package jeu.domaine;

import org.springframework.data.repository.CrudRepository;

public interface JoueurRepository extends CrudRepository<Joueur, Integer> {

	public Carte findByPseudo(String nom);
	
}
