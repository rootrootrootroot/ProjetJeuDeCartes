package jeu.domaine;

import org.springframework.data.repository.CrudRepository;

public interface CartesRepository extends CrudRepository<Carte, Integer> {

	public Carte findByNomCarte(String nom);
	
}
