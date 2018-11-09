package grille;

public class Main 
{
	public static void main(String[] args)
	{
		Grille jeu = new Grille(10);
		jeu.remplirGrille();
		for (int j = 0; j < 10; j++)
		{
			for (int i = 0; i < 10; i++)
			{
				jeu.devoilerCase(i, j);
			}
		}
		
		jeu.remplirMine();
		jeu.afficherGrille();
	}
	
}
