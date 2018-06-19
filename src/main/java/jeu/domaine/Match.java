package jeu.domaine;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Match {

		//Créations des collections Joueurs et Decks
		@OneToMany(mappedBy="match")
		Collection<Joueur> joueurs = new ArrayList<Joueur>();
		
		
		
		//Variable de la function Match
		@Id
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
		
		

		
		
		//Lien joueurs 
		//function Collection Joueurs
		public Collection<Joueur> getJoueurs(){
			return joueurs; 
		}
		public void setJoueurs(Collection<Joueur> joueurs) {
			this.joueurs = joueurs;
			
		}
		public void addJoueur1(Joueur joueur) {
			joueurs.add(joueur);
			joueur.setMatch(this);
		}
		public void addJoueur2(Joueur joueur) {
			joueurs.add(joueur);
			joueur.setMatch(this);
		}
		
		
		//affichage 
		@Override
		public String toString() {
			return "Le Match n* "+ noMatch + " commencera le " + dateMatch + " il opposera les joueurs suivants [joueur=" + joueurs + "]";
		}
		
		

	

}
