package jeu.domaine;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Carte {

	//Classe Deck
	
	@ManyToOne (cascade=CascadeType.ALL)
	Deck deck; 
	
	
	//variable de la classe Carte 
	@Id
	int noCarte;
	String nomCarte;
	int puissance;
	
	//functions Cartes
	public String getNomCarte() {
		return nomCarte;
	}
	public void setNomCarte(String nomCarte) {
		this.nomCarte = nomCarte;
	}
	public int getPuissance() {
		return puissance;
	}
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	
	
	//Functions Decks
	public Deck getDeck() {
		return deck; 
	}
	public void setDeck(Deck deck) {
		this.deck = deck; 
	}
	
	public int getNoDeck() {
		return noCarte;
	}
	public void setNoDeck(int noDeck) {
		this.noCarte = noDeck;
	}
	
	
	//Affichage 
	@Override
	public String toString() {
		
		return  " Votre carte " + nomCarte +" a une puissance de " + puissance;
	}
	
}

