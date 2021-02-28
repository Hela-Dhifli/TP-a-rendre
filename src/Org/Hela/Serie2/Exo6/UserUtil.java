package Org.Hela.Serie2.Exo6;

public class UserUtil  {

	
	public void raise(User[] users, int percentage) {
		for (int i=0;i<users.length;i++) {
			int a = users[i].getSalaire();
			users[i].setSalaire((a*percentage)/100+a);
		}
	}
	
	 public int getMaxSalary(User[] users) {
		 int a = users[0].getSalaire();
		 for (int i=0;i<users.length;i++){
			 if (a < users[i].getSalaire())
				 a = users[i].getSalaire();
		 }
		 return a;
	 }
	 
	 public int getAverageSalary(User[] users) {
		 int somme = 0;
		 for (int i=0;i<users.length;i++){
			 somme += users[i].getSalaire();
		 }
		 return (somme/(users.length));
	 }
	 
	 /*cette méthode s'applique à un tableau déjà trié*/
	 public int getMedianSalary(User[] users) {
		 int taille = users.length;
		 
		 int	indice = (int)(taille/2);
		 
		 return (users[indice].getSalaire());
	 }
}
