package Org.Hela.serie1.Exo2;

public class Bissextile {
	int année ;
	
	//constructeur de la classe Bissextile
	Bissextile (int année){
		this.année = année ;
	}
	
	//methode qui retourne si une année est bissextile ou pas
	boolean bissextile (int année) {
		if(année % 4 == 0)
	    {
			/*si l'année est divisible par 4 et par 100*/
	        if( année % 100 == 0)
	        {
	            if ( année % 400 == 0) {
	            	return true ;
	            }
	            
	            else {
	            	return false ;
	            }
	        }
	        else {
	        	return true;
	        }
	    }
	    else {
	    	return false ;
	    }
	    
	}
}
