/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetMetier;

/**
 *
 * @author b
 */
public class Creneaux
{
	
	private int id = 0;
	
	
	private int version = 0;
	
	
	private int hDeb = 0;
	
	
	private int mDeb = 0;
	
	
	private int hFin = 0;
	
	
	private int mFin = 0;
	
	
	private int id_medecin = 0;

	public Creneaux() {};
        
        
	public Creneaux(int id, int version, int hDeb, int mDeb, int hFin, int mFin, int id_medecin)
	{
		this.id = id;
		this.version = version;
		this.hDeb = hDeb;
		this.mDeb = mDeb;
		this.hFin = hFin;
		this.mFin = mFin;
		this.id_medecin = id_medecin;
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

	public void setVersion(int version) {
		this.version = version;
	}
	
	public int getHDeb() {
		return hDeb;
	}

	public void setHDeb(int hDeb) {
		this.hDeb = hDeb;
	}

	public int getMDeb() {
		return mDeb;
	}

	public void setMDeb(int mDeb) {
		this.mDeb = mDeb;
	}

	
	public int getHFin() {
		return hFin;
	}

	public void setHFin(int hFin) {
		this.hFin = hFin;
	}

	public int getMFin() {
		return mFin;
	}

	public void setMFin(int mFin) {
		this.mFin = mFin;
	}

	public int getIdMedecin() {
		return id_medecin;
	}
	public void setIdMedecin(int id_medecin) {
		this.id_medecin = id_medecin;
	}

}