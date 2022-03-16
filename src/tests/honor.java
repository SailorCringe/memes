package tests;

import java.util.Scanner;

public class honor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int tests = sc.nextInt(), points;
		sc.nextLine();
		StringBuilder sb = new StringBuilder();
		char[] a;
		int[] pals;
		char b;
		
		for(int i = 0; i < tests; i++) {
			
			a = sc.nextLine().toCharArray();
			points = 0;
			pals = new int[4];

			for(int k = 0; k < a.length; k+=4) {
				
				if(a[k] == '1') k++;
				b = a[k+2];
				
				switch(a[k]) {
					
				case 'Q': points +=2; break; case 'A': points += 4; break; case 'K': points += 3; break; case 'J': points += 1; break; default: break;
				
				}
				switch(b) {
				
				case 'C': pals[0]++; break; case 'T': pals[1]++; break; case 'D': pals[2]++; break; case 'P': pals[3]++; break;
				}
				
			}
			for(int j = 0; j < 4; j++) {
				
				if(pals[j] == 2) points += 1;
				else if( pals[j] == 1) points += 2;
				else if(pals [j] == 0) points += 3;
			}
			sb.append(points+"\n");
		}
		System.out.print(sb);
	}
}
