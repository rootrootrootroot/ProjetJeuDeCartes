package jeu.domaine;

public class Carte {

	//Classe Deck
	Deck deck; 
	
	
	//variable de la classe Carte 
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

