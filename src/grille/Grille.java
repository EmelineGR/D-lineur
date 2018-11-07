package grille;
import java.util.List;

public class Grille 
{
	private ArrayList<ArrayList<Case>> grille;
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
	}
	public void remplirGrille()
	{
		for (int j = 0; j < this.taille; j++)
		{
			for (int i = 0; i < this.taille; i++)
			{
				grille[i][j].setValeur(0);
			}
		}			
	}
	public void afficherGrille()
	{
		for (int j = 0; j < this.taille; j++)
		{
			for (int i = 0; i < this.taille; i++)
			{
				System.out.print(grille[i][j].getValeur());
			}
			System.out.println();
		}		
	}	
	
}
