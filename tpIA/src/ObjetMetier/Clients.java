package ObjetMetier;

/**
 * <b>Clients est une classe représentant un client.</b>
 * <p>
 * Il existe cinq attributs pour un objet Clients :
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
public class Clients
{
	/**
         * attributs privés de la classe Clients
         * 
         * @since 1.0
         */
	private int id = 0;

	
	private int version = 0;


	private String titre ="";

	
	private String nom = "";


	private String prenom = "";

        
        /**
         * Constructeur par défaut Clients
         * 
         * @since 1.0
         */
        public Clients(){};
        
        /**
         * Constructeur avec paramètre de la classe Clients
         * 
         * @param id 
         *          identifiant du client
         * @param version 
         *          version du client
         * @param titre 
         *          titre du client
         * @param nom 
         *          nom du client
         * @param prenom 
         *          prenom du client
         * 
         * 
         * @since 1.0
         */
	public Clients(int id, int version, String titre, String nom, String prenom)
	{
		this.id = id;
		this.version = version;
		this.nom = nom;
		this.prenom = prenom;
	}

         /**
         * Getter de l'identifiant du client
         * 
         * @return l'identifiant du client sous la forme d'un entier
         * 
         * @since 1.0
         */
	public int getId() {
		return id;
	}
        
        /**
         * Setter de l'identifiant du client
         * 
         * @param id 
         *          identifiant du client sous la forme d'un entier
         * 
         * @since 1.0
         */
	public void setId(int id) {
		this.id = id;
	}
        
        /**
         * Getter de la version du client
         * 
         * @return la version du client sous la forme d'un entier
         * 
         * @since 1.0
         */
	public int getVersion() {
		return version;
	}

        /**
         * Setter de la version du client
         * 
         * @param version
         *          version du client sous la forme d'une chaîne de caractères
         * 
         * @since 1.0
         */
	public void setVersion(int version) {
		this.version = version;
	}
        /**
         * Getter du titre du client
         * 
         * @return le titre du client sous la forme d'une chaîne de caractères
         * 
         * @since 1.0
         */
	public String getTitre() {
		return titre;
	}

        /**
         * Setter du titre du client
         * 
         * @param titre
         *          titre du client sous la forme d'une chaîne de caractères
         * 
         * @since 1.0
         */
	public void setTitre(String titre) {
		this.titre = titre;
	}

        /**
         * Getter du nom du client
         * 
         * @return le nom du client sous forme d'une chaîne de caractères
         * 
         * @since 1.0
         */
	public String getNom() {
		return nom;
	}

        /**
         * Setter du nom du client
         * 
         * @param nom
         *          nom du client sous la forme d'une chaîne de caractères
         * 
         * @since 1.0
         */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
        /**
         * Getter du prenom du client
         * 
         * @return le prenom du client sous la forme d'une chaîne de caractères
         * 
         * @since 1.0
         */
        public String getPrenom() {
		return prenom;
	}

         /**
         * Setter du prenom du client
         * 
         * @param prenom
         *          prenom du client sous la forme d'une chaîne de caractères
         * 
         * @since 1.0
         */
        public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	

}