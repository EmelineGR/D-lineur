package grille;

public class Grille 
{
	private Case[][] grille;//tableau de Case
	private int taille;
	
	/**
	 * setTaille permet de définir la taille de la grille
	 * @param taille
	 */
	public void setTaille(int taille)
	{this.taille = taille;}
	
	/**
	 * getTaille permet de récupérer la taille de la grille
	 * @return
	 */
	public int getTaille()
	{return this.taille ;}
	
	/**
	 * Grille Constructeur de la grille
	 * Construit une grille de dimmenssion 
	 * @param taille
	 */
	public Grille(int taille)
	{
		setTaille(taille);
		grille = new Case[taille][taille];
	}
	
	/**
	 * remplirGrille parcours la grille en initialisant 
	 * la valeur des cases à 0
	 * et ne les affichant pas
	 */
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
	
	/**
	 * addValue permet d'ajouter 1 à la valeur d'une case
	 * @param x
	 * @param y
	 */
	public void addValue(int x,int y)
	{
		if( x >=0 && y >=0 && x < taille && y< taille)
		{grille[x][y].setValeur(grille[x][y].getValeur()+1);}
	}
	
	/**
	 * remplirMine parcours la grille
	 * puis place des mines aléatoirement
	 * et ajoute 1 à la valeur des case autour d'une mine
	 */
	public void remplirMine()
	{
		for (int j = 0; j < this.taille; j++)
		{
			for (int i = 0; i < this.taille; i++)
			{
				int n = (int)(Math.random() * 6);
				if(n==5)
				{
					grille[i][j].setMine(true);
					addValue(i-1,j-1);
					addValue(i,j-1);
					addValue(i-1,j);
					addValue(i+1,j-1);
					addValue(i-1,j+1);
					addValue(i+1,j);
					addValue(i,j+1);
					addValue(i+1,j+1);
				}
			}
		}				
	}
	
	/**
	 * afficherGrille 
	 * affiche les abscisses de la grille
	 * puis parcours la grille affin d'afficher les cases en respectant l'avancé du jeu
	 * affiche aussi les ordonnées à droite
	 */
	public void afficherGrille()
	{
		
		for (int k = 0; k < this.taille; k++)
		{
			System.out.print("|");
			System.out.print(k);
		}
		
		System.out.println("| X");
		
		for (int l = 0; l < this.taille; l++)
		{System.out.print(" _");}
		
		System.out.println("   Y");
		
		for (int j = 0; j < this.taille; j++)
		{
			System.out.print("|");
			for (int i = 0; i < this.taille; i++)
			{
				if(grille[i][j].getDecouverte())
				{
					if(grille[i][j].getMine())
					{System.out.print("#");}
					
					else 
					{System.out.print(grille[i][j].getValeur());}
				}
				
				else 
				{ 
					if(grille[i][j].getDrapeau())
					{System.out.print("P");}
					
					else 
					{System.out.print("?");}
				}
				
				System.out.print("|");
			}
			
			System.out.println("  " + j);
		}	
	}
	
	/**
	 * devoilerCase dévoile la case choisis par le joueur
	 * si la case choisis vaut 0 alors le programme dévoile les case autour
	 * @param x
	 * @param y
	 */
	public void devoilerCase(int x, int y)
	{
		if( x >=0 && y >=0 && x < taille && y< taille)
		{
			if (!grille[x][y].getDecouverte())
			{
				grille[x][y].setDecouverte(true);
				if (grille[x][y].getValeur() == 0)
				{
					devoilerCase(x-1,y-1);
					devoilerCase(x-1,y);
					devoilerCase(x,y-1);
					devoilerCase(x-1,y+1);
					devoilerCase(x+1,y-1);
					devoilerCase(x,y+1);
					devoilerCase(x+1,y);
					devoilerCase(x+1,y+1);
				}
			}
		}
	}
	
	/**
	 * mettreDrapeau 
	 * place un drapeau sur la case sélectionne
	 * si un drapeau est déjà présent sur cette case, le retire
	 * @param x
	 * @param y
	 */
	public void mettreDrapeau(int x, int y)
	{
		if( x >=0 && y >=0 && x < taille && y< taille)
		{
			if (grille[x][y].getDrapeau())
			{grille[x][y].setDrapeau(false);}
			
			else 
			{grille[x][y].setDrapeau(true);}
		}
	}
	
	/**
	 * presenceMine
	 * Indique la présence d'une mine sur la case séléctionnée
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean presenceMine(int x, int y)
	{return grille[x][y].getMine();}
	
	/**
	 * caseDev
	 * Indique si la case est découverte/affiché
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean caseDev(int x, int y)
	{return grille[x][y].getDecouverte();}
	
	/**
	 * verifierWin
	 * vérifie si le joueur à dévoiler toutes les case ne contenant pas de mine
	 * @return
	 */
	public boolean verifierWin()
	{
		for (int j = 0; j < this.taille; j++)
		{
			for (int i = 0; i < this.taille; i++)
			{
				if(!caseDev(j,i) && !presenceMine(j,i))
				{return false;}
			}
		}
		return true;
	}
}
