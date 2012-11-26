/**
 * 21 nov. 2012
 *DS2010	 
*/
package DS2010;

import java.util.*;

/**
 * @author Nora
 *
 */
public class Utilisateur {

	/**
	 * @param args
	 */
	
	protected String nom;
	protected String adresseMail;
	protected ArrayList<Information> facade;
	protected List<Utilisateur> listeAmis;
	protected List<Utilisateur> listeUtilisateurs;
	
	
	public Utilisateur(String nom, String adresseMail, ArrayList<Information> facade, List<Utilisateur> listeUtilisateurs){
		
		this.nom = nom;
		this.adresseMail = adresseMail;
		this.facade = facade;
		this.listeAmis = listeAmis;
		this.listeUtilisateurs = listeUtilisateurs;
	}
	
	
	//*getter*/
	
	public String getNom() {
		return nom;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public ArrayList<Information> getFacade() {
		return facade;
	}
	
	public List<Utilisateur> getListeAmis(){
		return listeAmis;
	}


	public List<Utilisateur> getListeUtilisateurs() {
		return listeUtilisateurs;
	}


	/*ajouter information*/
	
	protected Information addInformation (Information infoAjoutee){
		
		this.facade.add(infoAjoutee);
		
		return infoAjoutee;
	}
	
	protected Commentaire addCommentaire(Commentaire comAjoute){
		
		this.facade.add(comAjoute);
		
		return comAjoute;
	}
	
	protected void getFriend(Utilisateur user){
		
		this.getListeAmis().add(user);
	}
	
	protected boolean isFriend(Utilisateur user){
		
		if (this.getListeAmis().contains(user)){
			return true;
		}
		else
			return false;
	}
	
	
	protected void afficheFacade(Utilisateur user){
		
		throws UtilisateurAmiException{
			if (this.isFriend(user)==false){
				throw new UtilisateurAmiException();
			}
			else{
				if (this.facade.size()<5){
					for (int i=this.facade.size(); i>0; i--){
						System.out.println(this.facade.get(i).toString());
					}
				}
				else{
					for (int i = 4; i>0; i--){
						System.out.println(this.facade.get(i).toString());
					}
				}
			}
				
		}
	}
	
	protected void afficheAmisMessage(Utilisateur user){
		
		for (int i=user.listeAmis.size(); i>0; i++){

			System.out.println("L'ami : " + user.listeAmis.get(i) + "a declare : "+ listeAmis.get(i).facade.get(facade.size()));
		}
	}
	
	protected void addUtilisateur(Utilisateur utilisateurAjoute){
		
		throws UtilisateurNomException
		{
			if ((this.listeUtilisateurs.contains(utilisateurAjoute.getNom())) || (this.listeUtilisateurs.contains(utilisateurAjoute.getAdresseMail())))
				throw new UtilisateurNomException();
			
			else{
				listeUtilisateurs.add(utilisateurAjoute);
			}
		}
	}
	


}
