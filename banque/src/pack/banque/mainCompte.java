package pack.banque;

import java.util.Scanner;

public class mainCompte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//compte du client 1
		
		compte c1 = new courant("00040M", 500);
		compte c2 =  new epargneLogement("00040MLogement", 0);
		compte c3 =  new compteLivretA("00040MLivretA", 0);
		
		int i = 0;
		int k =0;
		int j = 0;
		
		//entier entre 1 et 4 pour le choix dans le menu
		
		Scanner sc = new Scanner(System.in);

		//menu
			do {
				System.out.println("1. Effectuer un depot:");
				System.out.println("2. Effectuer un retrait:");
				System.out.println("3. Imprimer votre RIB:");
				System.out.println("4. Accédez à votre compte épargne logement:");
				System.out.println("5. Accédez à votre compte livret A:");
				System.out.println("6. Faire un virement:");
				System.out.println("7. Quitter:");
				
				i = sc.nextInt();
				
				if(i == 1) {
					System.out.println("Quel montant voulez-vous déposer?");
					c1.deposer(sc.nextInt());
					System.out.println("Votre solde est de : " + c1.getSoldeCompte());
				}
				else if(i == 2){
				
					System.out.println("Quel montant voulez-vous retirer?");
					c1.retirer(sc.nextInt());
					System.out.println("Votre solde est de : " + c1.getSoldeCompte());
				}
				else if(i == 3) {
					System.out.println(c1.infos());
				}
				else if (i ==4){
					do {
					System.out.println("1. Effectuer un depot:");
					System.out.println("2. Effectuer un retrait:");;
					System.out.println("3. Imprimer votre RIB:");
					System.out.println("4. Revenir au menu:");
					
					j = sc.nextInt();
					
						if(j == 1) {
							System.out.println("Quel montant voulez-vous déposer?");
							c2.deposer(sc.nextInt());
							System.out.println("Votre solde est de : " + c2.getSoldeCompte());
						}
						else if(j == 2){					
							System.out.println("Vous ne pouvez retirer que la totalité de la somme du compte");
							c2.retirer(sc.nextInt());
							System.out.println("Votre solde est de : " + c2.getSoldeCompte());
						}
						else if (j == 3){
							System.out.println(c2.infos());
						}
						
					}while ((j > 0) && (j < 4));
				}
				else if(i == 5) {
					do {
						System.out.println("1. Effectuer un depot:");
						System.out.println("2. Effectuer un retrait:");
						System.out.println("3. Imprimer votre RIB:");
						System.out.println("4. Revenir au menu:");
						
						k = sc.nextInt();
						
							if(k == 1) {
								System.out.println("Quel montant voulez-vous déposer?");
								c3.deposer(sc.nextInt());
								System.out.println("Votre solde est de : " + c3.getSoldeCompte());
							}
							else if(k == 2){					
								System.out.println("Vous devez laisser au moins 20 euros, sinon désactivé");
								c3.retirer(sc.nextInt());
								System.out.println("Votre solde est de : " + c3.getSoldeCompte());
							}
							else if (k == 3){
								System.out.println(c3.infos());
							}
							
						}while ((k > 0) && (k < 4));
				}
				else if(i == 6){
					
				}

				}while ((i > 0) && (i < 7));
				
			
			
		sc.close();

		}
		
	}

