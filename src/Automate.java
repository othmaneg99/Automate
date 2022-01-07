
public class Automate {

	// tableau des transitions chaque etat avec tous les symboles de l'alphabet.
	static Integer transitions[][] = {
			{1,null,null}, // deouis l'etat 0 (attend un a)
			{null,2,null}, // depuis l'etat 1 (attend un b)
			{null,null,3}, // depuis l'etat 2 (attend un c)
			{4,2,null} ,// depuis l'etat 3 (attend un a ou un b)
			{null,null,null}
};
	static char alphabet[] = { 'a' , 'b' , 'c' };
	
	static int[] ETATS_FINAUX = {4};
	
	private String entree;
	
	private int pos = 0;
	
	public boolean automate(String entree) {
	
		
		this.entree = entree;
		
		Integer etat = 0;
		
		Character c = lectureSymbole();
		
		while(c != null)
		{
			int i = indiceSymbole(c);
			//si le symbole ne fait pas partie du langage retourner faux
			if (i == -1)
				return false;
			
			Integer e = transitions[etat][i];
			if(e == null) {
				
				return false;
				
			} else {
				etat = e;
				System.out.println(c);
				c = lectureSymbole();
			}
		
		
		//si etat fait partie des etats finaux retourner vrai
		
		for(int j = 0 ; j< ETATS_FINAUX.length; j++ ) { 
			
			if(etat == ETATS_FINAUX[j]) {
				return true;
			}	
		}

		}
		return false;
	}
		// si symbole de l'alphabtet retourne i son indice dans le tableau des alphabets sinon retourner -1
		private int indiceSymbole(Character c) {
			
			for(int i = 0 ; i < alphabet.length ;i++) {
				if(c == alphabet[i]) {
					return i;
				}	
			}
			return -1;
		}
		
		private Character lectureSymbole() {
			
			if(pos >= entree.length()) {
				return null;
			}
			Character c = this.entree.charAt(pos);
			pos++;
			return c;
		}	
	}
