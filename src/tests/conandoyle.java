package tests;

import java.util.Scanner;


public class conandoyle {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		short year, n, obra, count, min;
		StringBuilder sb = new StringBuilder();
		String s=null;
		while(sc.hasNext()) {
			
			min = Short.MAX_VALUE;
			year = sc.nextShort();
			sc.nextLine();
			n = sc.nextShort();
			count = 0;
			
			for(short i = 0; i < n; i++) {
				
				obra = sc.nextShort();
				if(obra >= year) {
					count++;
					if(min > obra) {
						min = obra;
						s = sc.nextLine();
					}
					else sc.nextLine();
				}
				else {
					sc.nextLine();
				}
			}
			if(count == n) sb.append("TODAS");
			else if (count == 0) sb.append("NINGUNA");
			else {
				sb.append(s);
				if(sb.charAt(0) == ' ')	sb.deleteCharAt(0);	
			}
			System.out.println(sb);
			sb = new StringBuilder();
		}	
	}
}
