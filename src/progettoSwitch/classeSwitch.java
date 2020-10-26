package progettoSwitch;

import java.util.Scanner;

	public class classeSwitch {
		/*
		 * metodo che riempe la matrice
		 */
	public static void carVistMat (int[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=(int)(Math.random()*50);
			}
		}
	}
/*
 * metodo che stampa la matrice
 */
	public static void stampa(int[][] a) {
		for(int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println("");
		}
	}
	/*
	 * metodo che calcola il minimo e il massimo 
	 */
	public static void calcMinMax(int[][] a, int[][] b) {
		Scanner inPut=new Scanner(System.in);
		int c=0,d=0,min=0,min2,max=0,max2=0;
		System.out.println("in questo metodo ti calcolerò il minimo e il massimo");
		System.out.println(" tra due righe della prima e della seconda matrice");

		
		 do {
			 System.out.println("inserisci una righa della prima matrice compresa tra 0 e "+(a.length-1));
			 c=inPut.nextInt();
			 System.out.println("inserici una riga della seconda matrice compresa tra 0 e "+(b.length-1));
			 d=inPut.nextInt();
			 
			 if(c<0||c>a.length-1||d<0||d>b.length-1) {
				 System.err.println("devi inserire un numero compreso tra 0 e la lunghezza delle matrici");
			 }
			 
		 }while(c<0||c>a.length-1||d<0||d>b.length-1);
		 
		 max=a[c][0];
		 min=a[c][0];
		 for (int i=0;i<a[c].length;i++) { 
			if(max<a[c][i]) {
				max=a[c][i];
			}
			if(min>a[c][i]) {
				min=a[c][i];
			}
		 }
		 max2=b[d][0]; 
		 min2=b[d][0];
			 for(int i=0;i<b[d].length;i++) {
				 if (max2<b[d][i]) {
					 max2=b[d][i];
				 }
				 if(min2> b[d][i]) {
						min2=b[d][i];
					}
			 }
			 
		if(max>max2) {
			System.out.println("il numero maggiore delle matrici alle corrispondenti righe è "+max+" e si trova nella prima matrice ");
			}
		if(max<max2) {
			System.out.println("il numero maggiore delle matrici alle corrispondenti righe è "+max2+" e si trova nella seconda matrice ");
			}
		if(min<min2) {
			System.out.println("il numero minore delle matrici alle corrispondenti righe è "+min+" e si trova nella prima matrice ");
			}
		if(min>min2) {
			System.out.println("il numero minore delle matrici alle corrispondenti righe è "+min2+" e si trova nella seconda matrice ");
			}
	}
	/*
	 * questo è il metodo che calcola la media
	 */
	public static void mediaRigCol(int[][]a ,int[][]b ) {
		Scanner inPut=new Scanner(System.in);
		 int c=0,d=0;
		 float media=0,somma;
		 
		 System.out.println("in questo metodo ti calcolerò la media ");
		 System.out.println("di due righe, una della prima matrice una della seconda");
			
			
		do {
			System.out.println("inserisci una righa della prima matrice compresa tra 0 e "+(a.length-1));
			c=inPut.nextInt();
			System.out.println("inserici una riga della seconda matrice compresa tra 0 e "+(b.length-1));
			d=inPut.nextInt();
				 
		   if(c<0||c>a.length-1||d<0||d>b.length-1) {
				System.err.println("devi inserire un numero compreso tra 0 e la lunghezza delle matrici");
			}
				 
		}while(c<0||c>a.length-1||d<0||d>b.length-1);
		
		somma=a[c][0];
		for (int i=0;i<a[c].length;i++) {
			somma=somma+a[c][i];
		}
		media=somma/a[c].length;
		System.out.println("la media della righa della prima matrice è "+media);
		somma=b[d][0];
		for (int i=0;i<b[d].length;i++) {
			somma=somma+b[d][i];
		}
		media=somma/b[d].length;
		System.out.println("la media della righa della seconda matrice è "+media);
	}
	
	/*
	 * metodo delle diagonali
	 */
	public static void occDiag(int [][]a, int [][]b) {
		int[]c =new int[a.length];
		int[]d= new int[b.length];
		System.out.println("");
		System.out.println("confronto delle diagonali maggiori");
		System.out.println("");
		for(int i=0;i<a.length;i++) {
			c[i]=a[i][i];
			
		}
		for(int i=0;i<b.length;i++) {
			d[i]=b[i][i];
		 }
		if (a.length>b.length) {
			for(int i=0;i<b.length;i++) {
				if (c[i]==d[i]) {
					System.out.println("le diagonali sono uguali con il numero "+c[i]+" alla posizione "+i+1);
				}else {
					System.out.println("non ci sono numeri ugali nella posizione ");
				}
		}
		}else if(a.length<b.length){
			for(int i=0;i<a.length;i++) {
				if (d[i]==c[i]) {
					System.out.println("le diagonali sono uguali con il numero "+c[i]+" alla posizione "+i+1);
				}else {
					System.out.println("non ci sono numeri ugali nella posizione ");
				}
			}
		}
		for(int i=a.length;i<=0;i--) {
				c[i]=a[i][i];
			}
		for(int i=b.length;i<=0;i--) {
			d[i]=b[i][i];
		}
		System.out.println("");
		System.out.println("confronto delle diagonali minori");
		System.out.println("");
		if (a.length>b.length) {
			for(int i=0;i<a.length-1;i++) {
				if (c[i]==d[i]) {
					System.out.println("le diagonali minori sono uguali con il numero "+c[i]+" alla posizione "+i+1);
				}else {
					System.out.println("non ci sono numeri ugali nella posizione ");
				}
			}
			
			
		}else if(a.length<b.length){
			for(int i=0;i<b.length-1;i++) {
				if (d[i]==c[i]) {
					System.out.println("le diagonali minori sono uguali con il numero "+c[i]+" alla posizione "+i+1);
				}else {
					System.out.println("non ci sono numeri ugali nella posizione ");
				}
			}
		}
		
	}
/*
 * metodo che 
 */
	/**********************************************************************
	 *  questo è il main del programma
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Scanner inPut=new Scanner(System.in);
		int[][] matrix,matrix2;
		int righe=0,righe1=0;
		int richiesta=0;
		System.out.println("le matrici devono avere una dimensione compresa tra 4 e 8");
		do {
			System.out.println("inserisci le righe della prima matrice");
			righe=inPut.nextInt();
			System.out.println("inserisci le righe della secona matrice");
			righe1=inPut.nextInt();
			if(righe<4 ||righe>8 ||righe1<4 ||righe1>8) {
				System.err.println("i lati delle matrici devono essere compresi tra 4 e 8");
			}
			
		}while(righe<4 ||righe>8 ||righe1<4 ||righe1>8);
		
		matrix=new int[righe][righe];
		matrix2=new int[righe1][righe1];
		carVistMat(matrix);
		carVistMat(matrix2);
		System.out.println("la prima matrice è");
		stampa(matrix);
		System.out.println("le seconda matrice è");
		stampa(matrix2);
		do {
			System.out.println("*************************************************************************************************");
			System.out.println("");
			System.out.println("che metodo vuoi usare, inserisci un numero tra 2 e 6 ");
			System.out.println(" per invece finire il programma inserire 1");
			System.out.println("");
			System.out.println("2 :calcMinMax richiede le righe e ti restituisce il minimo e il  massimo tra le matrici ");
			System.out.println("   alla riga selezionate alla riga selezionate il  massimo tra le matrici alla riga selezionate");
			System.out.println("");
			System.out.println("3 :mediaRigCol richiede la riga della matrice e fa la media");
			System.out.println("");
			System.out.println("4 :occDiag confronta le diagonali delle matrici e visualizza le occorenze");
			System.out.println("*************************************************************************************************");

			richiesta=inPut.nextInt();
			
			switch(richiesta) {
			
			case 1:
				
			break;
			
			
			case 2:
				calcMinMax(matrix,matrix2);
			break;
			
			case 3:
				mediaRigCol(matrix,matrix2);
			break;
			
			case 4:
				occDiag(matrix,matrix2);
			break;
//			
//			case 5:
//				parDispDiag(matrix,matrix2);
//			break;
//			
//			case 6:
//				calcMinMax(matrix,matrix2);
//			break;
//			
//			case 7:
//				mediaRigaCol(matrix,matrix2);
//			break;
//			
//			case 8:
//				occDiag(matrix,matrix2);
//			break;
//			
//			case 9:
//				parDispDiag(matrix,matrix2);
//			break;
//		 
			default:
				System.err.println("devi scrivere un numero minore di 9 ");
			}
		}while(richiesta!=1);
		System.out.println("grazie della sua partecipazione alla funzione del mio programma");
	}

}
