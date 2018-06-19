package jeu.application;

import java.text.ParseException;
import java.util.Date;

import jeu.domaine.Joueur;
import jeu.domaine.Match;

public interface DemandeMatch {;
	public Match findMatch(int noMatch);
	public Joueur findJoueur(String nomJoueur);
	Match creerMatch(int noMatch, String dateMatch) throws ParseException;
	void addJoueur(Joueur joueur1, Joueur joueur2, Match match);
}
