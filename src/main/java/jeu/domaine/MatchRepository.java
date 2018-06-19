package jeu.domaine;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;

public interface MatchRepository extends CrudRepository<Match, Integer> {

	public Carte findByDateMatch(Date dateMatch);
	
}
