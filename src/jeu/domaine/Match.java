package jeu.domaine;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Match {

		//Créations des collections Joueurs et Decks
		Collection<Joueur> joueurs = new ArrayList<Joueur>();
		Collection<Deck> decks = new ArrayList<Deck>();
		
		
		//Variable de la function Match
		int noMatch; 
		Date dateMatch;
		
		//function de la classe Match 
		public int getNoMatch() {
			return noMatch;
		}
		public void setNoMatch(int noMatch) {
			this.noMatch = noMatch;
		}
		public Date getDateMatch() {
			return dateMatch;
		}
			
		public void setDateMatch(String dateFinal) throws ParseException {
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			this.dateMatch = df.parse(dateFinal);
		}
		
		
		//function Decks
		public Collection<Deck> getDecks() {
			return decks;
		}
		public void setDecks(Collection<Deck> decks) {
			this.decks = decks;
			
		}
		public void addDeck(Deck deck) {
			decks.add(deck);
			deck.setMatch(this);
		}
		
		
		//Lien joueurs 
		//function Collection Joueurs
		public Collection<Joueur> getJoueurs(){
			return joueurs; 
		}
		public void setJoueurs(Collection<Joueur> joueurs) {
			this.joueurs = joueurs;
			
		}
		public void addJoueur(Joueur joueur) {
			joueurs.add(joueur);
			joueur.setMatch(this);
		}
		
		
		//affichage 
		@Override
		public String toString() {
			return "Le Match n* "+ noMatch + " commencera le " + dateMatch + " il opposera les joueurs suivants [joueur=" + joueurs + "]";
		}
		
		
		public String toString2() {
			return "Le Match n* "+ noMatch +" commencera le "+ dateMatch+ " contiendra les " + decks;
		}
	
	

}
