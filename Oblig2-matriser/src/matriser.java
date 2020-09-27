
public class matriser {

	public static void main(String[] args) {
		int[][] matrise1 = {
		         { 1, 2, 3 },
		         { 4, 5, 6 },
		         { 7, 8, 9 }
		      };
		//skrivUtv1(matrise1);
		String a = tilStreng(matrise1);
		System.out.println(a);
		int[][] skaler = skaler(5,matrise1);
		skrivUtv1(skaler);
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
		
		for (int i = 0; i < matrise.length -1; i++) { 
	         for (int j = 0; j < matrise[i].length - 1; j++) { 
	        	 
	        	skalert[i*tall][j*tall] = matrise[i][j];
	         }
		}
		return skalert;
	}
	
	
}
