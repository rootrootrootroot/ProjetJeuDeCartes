package jeu.application;


import java.text.ParseException;

import jeu.domaine.Joueur;
import jeu.domaine.Match;

public class DemandeMatchIMPL implements DemandeMatch {

	@Override
	public Match creerMatch(int noMatch, String dateMatch) throws ParseException {
		Match match = new Match();
		match.setNoMatch(noMatch);
		match.setDateMatch(dateMatch);
		return match;
	}

	@Override
	public Match findMatch(int noMatch) {
		
		return null;
	}
	
	public Joueur findJoueur(String nomJoueur) {
		// TODO Auto-generated method stub
		Joueur joueur = new Joueur(); 
		return joueur;
		
	}


	@Override
	public void addJoueur(Joueur joueur1, Joueur joueur2, Match match) {
		match.addJoueur1(joueur1);
		match.addJoueur2(joueur2);
	}


	
}

