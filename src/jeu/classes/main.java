package jeu.classes;

public class main {

	public static void main(String[] args) {
		

// deck carte
		Deck deck1 = new Deck();
		deck1.setNomDeck("premierDeck");
		
		Carte bleu = new Carte();
		bleu.setNomCarte("bleu");
		bleu.setPuissance(2);
		deck1.addCarte(bleu); 
		
		Carte rouge = new Carte();
		rouge.setNomCarte("rouge");
		rouge.setPuissance(4);
		deck1.addCarte(rouge); 
		
		
		System.out.println(deck1);

// joueur match
		
		Match match1 = new Match();
		match1.setNoMatch(1);
		//match1.setDateMatch('2018/11/12');
		
		Joueur guillaume = new Joueur();
		guillaume.setNoJoueur(1);
		guillaume.setPseudo("Guigz");
		guillaume.setNbVictoire(54);
		guillaume.setNbDefaite(256);
		guillaume.setNbNull(12);
		match1.addJoueur(guillaume);
		
		Joueur asmae = new Joueur();
		asmae.setNoJoueur(2);
		asmae.setPseudo("As");
		asmae.setNbVictoire(65);
		asmae.setNbDefaite(57);
		asmae.setNbNull(10);
		match1.addJoueur(asmae);
		
		System.out.println(match1);
		
	
	}
	

}
