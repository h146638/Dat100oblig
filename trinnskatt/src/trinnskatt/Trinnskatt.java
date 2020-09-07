package trinnskatt;
	import static java.lang.Double.*;

	import java.util.Scanner;
	
public class Trinnskatt {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in); 
			
			System.out.println("Beregning av trinnskatt\nBruttoinntekt: "); 
			String tall1Txt = input.next(); 
			input.close();
			double tall1 = parseDouble(tall1Txt);
			System.out.println("Registrert bruttoinntekt: " + tall1);
			
			
			if(tall1 < 164100) { 
			System.out.println("Ingen trinnskatt.");
			}
			
			else if(tall1 < 230950) {
			System.out.println(tall1*93/10000 + " i trinnskatt."); //Opprinnelig brukt "tall1 * 0.0093", men fikk avrundingsfeil.
			}
			else if(tall1 < 580650) {
			System.out.println(tall1*241/10000 + " i trinnskatt."); //Fikset avrundingsfeil på alle linjene
			}
			else if(tall1 < 934050) {
			System.out.println(tall1*1152/10000 + " i trinnskatt.");
			}
			else  {
			System.out.println(tall1*1452/10000 + " i trinnskatt.");
				}
			
			;
			
			
			
		}

	}
