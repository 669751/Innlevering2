package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int [] q: matrise) {
			for(int w: q){
		System.out.println(w);
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String tilstreng = "";
		
		for (int e= 0; e<matrise.length; e++){
			for (int r = 0; r<matrise[e].length; r++) {
				tilstreng += matrise[e][r] + " " ;
			}
			tilstreng += "\n";	
			}
		
	return tilstreng;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int row = matrise.length;
		int col = matrise[0].length;
		int [][] skalert = new int[row][col];
		
		for (int r= 0; r<matrise.length; r++){
			for (int t = 0; t<matrise[r].length; t++) {
					skalert[r][t] = matrise[r][t] * tall;
			}
		}
		return skalert;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
	
		for (int r= 0; r<a.length; r++){
			for (int t = 0; t<a[r].length; t++) {
				if (a[r][t] != b[r][t]) {
				return false;
				}
			}
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		
		int row = matrise.length;
		int col = matrise [0].length;
		int[][] Speil = new int [row][col];
		
		for (int q=0; q<Speil.length; q++) {
			for (int w=0; w<Speil[q].length;w++) {
				Speil[q][w] = matrise[w][q];
				
			}
		}
	return Speil;
		
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int rowa = a.length;
		int colb = b[0].length;
		
		int[][] c = new int[rowa][colb];
		
		if (a.length!= b[0].length){
			throw new IllegalArgumentException("Error");
		}
		for(int q=0; q<a.length; q++) {
			for(int w=0; w<a[0].length; w++) {
	
				int Sum = 0;
				for(int e=0; e<a[0].length; e++) {
						Sum += a[q][e]*b[e][w];
						
					}
				c[q][w]= Sum;
			}
		}
		return c;
	}
}
		



















