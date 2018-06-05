/**
 * 
 */
package jeu.application;

import jeu.domaine.Joueur;
import jeu.domaine.Deck;

public interface CreationDeck {
	
	public Deck addDeck(String nomDeck, Joueur joueur);
	public boolean addCarte(String nomCarte, Deck deck);
	public Joueur findJoueur(String nomJoueur);
	
}
