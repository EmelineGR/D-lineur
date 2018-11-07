package grille;
//import java.util.List;

public class Grille 
{
	private Case[][] grille;
	private int taille;
	
	public void setTaille(int taille)
	{
		this.taille = taille;
	}
	public int getTaille()
	{
		return this.taille ;
	}
	
	public Grille(int taille)
	{
		setTaille(taille);
		grille = new Case[taille][taille];
	}
	public void remplirGrille()
	{
		for (int j = 0; j < this.taille; j++)
		{
			for (int i = 0; i < this.taille; i++)
			{
				grille[i][j] = new Case(0);
				grille[i][j].setDecouverte(false);
			}
		}			
	}
	public void remplirMine()
	{
		//TO DO EMELINE
		grille[0][0].setMine(true);
		
	}
	public void calculerValeur()
	{
		//TO DO TRES LONG
		for (int j = 0; j < this.taille; j++)
		{
			for (int i = 0; i < this.taille; i++)
			{
					if(grille[i][j].getMine())
					{
						grille[i][j].setValeur(grille[i][j].getValeur() +1);
					}
			}
		}				
	}
	public void afficherGrille()
	{
		for (int j = 0; j < this.taille; j++)
		{
			System.out.print("|");
			for (int i = 0; i < this.taille; i++)
			{
				if(grille[i][j].getDecouverte())
				{
					System.out.print(grille[i][j].getValeur());
				}
				else { System.out.print("?");}
				
				System.out.print("|");
			}
			System.out.println();
		}		
	}
	public void devoilerCase(int x, int y)
	{
		if(x > taille || y > taille)
		{
			System.out.println("mauvaise coordonnée");
		}
		else { grille[x][y].setDecouverte(true);}
	}
	
	
}
