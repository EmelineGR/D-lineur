package grille;

public class Case 
{
	private int valeur;
	private int statut;
	public Case(int val,int img)
	{
		this.valeur = val;
		this.statut = img;
	}
	public void setValeur(int val)
	{
		this.valeur = val;
	}
	public int getValeur()
	{
		return this.valeur ;
	}
	public void setImage(int sta)
	{
		this.statut = sta;
	}
	public int getImage()
	{
		return this.statut ;
	}
}
