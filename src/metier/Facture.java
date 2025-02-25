package metier;

import java.time.LocalDate;

public class Facture
{	  Client client;
	 int montantfacture;
	private LocalDate datefacture;
	boolean reglementfacture;
	
	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	public Facture(String client, int montantfacture, LocalDate datefacture, boolean reglementfacture )
	{
		
		this.montantfacture = montantfacture;
		this.datefacture = datefacture;
		this.reglementfacture = reglementfacture;
	}
 public Facture (Client client, int montantfacture)
 {
	 this.client = client;
		this.montantfacture = montantfacture;
		
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
		return 0;
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
		return null;
		
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
