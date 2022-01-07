import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AutomateNonDeterministe {
	
	
	//private static final String ETATS_FINAUX = null;

	static char alphabet[] = { 'a' , 'b' };
	
	static int[] ETATS_FINAUX = {1};
	
	static List<Transition> transitions = new ArrayList<Transition>();
	

	
	private String entree;
	
	private int pos = 0;
	
	public void initTransitions() {
		
		Transition transition1 = new Transition('0','0','a');
		transitions.add(transition1);
		Transition transition2 = new Transition('0','0','b');
		transitions.add(transition2);
		
		Transition transition3 = new Transition('0','1','a');
		transitions.add(transition3);
		
		Transition transition4 = new Transition('1','2','b');
		transitions.add(transition4);
		
	}
	
	public boolean estDeterministe() {
		System.out.println(transitions.size());
		for(int i=0;i<transitions.size();i++) {

			Transition transition1 = transitions.get(i);
			
				for(int j=0;j<transitions.size();j++) {
				
					Transition transition2 = transitions.get(j);
					// si on trouve 2 transitions avec le meme etat d'entree, le meme symble , et des etats de sorties differents on retourn false
					if(transition1.getEtatEntree() == transition2.getEtatEntree() & transition1.getSymbole() == transition2.getSymbole() 
						& transition1.getEtatSortie() != transition2.getEtatSortie()
					) {

						System.out.println("non deterministe");
						return false;
					
					}	
		}
	}
	
		return true;
	
	}
	
}
