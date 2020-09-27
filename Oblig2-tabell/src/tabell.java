public class tabell {

	public static void main(String[] args) {
		int[] tabell = new int[] {42,67,89};
		int[] tabell2 = new int [] {1,2,3}; 
/*		
 *		Brukt til å teste metodene: 
 * 
		skrivUt(tabell);         						//1
		String text = tilStreng(tabell);				//2
		System.out.println(text);						//2
		int sum = summer(tabell);						//3
		System.out.println(sum);						//3
		int tall = 89;									//4 og utover
		boolean finnes = finnesTall(tabell,tall);		//4
		System.out.println(finnes);						//4
	    int posisjon = posisjonTall(tabell,tall);		//5
		System.out.println("tallet er i posisjon: " + posisjon + " i tabellen (-1 = finnes ikke)");     //5
		int[] revers = reverser(tabell);				//6
		skrivUt(revers);								//6
		boolean sortert = erSortert(tabell);			//7
		System.out.println(sortert);					//7  */
		int[] sammen = settSammen(tabell,tabell2);		//8
		skrivUt(sammen);								//8
		
	}
	public static void skrivUt (int[] tabell)
	{
		for(int i = 0; i<=tabell.length -1; i++)
			System.out.println(tabell[i]);
	}
	public static String tilStreng (int[] tabell)
	{
		String a = ("[");
		
		for(int i = 0; i<=tabell.length - 1; i++) {
		a += String.valueOf(tabell[i]);
		if (i < tabell.length - 1) {
		a += (", ");
		}

		}
		a +=("]");
		return a;
	}
	public static int summer (int[] tabell) 
	{
		int a = 0;
		//1 FOR-LØKKE
		
//		for(int i = 0; i<=tabell.length - 1; i++) {
//			a += (tabell[i]);
			
		//2 WHILE-LØKKE
//		int i = 0;
//		while(i<=tabell.length - 1) {
//			a += (tabell[i]);
//			i++;
//		}
			
			
		//3 UTVIDET FOR-LØKKE
		for(int i : tabell) {
		a += i;

		}
		return a;
	
	}
	public static boolean finnesTall (int[] tabell, int tall)
	{
	boolean a = false;
	for(int i : tabell) {
		
		if (i == tall) {
			a = true;
			return a;
			}
		}
		
	return a;
	}
	public static int posisjonTall (int[] tabell, int tall)
	{
		int a = -1;
		
		for(int i = 0; i <= tabell.length - 1; i++) {
			
			if (tall == tabell[i])
				return i;
		}
		return a;
	}
	public static int[] reverser(int[] tabell) 
	{
		int[] revers = new int[tabell.length];
		int l = tabell.length;
        for (int i = 0; i <= tabell.length -1; i++) { 
            revers[l-1] = tabell[i];
            l = l-1;
	}
	return revers;
	}
	public static boolean erSortert (int[] tabell)
	{
		boolean sort = true;
		int a = tabell[0] - 1;
		for (int i : tabell) { 
			if (i < a) {
            	sort = false;
            	return sort;
			}
            	else {
            	a = i;
            	}
            }
		
		return sort;
	}
	public static int[] settSammen(int[] tabell1,int[] tabell2) {
		int l1 = tabell1.length;
		int l2 = tabell2.length;
		int[] sammen = new int[l1+l2];
		
		for (int i = 0; i <= l1 -1; i++) {
			sammen[i] = tabell1[i];
		}
		for (int i = 0; i <= l2 -1; i++) {
			sammen[i+l1] = tabell2[i];
		}
		
		return sammen;

	}
}
