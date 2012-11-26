/**
 * 21 nov. 2012
 *DS2010	 
*/
package DS2010;

/**
 * @author Nora
 *
 */
public class Commentaire extends Information {

	/**
	 * @param emetteur
	 * @param message
	 * @param date
	 */
	public Commentaire(Utilisateur emetteur, String message, long date) {
		super(emetteur, message, date);
		// TODO Stub du constructeur généré automatiquement
	}


	/**
	 * @param args
	 */
	
	private Information reference;
	
	
	public String toString(){
		
		return this.emetteur + " dit : " + this.message + " en reponse a : " + this.reference;
	}
}
