package pack.banque;

public class courant extends compte{

	public courant(String numCompte, int soldeCompte) {
		//super fait appelle à la classe supérieur, donc la mère
		super(numCompte, soldeCompte);
		// TODO Auto-generated constructor stub	
	}
	
	public void retirer(int s){
		if((getSoldeCompte() - s) < 10) {
			System.out.println("Vous ne pouvez pas laisser moins de 10€ sur votre comtpe");
		}
		else {
			super.retirer(s);
		}
	}
	
}
