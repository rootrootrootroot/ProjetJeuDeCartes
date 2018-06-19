package jeu.application;


import java.text.ParseException;

import jeu.domaine.DeckRepository;
import jeu.domaine.Joueur;
import jeu.domaine.JoueurRepository;
import jeu.domaine.Match;
import jeu.domaine.MatchRepository;

public class DemandeMatchIMPL implements DemandeMatch {
	JoueurRepository joueurRepository;
	
	public DemandeMatchIMPL(JoueurRepository joueurRepository) {
		super();
		this.joueurRepository = joueurRepository;
	}

	MatchRepository matchRepository;
	
	public DemandeMatchIMPL(MatchRepository matchRepository) {
		super();
		this.matchRepository = matchRepository;
	}


	
	
	@Override
	public Match creerMatch(int noMatch, String dateMatch) throws ParseException {
		Match match = new Match();
		match.setNoMatch(noMatch);
		match.setDateMatch(dateMatch);
		matchRepository.save(match);
		return match;
	}

	@Override
	public Match findMatch(int noMatch) {
		
		return null;
	}
	
	public Joueur findJoueur(String nomJoueur) {
		// TODO Auto-generated method stub
		Joueur joueur = new Joueur(); 
		joueurRepository.save(joueur);
		return joueur;
		
	}


	@Override
	public void addJoueur(Joueur joueur1, Joueur joueur2, Match match) {
		match.addJoueur1(joueur1);
		match.addJoueur2(joueur2);
		matchRepository.save(match);	
		}


	
}

