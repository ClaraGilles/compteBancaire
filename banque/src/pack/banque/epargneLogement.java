package pack.banque;

public class epargneLogement extends compte{
	
	int active = 1;
	public epargneLogement(String numCompte, int soldeCompte) {
		super(numCompte, soldeCompte);
		
	}
		
	public void deposer(int s) {
		
		if(active == 1) {
		if(getSoldeCompte() == 0) {
			if(s<2000) {
				System.out.println("Vous devez déposer au moins 2000€"); 		
			}
			else{
					super.deposer(s);						
					setSoldeCompte(	getSoldeCompte() +(int) ((s*5) / 100));
			}
		
		}
		else {
			super.deposer(s);						
			setSoldeCompte(	getSoldeCompte() + (int)((s*5)/100));
		}
		}
		else 
		{
			System.out.println("desactivé");
		}
		
	}
	
		public void retirer(int s){
			if(active==1) {
			if(getSoldeCompte() != s) {
				System.out.println("Vous devez retirer la totalité de la somme sur le compte"); 
			}
			else{
				super.retirer(s);
				System.out.println("Votre compte est désactivé");
				active = 0;
			}
			}
			else 
			{
				System.out.println("desactivé");

			}
		}
		
		public String infos(){
			return super.infos();
		}
		
		
	}

