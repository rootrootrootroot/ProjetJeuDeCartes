package jeu.classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date; 

public class Deck {
	
	int noDeck; 
	String nomDeck; 
	int nbCarte;
	Joueur joueur;
	
	Collection<Carte> cartes = new ArrayList<Carte>();
	
	public Collection<Carte> getCartes() {
		return cartes;
	}
	
	public void setCartes(Collection<Carte> carte) {
		this.cartes = carte;
	}
	
	
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

	
	

	@Override
	public String toString() {
		return "Votre "+ nomDeck + " contient " + nbCarte + " carte(s) [carte=" + cartes + "]";
	}
	
	
}


