package Org.Hela.Serie2.Exo6;

public class Exo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User [] users = new User[5];
		users[0]= new User ("Tom","Jedusor",1000);
		users[1]= new User ("Hermione","Granger",4000);
		users[2]= new User ("Ronald","Weasley",5000);
		users[3]= new User ("Harry","Potter",6000);
		users[4]= new User ("Albus","Dumbledore",8000);
		
		UserUtil u1 = new UserUtil ();
		int percent = 50;
		
		System.out.println("les salaires actuels sont : ");
		for (int i=0 ; i<users.length ; i++) {
			System.out.print(users[i].getSalaire() + " ");
		}
		System.out.println();
		
		u1.raise(users,percent); /*augmentation des salaires de 50% */
		 
		System.out.println("les nouveaux salaires après augmentation de " + percent + "%");
		for (int i=0 ; i<users.length ; i++) {
			System.out.print(users[i].getSalaire() + " ");
		}
		System.out.println();
		
		int salaire_max = u1.getMaxSalary(users);
		System.out.println("le salaire de l’utilisateur le mieux payés est : " + salaire_max);
		
		int salaire_moyen = u1.getAverageSalary(users);
		System.out.println("la moyenne des salaires est : " + salaire_moyen);
		
		int salaire_median = u1.getMedianSalary(users);
		System.out.println("le salaire médian est : " +salaire_median);
		
	}

	
}
