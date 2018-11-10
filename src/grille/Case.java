package grille;

public class Case 
{
	private int valeur;
	private boolean mine;
	private boolean drapeau;
	private boolean decouverte;
	
	/**
	 * Constructeur de la classe Case
	 * @param val
	 * Il attribut la valeur val à la case
	 */
	public Case(int val)
	{this.valeur = val;}
	
	/**
	 * setValeur permet de modifier la veleur de la case
	 * @param val
	 */
	public void setValeur(int val)
	{this.valeur = val;}
	
	/**
	 * getValeur Permet de récupérer la valeur de la case
	 * @return
	 */
	public int getValeur()
	{return this.valeur ;}
	
	/**
	 * setMine permet de mettre une mine sur la case
	 * @param mine
	 */
	public void setMine(boolean mine)
	{this.mine = mine;}
	
	/**
	 * getMine permet de savoir si la case contient une mine
	 * @return
	 */
	public boolean getMine()
	{return mine ;}
	
	/**
	 * setDrapeau permet de mettre un drapeau sur la case
	 * @param drapeau
	 */
	public void setDrapeau(boolean drapeau)
	{this.drapeau = drapeau;}
	
	/**
	 * getDrapeau permet de savoir s'il y a un drapeau sur la case
	 * @return
	 */
	public boolean getDrapeau()
	{return drapeau ;}
	
	/**
	 * setDecouverte permet d'afficher ce que contient la case
	 * @param decouverte
	 */
	public void setDecouverte(boolean decouverte)
	{this.decouverte = decouverte;}
	
	/**
	 * getDecouverte permet de savoir s'il on affiche le contenu de la case
	 * @return
	 */
	public boolean getDecouverte()
	{return decouverte ;}
}
