import java.util.ArrayList;
import java.util.List;

public class TestAutomate {
	
	public static void main(String[] args) {
		
		Automate a = new Automate();
		System.out.println(a.automate("abcd"));

AutomateNonDeterministe an = new AutomateNonDeterministe();
an.initTransitions();
System.out.println(an.estDeterministe());


		
	}
}
