/**
 * 
 */
package jeu.application;

import jeu.domaine.Joueur;
import jeu.domaine.Deck;
import jeu.domaine.Carte;

public interface CreationDeck {
	
	public boolean addCarte(Carte nomCarte, Deck deck);
	public Joueur findJoueur(String nomJoueur);
	public Carte findCarte(String nomCarte);
	Deck creerDeck(int noDeck, String nomDeck, int nbCarte);
	Deck addDeck(String nomDeck, String nomJoueur);
	Deck findDeck(String nomDeck);
}
