package ObjetMetier;

/**
 * <b>Medecins est une classe représentant un médecin.</b>
 * <p>
 * Il existe cinq attributs pour un objet Médecin :
 * <ul>
 * <li>id : identifiant du client</li>
 * <li>version : </li>
 * <li>titre : Monsieur ou Madame (Mademoiselle n'est plus autorisée)</li>
 * <li>nom : nom du client</li>
 * <li>prenom : prenom du client</li>
 * </ul>
 * </p>
 * <p>
 * 
 * @author Villechenon pierre, Lombard benjamin
 * @version 1.0
 * @since since 1.0
 */
public class Medecins
{
	
        /**
         * attributs privés de la classe Medecins
         * 
         * @since 1.0
         */
	private int id = 0;
	
	
	private int version = 0;
	

	private String titre ="";


	private String nom = "";

	
	private String prenom = "";

        /**
         * Constructeur par défaut Medecins
         * 
         * @since 1.0
         */
        public Medecins(){};
        
        /**
         * Constructeur avec paramètre de la classe Medecins
         * 
         * @param id 
         *          identifiant du medecin
         * @param version 
         *          version du medecin
         * @param titre 
         *          titre du medecin
         * @param nom 
         *          nom du medecin
         * @param prenom 
         *          prenom du medecin
         * 
         * 
         * @since 1.0
         */
	public Medecins(int id, int version, String titre, String nom, String prenom)
	{
		this.id = id;
		this.version = version;
		this.nom = nom;
		this.prenom = prenom;
	}
	
        /**
         * Getter de l'identifiant du medecin
         * 
         * @return l'identifiant du medecin sous la forme d'un entier
         * 
         * @since 1.0
         */
	public int getId() {
		return id;
	}

        /**
         * Setter de l'identifiant du medecin
         * 
         * @param id 
         *          identifiant du medecin sous la forme d'un entier
         * 
         * @since 1.0
         */
	public void setId(int id) {
		this.id = id;
	}

        /**
         * Getter de la version du medecin
         * 
         * @return la version du medecin sous la forme d'un entier
         * 
         * @since 1.0
         */
	public int getVersion() {
		return version;
	}

        /**
         * Getter du titre du medecin
         * 
         * @return le titre du medecin sous la forme d'une chaîne de caractères
         * 
         * @since 1.0
         */
	public void setVersion() {
		this.version = version;
	}

        /**
         * Setter du titre du medecin
         * 
         * @param titre
         *          titre du medecin sous la forme d'une chaîne de caractères
         * 
         * @since 1.0
         */
        public String getTitre() {
		return titre;
	}

        /**
         * Getter du nom du medecin
         * 
         * @return le nom du medecin sous forme d'une chaîne de caractères
         * 
         * @since 1.0
         */
	public void setTitre(String titre) {
		this.titre = titre;
	}
        
        /**
         * Setter du nom du mdecin
         * 
         * @param nom
         *          nom du medecin sous la forme d'une chaîne de caractères
         * 
         * @since 1.0
         */
	public String getNom() {
		return nom;
	}

         
	public void setNom(String nom) {
		this.nom = nom;
	}
	
        /**
         * Getter du prenom du medecin
         * 
         * @return le prenom du medecin sous la forme d'une chaîne de caractères
         * 
         * @since 1.0
         */
	public String getPrenom() {
		return prenom;
	}

        /**
         * Setter du prenom du medecin
         * 
         * @param prenom
         *          prenom du medecin sous la forme d'une chaîne de caractères
         * 
         * @since 1.0
         */
	public void setPrenom() {
		this.prenom = prenom;
	}

	
	

}

