package jeu.application;

import jeu.application.*;
import jeu.domaine.*;
import java.util.*;


public class CreationDeckIMPL implements CreationDeck {
	
	//Entrer nom du joueur et nom du deck

	Collection<Deck> decks= new ArrayList<Deck>();
	@Override
	public  void  addDeck(String nomDeck, String nomJoueur) {
		Deck deck = new Deck();
		deck.setNomDeck(nomDeck);
		Joueur joueur = new Joueur();
		joueur.setPseudo(nomJoueur);
		deck.setJoueur(joueur);
		joueur.setDeck(deck);
		
	}

	@Override
	public boolean addCarte(String nomCarte, Deck deck) {
		// TODO Auto-generated method stub
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
	public Deck creerDeck(int noDeck, String nomDeck, int nbCarte ) {
		Deck deck = new Deck();
		deck.setNoDeck(noDeck);
		deck.setNomDeck(nomDeck);
		deck.setNbCarte(nbCarte);
		return deck;
	}
	
}
