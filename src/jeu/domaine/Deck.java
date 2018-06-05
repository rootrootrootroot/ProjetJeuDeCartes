package jeu.domaine;

import java.util.ArrayList;
import java.util.Collection; 

public class Deck {
	//Classe Joueur et Match
	Joueur joueur;
	Match match; 
	
	int noDeck; 
	String nomDeck; 
	int nbCarte;

	//création de la collection 
	Collection<Carte> cartes = new ArrayList<Carte>();
	
	
	
	//function de la classe Deck 
	
	public int getNoDeck() {
		return noDeck;
	}
	public void setNoDeck(int noDeck) {
		this.noDeck = 1;
	}
	public String getNomDeck() {
		return nomDeck;
	}
	public void setNomDeck(String nomDeck) {
		this.nomDeck = nomDeck;
		
	}
	

	//functions carte
	public Collection<Carte> getCartes() {
		return cartes;
	}
	public void setCartes(Collection<Carte> carte) {
		this.cartes = carte;
	}
	public int getNbCarte() {
		return nbCarte;
	}
	public void setNbCarte(int nbDeck) {
		this.nbCarte = nbDeck;
	}
	public void addCarte(Carte carte) {
		int nb = this.getNbCarte();
		int nb1 = nb +1;
		cartes.add(carte);
		carte.setDeck(this);
		this.setNbCarte(nb1);
	}
	
	
	//function Joueur 
	
	public Joueur getJoueur() {
		return joueur;
	}
	public void setJoueur(Joueur joueur) {
		this.joueur= joueur;
	}
	public String getPseudo() {
		return joueur.pseudo;
	}
	public void setPseudo(String pseudo) {
		this.joueur.pseudo = pseudo;
	}

	
	
	//function match
	public Match getMatch() {
		return match;
	}
	public void setMatch(Match match) {
		this.match = match;
	}
	
	
	
	//Affichage

	@Override
	public String toString() {
		return "Votre "+ nomDeck + " contient " + nbCarte + " carte(s) [carte=" + cartes + "]";
	}


	public String toString2() {
		return nomDeck ;
	}

	
}


