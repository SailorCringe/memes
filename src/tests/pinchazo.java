package tests;

import java.util.Scanner;

public class pinchazo {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int nTests = sc.nextInt(), n1, n2, r;
		
		for(int i = 0; i < nTests; i++) {
			n1 = sc.nextInt(); n2 = sc.nextInt();
			r = n1+180;
			if(r>359) r -= 360;
			if(n2 - r == 0 || n1 == n2) System.out.println("DA IGUAL");
			else if(n1 == 0) {
				if(n2 < 180) System.out.println("ASCENDENTE");
				else if(n2>180) System.out.println("DESCENDENTE");
			}
			else if(n1-n2 < 0){
				if(n1-n2 <-180) System.out.println("DESCENDENTE");
				else System.out.println("ASCENDENTE");
				
			}
			else if(n1-n2 > 0) {
				if(n1-n2 > 180) System.out.println("ASCENDENTE");
				else System.out.println("DESCENDENTE");
			}
				
		}
	}
}
