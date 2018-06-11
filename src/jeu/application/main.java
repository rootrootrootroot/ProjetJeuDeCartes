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
	
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Voulez-vous creer un match ? oui(1)/non(2) ");
		int reponse = sc4.nextInt();
		if(reponse==1) {
			DemandeMatch demandeMatch = new DemandeMatchIMPL();
			Scanner sc5 = new Scanner(System.in);
			System.out.println("entrez le numero du match : "); // à incrémenter une fois la base de donnée créée
			int noMatch = sc5.nextInt();
			Scanner sc6 = new Scanner(System.in);
			System.out.println("Veuillez entrer la date du match dd/MM/yyyy ");// attention exception 
			String dateMatch = sc6.nextLine();
			Match match = demandeMatch.creerMatch(noMatch, dateMatch);
			
			System.out.println("le match a ete cree et commencera le : " + dateMatch );
			
			Scanner sc7 = new Scanner(System.in);
			System.out.println("Donnez le nom du premier joueur");
			String nom1 = sc7.nextLine();
			
			Scanner sc8 = new Scanner(System.in);
			System.out.println("Donnez le nom du deuxieme joueur");
			String nom2 = sc8.nextLine();
			
			Joueur joueur1 = demandeMatch.findJoueur(nom1);
			Joueur joueur2 = demandeMatch.findJoueur(nom2);
			demandeMatch.addJoueur(joueur1, joueur2, match);
			
			System.out.println("Le match opposera les joueurs suivant: " + nom1 + " ,"+nom2);
//__________________________________________________________________________________________________________________________________________________________			
			
			
		
			
		}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}
