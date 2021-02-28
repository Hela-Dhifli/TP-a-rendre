package Org.Hela.Serie2.Exo5;

public class User {
	
	private String nom;
	private String prenom;
	private int salaire;
	
	/*Question 1 : constructeur de la classe User*/
	public User (String nom, String prenom, int salaire) {
		this.nom =nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}
	
	/*Question 2 : deuxieme constructeur de la classe User : surcharge */
	public User (String nom, int salaire) {
		this (nom," ", salaire); /*instruction qui appelle le deuxième constructeur de la classe,
									elle doit etre à la premiére ligne*/
	}
	
	/*Question 3*/
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public int getSalaire() {
		return salaire;
	}
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	
	/*Question 4*/
	public void raise(int raise) {
		this.salaire = this.salaire+raise;
	}

	
	/*Question 6*/
	@Override
	public String toString() {
		return "User : prenom = " + prenom + ", nom = " + nom + ", salaire = " + salaire + "";
	}

	/*Question 7 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + salaire;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (salaire != other.salaire)
			return false;
		return true;
	}
	

	
	
	
}
