package Org.Hela.Serie2.Exo5;

public class Main {
	public static void main(String[] args) {
		
		User u1 = new User("Tom","Jedusor",1000);
		User u2 = new User("Hermione","Granger",4000);
		User u3 = new User("Harry","Potter",6000);
		
		System.out.println("u1 = "+u1);
		System.out.println("u2 = "+u2);
		System.out.println("u3 = "+u3);
		
		boolean b1 = u1.equals(u2);
		System.out.println("b1 (equals) = "+ b1);
		
		boolean b2 = u1.equals(u3);
		System.out.println("b2 (equals) = "+ b2);
		
		System.out.println("Hashcode de u1 = "+ u1.hashCode());
		System.out.println("Hashcode de u2 = "+ u2.hashCode());
		System.out.println("Hashcode de u3 = "+ u3.hashCode());
		
	}
}
