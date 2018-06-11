package jeu.application;

import jeu.domaine.*;
import java.util.*;
import java.text.ParseException;


public class main {
	
	public static void main(String[] args) {
		try {
		boolean finBl=false;
		boolean finBl1=false;
		int noDeck=1;
		
// CREATE NOUVELLE UTILISATEUR DECK CARTES_______________________________________________________________________________________________________________________
		
		while(finBl==false) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez entrer votre pseudo :");
			String nomJoueur = sc.nextLine();
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Veuillez entrer le nom de votre deck :");
			String nomDeck = sc1.nextLine();
			
			CreationDeck creationDeck = new CreationDeckIMPL();
			Deck deck = creationDeck.addDeck(nomDeck, nomJoueur);
			System.out.println(nomJoueur + " : le deck " + nomDeck + " a été creé");
				while(finBl1==false){
					Scanner sc2 = new Scanner(System.in);
					System.out.println("Voulez-vous ajouter une carte ? o(1)/n(2)");
					int rep = sc2.nextInt();
					if(rep==1) {
						Scanner sc3 = new Scanner(System.in);
						System.out.println("Veuillez entrer le nom de la carte à ajouter à votre deck : "+nomDeck);
						String carte = sc3.nextLine();
						Carte ajout = new Carte();
						ajout.setNomCarte(carte);
						creationDeck.addCarte(ajout, deck);
					}
					else {
						System.out.println("C est note");
						finBl1=true;
					}
				}
			noDeck+=1;
			finBl=true;		
			}
		
//_______________________________________________________________________________________________________________________________________________________________
	
	
	
	// CREATE NOUVEAU MATCH_______________________________________________________________________________________________________________________
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Voulez-vous creer un match ? oui(1)/non(2) ");
		int reponse = sc.nextInt();
		if(reponse==1) {
			DemandeMatch demandeMatch = new DemandeMatchIMPL();
			Scanner sc4 = new Scanner(System.in);
			System.out.println("entrez le numero du match : "); // à incrémenter une fois la base de donnée créée
			int noMatch = sc4.nextInt();
			Scanner sc5 = new Scanner(System.in);
			System.out.println("Veuillez entrer la date du match dd/MM/yyyy ");// attention exception 
			String dateMatch = sc5.nextLine();
			Match match = demandeMatch.creerMatch(noMatch, dateMatch);
			
			System.out.println("le match a ete cree et commencera le : " + dateMatch );
			
			Scanner sc6 = new Scanner(System.in);
			System.out.println("Donnez le nom du premier joueur");
			Scanner nom1 = new Scanner(System.in);
			
			Scanner sc7 = new Scanner(System.in);
			System.out.println("Donnez le nom du deuxieme joueur");
			Scanner nom2 = new Scanner(System.in);
			Joueur joueur1 = demandeMatch.findJoueur("Asmae");
			Joueur joueur2 = demandeMatch.findJoueur("Guillaume");
			demandeMatch.addJoueur(joueur1, joueur2, match);
//_______________________________________________________________________________________________________________________________________________________________			
			
			
		
			
		}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}
