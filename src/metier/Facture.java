package metier;

import java.time.LocalDate;

public class Facture
{	  Client client;
	 int montantfacture;
	private LocalDate Date;
	boolean reglementfacture;
	
	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	public Facture(String client, int montantfacture, LocalDate datefacture, boolean reglementfacture )
	{
		
		this.montantfacture = montantfacture;
		this.Date = datefacture;
		this.reglementfacture = reglementfacture;
	}
	
	
	public Client getClient()
	{
	
		return client;
	}

	/**
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */
	
	public int getMontant()
	{
		return montant;
	}

	/**
	 * Retourne vrai si la facture est reglée.
	 * @return vrai ssi la facture est reglée.
	 */
	
	public boolean estReglee()
		{
			if (getMontant() == 0)
			{
				return true;
			}
				else 
				
			{
				return false; 
			}
	}

	/**
	 * Retourne la date de la facture.
	 * @return la date de la facture.
	 */
	
	public LocalDate getDate()
	{
		return Date;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{
	
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{ 		
		return null; 
	}
}