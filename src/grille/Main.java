package grille;

public class Main 
{
	public static void afficherGrille(Case[][] grille)
	{
		for (int j = 0; j < grille.length; j++)
		{
			for (int i = 0; i < grille.length; i++)
			{
				System.out.print(grille[i][j].getValeur());
			}
			System.out.println();
		}		
	}
	public static void main(String[] args) 
	{
		Case[][] grille = new Case[5][5];
		for (int j = 0; j < grille.length; j++)
		{
			for (int i = 0; i < grille.length; i++)
		  	{
				grille[i][j] = new Case(0,0);
		  	}			
		}
		afficherGrille(grille);
		/*for (int j = 0; j < grille.length; j++)
		{
			for (int i = 0; i < grille.length; i++)
			{
				System.out.print(grille[i][j].getValeur());
			}
			System.out.println();
		}*/
		/* Debut du jeu*/
		
	}
}
