package karakterskala;
import static java.lang.Double.*;

import java.util.Scanner;
public class Karakterskala {
	
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			char kar;
			System.out.println("hvor mange resultater?:"); 
			Scanner deltakere = new Scanner(System.in);
			
			String antall = deltakere.next();
			double student = parseDouble(antall);
			
			for (int i = 0; i < student; i++) {
			
			Scanner poengTxt = new Scanner(System.in); 
			System.out.println("Beregning av karakter (0-100): "); 
			String tall1Txt = poengTxt.next(); 
			double poeng = parseDouble(tall1Txt);
			
			
			if (poeng < 0 || poeng > 100) {
				System.out.println("ugyldig input, skriv inn på nytt");
				i--;
				
			}
			else {
			  if (poeng >= 90) {
				kar = 'A';
			} else if (poeng >= 80) {
				kar = 'B';
			} else if (poeng >= 60) {
				kar = 'C';
			} else if (poeng >= 50) {
				kar = 'D';
			} else if (poeng >= 40) {
				kar = 'E';
			} else {
				kar = 'F';
			}

			System.out.println("Tilsvarer karakter: " + kar);
			}
			
			}
			System.out.println("Takk");
			
		}
}
