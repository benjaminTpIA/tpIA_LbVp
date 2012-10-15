/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetMetier;

import java.util.Date;

/**
 *
 * @author b
 */
public class RendezVous
{

	private int id = 0;
	
	
	private Date jour;
	

	private int id_client = 0;
	
	
	private int id_creneau = 0;


        public RendezVous(){};
        
        
	public RendezVous(int id, Date jour, int id_client, int id_creneau)
	{
		this.id = id;
		this.jour = jour;
		this.id_client = id_client;
		this.id_creneau = id_creneau;
	}

	
	
	public int getId() {
		return id;	
	}
	public void setId(int id) {
		this.id = id;	
	}

	public Date getJour() {
		return jour;
	}
	public void setJour(Date jour) {
		this.jour = jour;
	}
	public int getIdClient() {
		return id_client;
	}

	public void setIdClient(int id_client) {
		this.id_client = id_client;
	}

	public int getIdCreneau() {
		return id_creneau;
	}
	public void setIdCreneau(int id_creneau) {
		this.id_creneau = id_creneau;
	}

	
}