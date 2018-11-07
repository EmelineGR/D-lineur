package grille;

public class Main 
{
	public static void main(String[] args)
	{
		Grille jeu = new Grille(10);
		jeu.remplirGrille();
		jeu.devoilerCase(0, 0);
		jeu.remplirMine();
		jeu.calculerValeur();
		jeu.afficherGrille();
	}
	
}
