package Org.Hela.serie1.Exo2;

public class Bissextile {
	int ann�e ;
	
	//constructeur de la classe Bissextile
	Bissextile (int ann�e){
		this.ann�e = ann�e ;
	}
	
	//methode qui retourne si une ann�e est bissextile ou pas
	boolean bissextile (int ann�e) {
		if(ann�e % 4 == 0)
	    {
			/*si l'ann�e est divisible par 4 et par 100*/
	        if( ann�e % 100 == 0)
	        {
	            if ( ann�e % 400 == 0) {
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
