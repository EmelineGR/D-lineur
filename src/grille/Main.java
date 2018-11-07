package grille;

public class Main 
{
	public static void main(String[] args)
	{
		Grille jeu = new Grille(5);
		jeu.remplirGrille();
		jeu.afficherGrille();
		jeu.devoilerCase(0, 0);
		jeu.remplirMine();
		jeu.calculerValeur();
		jeu.afficherGrille();
	}
	
}
