package jeu.application;

//import jeu.application.*;
import jeu.domaine.*;
import java.util.*;


public class CreationDeckIMPL implements CreationDeck {
	

	@Override
	public  Deck addDeck(String nomDeck, String nomJoueur) {
		Deck deck = new Deck();
		deck.setNomDeck(nomDeck);
		Joueur joueur = new Joueur();
		joueur.setPseudo(nomJoueur);
		deck.setJoueur(joueur);
		joueur.setDeck(deck);
		
		return deck;
	}
	

	@Override 
	public Deck creerDeck(int noDeck, String nomDeck, int nbCarte ) {
		Deck deck = new Deck();
		deck.setNoDeck(noDeck);
		deck.setNomDeck(nomDeck);
		deck.setNbCarte(nbCarte);
		return deck;
	}

	@Override
	public boolean addCarte(Carte carte, Deck deck) {
		deck.addCarte(carte);
		return false;
	}

	@Override
	public Joueur findJoueur(String nomJoueur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Carte findCarte(String nomCarte) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Deck findDeck(String nomDeck) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
