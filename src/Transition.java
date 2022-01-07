
public class Transition {
	
private char etatEntree;
private char etatSortie;
private char symbole;

//getters et setters
public char getEtatEntree() {
	return etatEntree;
}
public void setEtatEntree(char etatEntree) {
	this.etatEntree = etatEntree;
}
public char getEtatSortie() {
	return etatSortie;
}
public void setEtatSortie(char etatSortie) {
	this.etatSortie = etatSortie;
}
public char getSymbole() {
	return symbole;
}
public void setSymbole(char symbole) {
	this.symbole = symbole;
}
//all args constructor
public Transition(char etatEntree, char etatSortie, char symbole) {
	super();
	this.etatEntree = etatEntree;
	this.etatSortie = etatSortie;
	this.symbole = symbole;
}

//no arg constrctor
public Transition() {
	super();
}



}
