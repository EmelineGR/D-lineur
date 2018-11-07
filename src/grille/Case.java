package grille;

public class Case 
{
	private int valeur;
	private boolean mine;
	private boolean drapeau;
	private boolean decouverte;
	public Case(int val)
	{
		this.valeur = val;
	}
	public void setValeur(int val)
	{
		this.valeur = val;
	}
	public int getValeur()
	{
		return this.valeur ;
	}
	public void setMine(boolean mine)
	{
		this.mine = mine;
	}
	public boolean getMine()
	{
		return mine ;
	}
	public void setDrapeau(boolean drapeau)
	{
		this.drapeau = drapeau;
	}
	public boolean getDrapeau()
	{
		return drapeau ;
	}
	public void setDecouverte(boolean decouverte)
	{
		this.decouverte = decouverte;
	}
	public boolean getDecouverte()
	{
		return decouverte ;
	}
}
