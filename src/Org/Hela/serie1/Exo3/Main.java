package Org.Hela.serie1.Exo3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Palindrome phrase1 = new Palindrome ("elu par cette crapule");
		if(phrase1.palindrome(phrase1.mot)) {
			System.out.println(phrase1.mot +" EST PALINDROME" );
		}
		else
			System.out.println(phrase1.mot +" N'EST PAS PALINDROME " );
		
		
		Palindrome phrase2 = new Palindrome ("rions noir");
		if(phrase2.palindrome(phrase2.mot)) {
			System.out.println(phrase2.mot +" EST PALINDROME" );
		}
		else
			System.out.println(phrase2.mot +" N'EST PAS PALINDROME " );
		
		Palindrome phrase3 = new Palindrome ("Esope reste ici et se repose");
		if(phrase3.palindrome(phrase3.mot)) {
			System.out.println(phrase3.mot +" EST PALINDROME" );
		}
		else
			System.out.println(phrase3.mot +" N'EST PAS PALINDROME " );
		
		Palindrome phrase4 = new Palindrome ("Et la marine va venir a Malte");
		if(phrase4.palindrome(phrase4.mot)) {
			System.out.println(phrase4.mot +" EST PALINDROME" );
		}
		else
			System.out.println(phrase4.mot +" N'EST PAS PALINDROME " );
		
		Palindrome phrase5 = new Palindrome ("Severe, dissuasive, je vis aussi de reves");
		if(phrase5.palindrome(phrase5.mot)) {
			System.out.println(phrase5.mot +" EST PALINDROME" );
		}
		else
			System.out.println(phrase5.mot +" N'EST PAS PALINDROME " );
		
		Palindrome phrase6 = new Palindrome ("Elu par cette crapule");
		if(phrase6.palindrome(phrase6.mot)) {
			System.out.println(phrase6.mot +" EST PALINDROME" );
		}
		else
			System.out.println(phrase6.mot +" N'EST PAS PALINDROME " );
		

}
}
