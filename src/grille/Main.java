package grille;

public class Main 
{
	public static void main(String[] args) 
	{
		Case a = new Case(2,3);
		a.setValeur(6);
		System.out.println(a.getValeur());
		Case[] grille = new Case[5*5];
		for (int i = 0; i < grille.length; i++)
		   {
			grille[i] = new Case(1,1);
		   }
		System.out.println(grille[1].getValeur());
		System.out.println(grille[2].getValeur());
		System.out.println(grille[3].getValeur());
		
	}	
}
