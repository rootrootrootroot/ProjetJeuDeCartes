package jeu.domaine;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Joueur {
	
	//appel de la fonction match et Joueur
	@ManyToOne (cascade=CascadeType.ALL)
	Match match; 
	//@OneToMany
	//Deck deck;
	// création de la collection decks 
	@OneToMany(mappedBy="joueur")
	Collection<Deck> decks= new ArrayList<Deck>();
	//variable JOueur 
	@Id
	int noJoueur;
	String pseudo;
	int nbVictoire;
	int nbDefaite;
	int nbNull;
	
/*	
	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}
*/
	public void setDecks(Collection<Deck> decks) {
		this.decks = decks;
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
	
	//function decks
	
	public Collection<Deck> getDecks(){
		return decks;
	}
	public void addDeck(Deck deck) {

		decks.add(deck);
		deck.setJoueur(this);
	}
	public void removeDeck(Deck deck) {
		decks.remove(deck);
		deck.setJoueur(null);
	}
	

	
	//fonction Match
	public Match getMatch() {
		return match;
	}
	public void setMatch(Match match) {
		this.match = match;
	}
	public void demandeMatch() {
		
	}
	
	//Affichage 
	@Override
	public String toString() {
		return "Joueur n* " + noJoueur + " : " + pseudo;
		
	}
	
	public String toString2() {
		return "Le Joueur " + pseudo + " : " + decks ;
	}
	
	
}
