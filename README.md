# compteBancaire

Gestion d’un compte bancaire


1 La classe Compte

Partie 1:

Créer une classe Compte qui modélise un compte en banque. 
Dans cette classe on doit avoir au moins les deux informations suivantes : numéro du compte et le solde du compte.

Cette classe doit posséder au moins les méthodes :
- void deposer(int s) : pour déposer une somme sur le compte.
- void retirer(int s) : pour retirer une somme sur le compte.
- int getSolde() : qui retourne le solde du compte.
- String infos() : qui retourne une chaîne d'informations similaires à: "Compte numero: 121, Solde : 1500 € "

Partie 2:

Ecrire un programme pour tester la classe Compte. Ce programme doit effectuer successivement les opérations suivantes : déposer 500 €, afficher le solde, retirer 200 €, afficher un RIB (méthode infos()).

2 Le programme DAB (Distributeur Automatique de Billets)

L'objectif est de faire un programme qui simule un DAB, et permet de manipuler un compte en banque.

Les opérations possibles sont les suivantes :

1- Retrait
2- Dépôt
3- Solde
4- Quit
