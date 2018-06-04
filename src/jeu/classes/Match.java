package jeu.classes;

import java.util.*;
public class Match {

	
		Collection<Joueur> joueurs = new ArrayList<Joueur>();
		
		int noMatch; 
		Date dateMatch;
		
		public int getNoMatch() {
			return noMatch;
		}
		public void setNoMatch(int noMatch) {
			this.noMatch = noMatch;
		}

		
		
		
		
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
		public Date getDateMatch() {
			return dateMatch;
		}
		
		public void setDateMatch(Date dateFinal) {
			this.dateMatch = dateFinal;
		}
		
		@Override
		public String toString() {
			return "Le Match n*"+ noMatch + " commencera le " + dateMatch + " il opposera les joueurs suivants [joueur=" + joueurs + "]";
		}
		
		
		
	
	

}
