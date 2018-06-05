package jeu.domaine;

import java.text.ParseException;

public class main {

	public static void Main(String[] args) {
		

		//  Deck
		Deck deck1 = new Deck();
		deck1.setNomDeck("premierDeck");
		Deck deck2 =new Deck();
		deck2.setNomDeck("Super pouvoir");
		
		// création des  Cartes (couleurs et puissances)
		Carte bleu = new Carte();
		bleu.setNomCarte("bleu");
		bleu.setPuissance(2);
		deck1.addCarte(bleu); 
		Carte rouge = new Carte();
		rouge.setNomCarte("rouge");
		rouge.setPuissance(4);
		deck1.addCarte(rouge); 
		Carte vert = new Carte();
		vert.setNomCarte("vert");
		vert.setPuissance(5);
		deck2.addCarte(vert); 
		Carte violet  = new Carte();
		violet.setNomCarte("violet");
		violet.setPuissance(6);
		deck2.addCarte(violet); 
		Carte blanc  = new Carte();
		blanc.setNomCarte("blanc");
		blanc.setPuissance(10);
		deck2.addCarte(blanc); 
		Carte noir  = new Carte();
		noir.setNomCarte("noir");
		noir.setPuissance(10);
		deck2.addCarte(noir); 
		
		

		// Creation du match
		//attribution d'un joueur 
		Match match1 = new Match();
		match1.setNoMatch(1);
		match1.addDeck(deck2);
		try {
			match1.setDateMatch("12/11/2018");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//création des joueurs:  Guillaume(Guigz) et Asmae (As)
		Joueur guillaume = new Joueur();
		guillaume.setNoJoueur(1);
		guillaume.setPseudo("Guigz");
		guillaume.setNbVictoire(54);
		guillaume.setNbDefaite(256);
		guillaume.setNbNull(12);
		guillaume.addDeck(deck1);
		match1.addJoueur(guillaume);
		Joueur asmae = new Joueur();
		asmae.setNoJoueur(2);
		asmae.setPseudo("As");
		asmae.setNbVictoire(65);
		asmae.setNbDefaite(57);
		asmae.setNbNull(10);
		asmae.addDeck(deck2);
		match1.addJoueur(asmae);
		
		
		//Affichage
		System.out.println(match1);
		System.out.println(guillaume.toString2());
		System.out.println(asmae.toString2());
		System.out.println(match1.toString2());
		System.out.println(deck1);
		
	
	}
	

}
