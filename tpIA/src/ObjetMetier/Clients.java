/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetMetier;

/**
 *
 * @author b
 */
public class Clients
{
	
	private int id = 0;

	
	private int version = 0;


	private String titre ="";

	
	private String nom = "";


	private String prenom = "";

        public Clients(){};
        
        
	public Clients(int id, int version, String titre, String nom, String prenom)
	{
		this.id = id;
		this.version = version;
		this.nom = nom;
		this.prenom = prenom;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion() {
		this.version = version;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
     *
     * @return
     */
    public String getPrenom() {
		return prenom;
	}

	/**
     *
     * @param prenom
     */
    public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	

}