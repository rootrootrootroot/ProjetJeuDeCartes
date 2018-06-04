package jeu.classes;

import java.util.ArrayList;
import java.util.Collection;

public class Joueur {
	
	
	Match match  ; 
	int noJoueur;
	String pseudo;
	int nbVictoire;
	int nbDefaite;
	int nbNull;
	Joueur joueur;
	
	Collection<Deck> decks= new ArrayList<Deck>();
	
	public Collection<Deck> getDecks(){
		return decks;
	}
	
	public void addCarte(Deck deck) {

		decks.add(deck);
		deck.setJoueur(this);
	}
	
	public void removeDeck(Deck deck) {
		decks.remove(deck);
		deck.setJoueur(null);
	}
	
	
	public Joueur getJoueur() {
		return joueur;
	}
	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}
	public Match getMatch() {
		return match;
	}
	public void setMatch(Match match) {
		this.match = match;
	}
	
	
	public int getNoJoueur() {
		return noJoueur;
	}

	public void setNoJoueur(int noJoueur) {
		this.noJoueur = noJoueur;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public int getNbVictoire() {
		return nbVictoire;
	}

	public void setNbVictoire(int nbVictoire) {
		this.nbVictoire = nbVictoire;
	}

	public int getNbDefaite() {
		return nbDefaite;
	}

	public void setNbDefaite(int nbDefaite) {
		this.nbDefaite = nbDefaite;
	}

	public int getNbNull() {
		return nbNull;
	}

	public void setNbNull(int nbNull) {
		this.nbNull = nbNull;
	}
	
	public void seConnecter() {
		
	}
	
	public void seDeconnecter() {
		
	}
	
	public void creationDeck() {
		
	}
	
	public void demandeMatch() {
		
	}
	@Override
	/public String toString() {
		return "Joueur n* " + noJoueur + " : " + pseudo;
	}
	
	public String toString2() {
		return "Le Joueur " + pseudo + " : " + decks ;
	}
	
	
}
