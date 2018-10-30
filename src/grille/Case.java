package grille;

public class Case 
{
	private int valeur;
	private int image;
	public Case(int val,int img)
	{
		this.valeur = val;
		this.image = img;
	}
	public void setValeur(int val)
	{
		this.valeur = val;
	}
	public int getValeur()
	{
		return this.valeur ;
	}
	public void setImage(int img)
	{
		this.image = img;
	}
	public int getImage()
	{
		return this.image ;
	}
}
