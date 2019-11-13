package pack.banque;

public class compte {
	private String numCompte;
	private int soldeCompte;
	public String getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	public int getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(int soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	
public compte(String numCompte, int soldeCompte) {
	this.numCompte = numCompte;
	this.soldeCompte = soldeCompte;	
}

//on dépose la somme s qui devra être entré par l'utilisateur et on l'ajoute au solde

public void deposer(int s) {
	this.soldeCompte = soldeCompte + s;
}

//on retire la somme s qui devra être entré par l'utilisateur et on l'ajoute au solde

public void retirer(int s) {
	this.soldeCompte = soldeCompte - s;

}



//retourne une chaine d'info

public String infos(){
	return "Compte numero:" + this.numCompte + ", Solde: " + this.soldeCompte;
}

}