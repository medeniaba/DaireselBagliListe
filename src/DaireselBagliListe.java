

class DaireselEleman{
		
		int içerik ;
		DaireselEleman ileri , geri ;
		DaireselEleman(int icerik){
			
			this.içerik = içerik ; 
			ileri = null ; 
			geri = null ; 
			
		}
	
		
	}
public class DaireselBagliListe {
	
public class dairesel {
		
	DaireselEleman bas ; 
	DaireselEleman son ; 
	 public dairesel() {
		 
		 bas = null ; 
		 son = null ; 
		 
	 }
	
	

	void listeekle ( DaireselEleman yeni ) {
		if ( bas == null ){
		yeni.ileri = yeni ; 
		yeni.geri = yeni ; 
		}
		else {
		yeni.ileri = bas ; 
		yeni.geri=bas.geri ; 
		bas.geri.ileri = yeni ; 
		bas.geri = yeni ; 
		}}


		void listesil () {
		if ( bas.ileri  == bas ) {
		 bas = null ; 
		}
		else {
		bas.geri.ileri = bas.ileri ; 
		bas.ileri.geri = bas.geri ; 
		bas = bas.ileri ; }


	
		}}

public static void main (String[]args) {
	

	
}
}


