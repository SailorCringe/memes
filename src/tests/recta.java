package tests;

import java.util.Scanner;

public class recta {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		short n = sc.nextShort();
		StringBuilder sb = new StringBuilder();
		
		while(n != 0) {
			
			if(n%2 == 0) sb.append("DERECHA\n");
			else sb.append("IZQUIERDA\n");
			n = sc.nextShort();
		}
		
		System.out.print(sb);
	}
}
