package tests;

import java.util.Scanner;

public class buscaminas {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			short f = sc.nextShort(), c = sc.nextShort();
			int nC = f*c;
			char[][] camp = new char[f][c];
			
			for(short j = (short) (f-1); j > 0; j--) {
				
				for(short k = 0; k < c; k++) {
					
					camp[j][k]= sc.next().charAt(k);
				}
				
			
			}
			short x, y;
			int tests = sc.nextInt();
			
			for(int i = 0; i < tests; i++) {
				
				x = sc.nextShort(); y = sc.nextShort();
				
				if(x > 1 && y > 1) {
					
					
				}
			}
			
			
	}

}
