
public class matriser {

	public static void main(String[] args) {
		int[][] matrise1 = {
		         { 1, 2, 3 },
		         { 4, 5, 6 },
		         { 7, 8, 9 }
		      };
		int[][] matrise2 = {
		         { 5, 10, 15 },
		         { 20, 25, 30 },
		         { 35, 40, 45 }
		      };
		//tester metodene:
		
		skrivUtv1(matrise1);							//Skriver bare ut
		String a = tilStreng(matrise1);					//lagrer som String
		System.out.println(a);							//skriver ut string
		a = tilStreng(skaler(5,matrise1));				//Denne skalerer matrise1 med 5 i dette tilfellet!
		System.out.println(a);							//
		boolean lik = erLik(matrise1,matrise2);
		System.out.println(lik);
	}
	
	
	public static void skrivUtv1(int[][] matrise)
	{
		for (int i = 0; i < matrise.length; i++) { 
	         for (int j = 0; j < matrise[i].length; j++) { 
	            System.out.print(matrise[i][j] + " ");
	         }
	         System.out.println();
	      }	
	}
	public static String tilStreng(int[][] matrise)
	{
		String streng = "";
		
		for (int i = 0; i < matrise.length; i++) { 
	         for (int j = 0; j < matrise[i].length; j++) { 
	        	 
	            streng +=(matrise[i][j] + " ");
	         }
	         streng += ("\n");
		
		
		}
		return streng;
		}
	public static int[][] skaler(int tall, int[][] matrise)
	{
		
		int[][] skalert = matrise;
		
		for (int i = 0; i < matrise.length; i++) { 
	         for (int j = 0; j < matrise[i].length; j++) {  
	        	 
	        	skalert[i][j] = tall*matrise[i][j];
	         }
		}
		return skalert;
	}
	public static boolean erLik(int[][] mat1, int[][] mat2)
	{
		boolean b = true;
		for (int i = 0; i < mat1.length; i++) { 
	         for (int j = 0; j < mat1[i].length; j++) {
	        	 
	        	 if (mat1[i][j] != mat2[i][j]) {
	        		 b = false;
	        		 return b;
	        	 }
	         }
		}
		
		return b;
	}
	
}
