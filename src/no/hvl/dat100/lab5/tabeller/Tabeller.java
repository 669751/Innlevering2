package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int nummer: tabell)
			System.out.print(nummer);

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String tallStreng = "[";
		for(int q = 0; q<tabell.length; q++) {
			if(q<tabell.length-1) {
				tallStreng += tabell[q]+ ",";	
			}else {
			tallStreng += tabell[q];
			}
		}
		tallStreng += "]";
		
		return tallStreng;
	}

	// c)
	public static int summer(int[] tabell) {
		
//		int Sum = 0; 
//		for(int w=0; w<tabell.length; w++) {
//			Sum += tabell[w];
//		}
//		return Sum;

		
//		int e = 0;
//		int Sum = 0;
//		while(e<tabell.length){
//			Sum += tabell[e];
//			e++;
//		}
//		return Sum;
		
		int Sum = 0;
		for (int r: tabell) {
			Sum += r;
		}
		return Sum;
	}
	

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean finnes = false;
		for(int t = 0; t<tabell.length; t++) {
			if(!finnes && tall==tabell[t]) {
				finnes = true;
			}
		}
		return finnes;
		
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int pos = -1;
//		for(int y=0; y<tabell.length; y++) {
//			if(tall==tabell[y]) {
//				pos = y;
//			}
//		}
		int y=0;
		while(y<tabell.length && pos== -1) {
			if (tall==tabell[y]) {
			pos = y;
			}
			y++;
		}
		return pos;
		
		
	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		int[] reversTab = new int[tabell.length];

        int reversPos = tabell.length;

        for(int i=0; i<tabell.length; i++) {

            reversTab[reversPos-1] = tabell[i];

            reversPos--;}
        return reversTab;
		
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
			int j = 1;
			boolean sortert = true;
			
			while (sortert && j < tabell.length - 1) {
				if (tabell[j] > tabell[j + 1]) {
						sortert = false;
				}
				j++;
			}
		return sortert;		
	}
	
	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int sumlg = tabell1.length + tabell2.length;
		int[] tabell = new int[sumlg];
			
			for (int f=0; f<tabell1.length; f++) {
				tabell[f]= tabell1[f];
			}
			
			for(int g= 0; g<tabell2.length; g++) {
				tabell[tabell1.length + g] = tabell2[g];
			}
		return tabell;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
