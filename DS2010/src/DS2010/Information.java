/**
 * 21 nov. 2012
 *DS2010	 
*/
package DS2010;

/**
 * @author Nora
 *
 */
public class Information {

	/**
	 * @param args
	 */
	
	protected Utilisateur emetteur;
	protected String message;
	protected long date;
	
	
	

	/**
	 * @param emetteur
	 * @param message
	 * @param date
	 */
	public Information(Utilisateur emetteur, String message, long date) {
		this.emetteur = emetteur;
		this.message = message;
		this.date = date;
	}
	
	
	// méthode toString
	

	@Override
	public String toString() {
		return "emetteur" + emetteur;
	}
	
	//méthode definirDate
	
	public void definirDate() {
		this.date = System.currentTimeMillis();
	}


}
