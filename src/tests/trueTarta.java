package tests;

import java.util.Scanner;

public class trueTarta {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		int nTest=sc.nextInt(), n1, n2 , n3, r, resultat;
		
		for(int i = 0; i < nTest; i++) {
			
			n1 = sc.nextInt(); n2 = sc.nextInt(); n3 = sc.nextInt();
			r = n1*n2;
			if(r == n3) resultat = 1;
			else if(n3/r < 1) {
				if(n3%r == 0) resultat = n3/r;
				else resultat = n3/r+1;
			}
			else if(n3/r >=1 && n3/r <2) resultat = n3/r+1;
			else {
				if(n3%r != 0)
					resultat = n3/r+1;
				else resultat = n3/r;
			}
			System.out.println(resultat);
		}
		
	}
}
