package grille;

import java.util.Scanner;

public class Partie
{
	private Grille jeu;
	private boolean vie;
	private int difficulte;
	public int getDifficulte()
	{
		return difficulte;
	}
	public void setDifficulte(int diff)
	{
		difficulte = diff;
	}	
	public boolean getVie()
	{
		return vie;
	}
	public void setVie(boolean etat)
	{
		vie = etat;
	}	
	public Partie(int diff)
	{
		setDifficulte(diff);
		jeu = new Grille(difficulte);
		jeu.remplirGrille();
		jeu.remplirMine();
		setVie(true);
		
	}
	public boolean tour()
	{
		int x,y,action;
		Scanner sc;

		do
		{	
		System.out.println("Saisissez la colonne de votre case");
		sc = new Scanner(System.in);
		x = sc.nextInt();
		System.out.println("Saisissez la ligne de votre case");
		sc = new Scanner(System.in);
		y = sc.nextInt();	
		}while(!coordonneBonne(x,y));
		do
		{	
		System.out.println("Saisissez votre action :  1 = dévoiler la case   2 = mettre/enlever un drapeau");
		sc = new Scanner(System.in);
		action = sc.nextInt();
		}while(action != 1 && action != 2);
		if(action == 1)
		{
			jeu.devoilerCase(x, y);
			return !jeu.presenceMine(x, y);
		}
		else {jeu.mettreDrapeau(x, y);}
		
		return true;
		
		
	}
	
	public boolean coordonneBonne(int x, int y)
	{
		if ( x >=0 && y >=0 && x < difficulte && y< difficulte)
		{
			return !jeu.caseDev(x,y);
		}
		else { return false ;}
	}
	public void lancerPartie()
	{
		do
		{
			jeu.afficherGrille();
			vie = tour();
			
		}while(vie && !jeu.verifierWin());
		jeu.afficherGrille();
		if(!vie)
		{
			System.out.println("Perdu");
		}
		else { System.out.println("Gagné");}
	}
	
	
}
