package grille;

public class Main 
{
	public static void main(String[] args) 
	{
		Case a = new Case(2,3);
		a.setValeur(6);
		a.setImage(0);
		//System.out.println(a.getValeur());
		Case[][] grille = new Case[5][5];
		for (int j = 0; j < grille.length; j++)
		{
			for (int i = 0; i < grille.length; i++)
		  	{
				grille[i][j] = new Case(1,1);
		  	}			
		}
		/* TEST
		 * 
		 * 
		 * 
		 * 
		 * 
		 * TESt
		 */

		for (int j = 0; j < grille.length; j++)
		{
			for (int i = 0; i < grille.length; i++)
			{
				System.out.print(grille[i][j].getValeur());
			}
			System.out.println();
		}
		
	}	
}
