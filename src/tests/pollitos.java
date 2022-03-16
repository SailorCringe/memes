package tests;

import java.util.Scanner;

public class pollitos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int tests = sc.nextInt(), n, vuelta, count, n2, sum;
		short f, c, a, b;
		char ch;
		int[][] m;
		StringBuilder s = new StringBuilder();
		
		for(int i = 0; i < tests; i++) {
			
			f = sc.nextShort(); c = sc.nextShort(); n = sc.nextInt();
			m = new int[f+1][c+1];
			
			/*for(int j = 0; j < f; j++) {
				
				for(int h = 0; h < c; h++) {
					
					m[j][c] = 0;
				}
			}*/
			for(int l = 0; l < n; l++) {
				a = (short) (sc.nextShort()-1); b = (short) (sc.nextShort()-1);
				m[a][b]++;
				
				ch = sc.next().charAt(0);
				n2 = sc.nextInt();
				count = 1; vuelta = 1; sum = 0;
				for(int k = n2; k >= 0; k--) {
					
					
					switch(ch) {
					
					case 'E': if(vuelta + b > c) vuelta = c - b; m[a][b+=vuelta]++; if(count%2==0 || count == 1)ch ='S'; break;
					case 'N': if(vuelta - a <= 1) vuelta = 0; m[a-=vuelta][b]++; if(count%2==0 || count == 1)ch ='E'; break; 
					case 'S': if(vuelta + a > f) vuelta = f - b; m[a+=vuelta][b]++; if(count%2==0 || count == 1)ch ='O'; break; 
					case 'O': if(vuelta - b <= 1) vuelta = 0; m[a][b-=vuelta]++; if(count%2==0 || count == 1)ch ='N'; break;
					}
					count++;
					
					
					
					
					
				}
			}
			for(int j = 0; j < f; j++) {
				
				for(int h = 0; h < c; h++) {
					
					s.append(m[j][h]+" ");
				}
				s.deleteCharAt(s.length()-1);
				s.append("\n");	
				
			}
			s.append("---\n");
		}		
		System.out.print(s);
	}
}
