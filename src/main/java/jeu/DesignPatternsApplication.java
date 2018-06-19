package jeu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import jeu.application.CreationDeck;
import jeu.application.CreationDeckIMPL;
import jeu.application.DemandeMatch;
import jeu.application.DemandeMatchIMPL;
import jeu.domaine.Carte;
import jeu.domaine.CartesRepository;
import jeu.domaine.Deck;
import jeu.domaine.DeckRepository;
import jeu.domaine.Joueur;
import jeu.domaine.JoueurRepository;
import jeu.domaine.Match;
import jeu.domaine.MatchRepository;

@SpringBootApplication
public class DesignPatternsApplication {
	
	@Autowired
	CartesRepository carteRepository;
	@Autowired
	DeckRepository deckRepository;
	@Autowired
	MatchRepository matchRepository;
	@Autowired
	JoueurRepository joueurRepository;

	private static final Logger log = LoggerFactory.getLogger(DesignPatternsApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo1(CartesRepository repository) {
		return (args) -> {
			
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
					
					
					CreationDeck creationDeck = new CreationDeckIMPL(carteRepository, deckRepository, joueurRepository);
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
					DemandeMatch demandeMatch = new DemandeMatchIMPL(matchRepository);
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
			
			/*Conduire c = new ConduireTaxi(voitureRepository, passagerRepository);
			c.addPassager("tintin");
			
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date miseEnCirculation = df.parse("30/05/2018");
			
			Voiture voiture = new Voiture(miseEnCirculation, "11AA22");
			
			Passager passager = new Passager("Tintin", 50);
			voiture.addPassager(passager);
			
			repository.save(voiture);
			
			repository.findById("11AA22")
			.ifPresent(voit -> {
				log.info("Voiture found with findById(11AA22):");
				log.info("--------------------------------");
				log.info(voit.toString());
				log.info("");
			});*/
		};
	}
	
	

}
