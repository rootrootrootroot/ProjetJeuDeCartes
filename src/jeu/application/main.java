package jeu.application;

import jeu.domaine.*;
import java.util.*;
import java.text.ParseException;


public class main {
	
	public static void main(String[] args) {
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
						System.out.println("A bientot");
						finBl1=true;
					}
				}
			noDeck+=1;
			finBl=true;		
			}
		}
//_______________________________________________________________________________________________________________________________________________________________

}
