package grille;

import java.util.Scanner;

public class Partie
{
	private Grille jeu;
	private boolean vie;
	private int difficulte;
	
	/**
	 * getDifficulte
	 * récupère la taille de la grille en fonstion de  la difficulte
	 * @return
	 */
	public int getDifficulte()
	{return difficulte;}
	
	/**
	 * setDifficulte
	 * définis la difficulte de la grille en fonstion de sa taille
	 * @param diff
	 */
	public void setDifficulte(int diff)
	{difficulte = diff;}
	
	/**
	 * getVie
	 * récupère la valeur de vie
	 * qui indique si le joueur à cliqué sur une mine
	 * @return
	 */
	public boolean getVie()
	{return vie;}
	
	/**
	 * setVie
	 * définis la valeur de vie
	 * @param etat
	 */
	public void setVie(boolean etat)
	{vie = etat;}
	
	/**
	 * Partie
	 * Constructeur 
	 * créer une grille en fonction de la difficulté
	 * la remplis de case
	 * rajoute des mines
	 * indique que le joueur est en vie
	 * @param diff
	 */
	public Partie(int diff)
	{
		setDifficulte(diff);
		jeu = new Grille(difficulte);
		jeu.remplirGrille();
		jeu.remplirMine();
		setVie(true);
	}
	
	/**
	 * tour
	 * demande au joueur de saisir les coordonnées
	 * puis de choisir une action
	 * effectue ensuite l'action sur la case 
	 * si celle-ci est possible
	 * @return
	 */
	public boolean tour()
	{
		int x,y,action;
		Scanner sc;

		do
		{	
			System.out.println("Saisissez X");
			sc = new Scanner(System.in);
			x = sc.nextInt();
			System.out.println("Saisissez Y");
			sc = new Scanner(System.in);
			y = sc.nextInt();	
		}
		while(!coordonneBonne(x,y));
		
		do
		{	
			System.out.println("Choisissez votre action :  ");
			System.out.println("1 = dévoiler la case");
			System.out.println("2 = mettre/enlever un drapeau");
			sc = new Scanner(System.in);
			action = sc.nextInt();
		}
		while(action != 1 && action != 2);
		
		if(action == 1)
		{
			jeu.devoilerCase(x, y);
			return !jeu.presenceMine(x, y);
		}
		else 
			{jeu.mettreDrapeau(x, y);}
		
		return true;
	}
	
	/**
	 * coordonneBonne
	 * vérifie que les coordonnées d'une case sont valide
	 * et que la case n'a pas déjà été dévoilé
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean coordonneBonne(int x, int y)
	{
		if ( x >=0 && y >=0 && x < difficulte && y< difficulte)
		{
			if (jeu.caseDev(x,y))
			{
				System.out.println("Case déja dévoilé, recommencez");
				return false;
			}
			else 
				{return true;}
		}
		else
		{ 
			System.out.println("Mauvaise coordonnées, recommencez");
			return false;
		}
	}
	
	/**
	 * lancerPartie
	 * affiche la grille 
	 * puis fais jouer le joueur tant que la partie n'est pas finis (gagné ou perdus)
	 */
	public void lancerPartie()
	{
		do
		{
			jeu.afficherGrille();
			vie = tour();	
		}
		while(vie && !jeu.verifierWin());
		
		jeu.afficherGrille();
		
		if(!vie)
		{
			System.out.println("Perdu");
		}
		else 
		{System.out.println("Gagné");}
	}
	
	
}
