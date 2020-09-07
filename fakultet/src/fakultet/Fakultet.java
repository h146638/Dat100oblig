package fakultet;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
public class Fakultet {

	// Lag et program som leser inn et heltall n > 0, 
	// beregner verdien n! (n fakultet) og skriver verdien til n! der n! = 1*2*3*�*(n-1)*n.
	
	public static void main(String[] args) {
		
		boolean innput = false; // Variabel m� bli true for � stanse while-l�kken
		int n = 1;
		while (innput == false) 
		{
			
			String nTallTxt = showInputDialog("Beregner verdien n! (n fakultet)\n('n' st�rre enn 20 vil f�re til at det blir standardform!)\nVennligst angi n: ");
			try {
			n = parseInt(nTallTxt);
			}
			catch (Exception e) {
				showMessageDialog(null,"Program lukkes");
				innput = true;
			}
			int i = 1;
			long svar = 1L;
			long multiply = i;
			double multidb = i;
			double svardb = 1;
			
			if(n>20 && innput == false) //Med long-type f�r man overflow ved !21 og oppover, alts� ikke lov
				{
					while(n > i) {
					
						svardb = multidb * (i + 1);
						multidb = svardb;
						i++;
					}
				
				showMessageDialog(null, n + "!  = " + svardb);
				innput = true;
				}
			else if(n>=0 && innput == false) { //normal funksjon, !0 til og med !20
				while(n > i)
					{
						svar = multiply * (i + 1);
						multiply = svar;
						i++;
					}
				showMessageDialog(null,"!" + n + "  = " + svar);
				innput = true;
			}
			else // Ved negative tall, feil melding
			{
				if(innput == false)
				showMessageDialog(null,"Feil innput, unng� negative tall.");
			}
			
		}
		}

	
}



