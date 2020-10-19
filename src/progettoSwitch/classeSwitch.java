package progettoSwitch;

import java.util.Scanner;

	public class classeSwitch {
	public static void carVistMat (int[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=(int)(Math.random()*50);
			}
		}
	}

	public static void stampa(int[][] a) {
		for(int i=0;i<a.length;i++) {
			
		}
	}
	public static void calcMinMax(int[][] a, int[][] b) {
		Scanner inPut=new Scanner(System.in);
		int c=0,d=0,min=0,min2,max=0,max2=0;
		System.out.println("in questo metodo ti calcolerò il minimo e il massimo");
		System.out.println(" tra due righe della prima e della seconda matrice");
		System.out.println("le matrici devono avere una dimensione compresa tra 4 e 8");
		
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
		 for (int i=0;i<a[c].length-1;i++) { 
			if(max<a[c][i]) {
				max=a[c][i];
			}
			if(min>a[c][i]) {
				min=a[c][i];
			}
		 }
		 max2=b[d][0]; 
		 min2=b[d][0];
			 for(int i=0;i<b[d].length-1;i++) {
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
	
	
	
	public static void main(String[] args) {
		
		Scanner inPut=new Scanner(System.in);
		int[][] matrix,matrix2;
		int righe=0,righe1=0;
		int richiesta=0;
		
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
		do {
			System.out.println("");
			System.out.println("che metodo vuoi usare, inserisci un numero tra 2 e 9, per invece finire il programma inserire 1 ");
			richiesta=inPut.nextInt();
			switch(richiesta) {
			
			case 1:
				
			break;
			
			
			case 2:
				calcMinMax(matrix,matrix2);
			break;
			
//			case 3:
//				mediaRigCol(matrix,matrix2);
//			break;
//			
//			case 4:
//				occDiag(matrix,matrix2);
//			break;
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
				System.err.println("devi scrivere un numero minore di 6 boccammt");
			}
		}while(richiesta!=1);
		System.out.println("grazie della sua partecipazione alla funzione del mio programma");
	}

}
