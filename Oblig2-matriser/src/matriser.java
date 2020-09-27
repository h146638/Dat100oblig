
public class matriser {

	public static void main(String[] args) {
		int[][] matrise1 = {
		         { 1, 2, 3 },
		         { 4, 5, 6 },
		         { 7, 8, 9 }
		      };
		int[][] matrise2 = {
		         { 1, 2, 3 },
		         { 4, 5, 6 },
		         { 7, 8, 9 }
		      };
		skrivUtv1(matrise1);
		//String a = tilStreng(matrise1);
		//System.out.println(a);
		//a = tilStreng(skaler(5,matrise1));
		//System.out.println(a);
		boolean b = erLik(matrise1,matrise2);
		System.out.println(b);
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
