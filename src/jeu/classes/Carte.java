package jeu.classes;

public class Carte {

	Deck deck; 
	int noCarte;
	String nomCarte;
	int puissance;
	
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
	@Override
	public String toString() {
		
		return  " Votre carte " + nomCarte +" a une puissance de " + puissance;
	}
	
}

