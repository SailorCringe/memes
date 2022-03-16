package tests;

import java.util.Scanner;

public class findemes {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int test = sc.nextInt();
			short n, n1;
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < test; i++) {
				
				n = sc.nextShort(); n1 = sc.nextShort();
				if(n + n1 >= 0) sb.append("SI\n");
				else sb.append("NO\n");
			}
			
			System.out.print(sb);
	}
}
