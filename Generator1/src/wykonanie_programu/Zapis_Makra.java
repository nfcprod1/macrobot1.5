package wykonanie_programu;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import stale.Kopiowanie_linkow;
import stale.Cykle;
import zmienne.Czynnosc;
public class Zapis_Makra {
	

	public static void main(String[] args) throws FileNotFoundException{
		 PrintWriter zapis = new PrintWriter("makro.txt");
		 
		
		  
		/*  int licznik = 0;

			  do{
				  zapis.println(Clap_Medium.clap);
				  licznik++;
			  }
			  while(licznik<10);
			  zapis.println("");  */
		  	 
		 zapis.println (Kopiowanie_linkow.kopia_link1);
		  zapis.println (Cykle.cykl100a);
		  zapis.println (Kopiowanie_linkow.kopia_link2);
		  zapis.println (Cykle.cykl100);
		  zapis.println (Kopiowanie_linkow.kopia_link3);
		  zapis.println (Cykle.cykl100);
		  zapis.println (Kopiowanie_linkow.kopia_link4);
		  zapis.println (Cykle.cykl100);
		  zapis.println (Kopiowanie_linkow.kopia_link5);
		  zapis.println (Cykle.cykl100);
		  zapis.println (Kopiowanie_linkow.kopia_link6);
		  zapis.println (Cykle.cykl100);
		  zapis.println (Kopiowanie_linkow.kopia_link7);
		  zapis.println (Cykle.cykl100);
		  zapis.println (Kopiowanie_linkow.kopia_link8);
		  zapis.println (Cykle.cykl100);
		  zapis.close();
	  }
	}
	


