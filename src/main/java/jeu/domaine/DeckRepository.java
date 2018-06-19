package jeu.domaine;

import org.springframework.data.repository.CrudRepository;

public interface DeckRepository extends CrudRepository<Deck, Integer> {

	public Carte findByNomDeck(String nom);
	
}