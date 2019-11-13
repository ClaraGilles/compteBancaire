package pack.banque;

public class compteLivretA extends compte{
	int active = 1;
	public compteLivretA(String numCompte, int soldeCompte) {
		super(numCompte, soldeCompte);
		
	}
		
		public void deposer(int s) {
	
					super.deposer(s);						
					setSoldeCompte(	getSoldeCompte() +(int) ((s*4) / 200));
			}
	
		public void retirer(int s){
			if(active==1) {
				super.retirer(s);
					if(getSoldeCompte() <20) {	
						active = 0;
						System.out.println("Votre compte est desactivé");
					}
			}
		}
					
		public String infos(){
			return super.infos();
		}
		
	
	
}
