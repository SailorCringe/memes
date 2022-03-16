package tests;

import java.util.Scanner;

public class gorrocolores {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		short r;
		
		for(int i = 0; i < n; i++) {
			
			 
			char[] a = sc.next().toCharArray();
			r = (short) a.length;
			for(short j = 0; j < a.length-1; j+=2) {
				
				if(a[j] != a[j+1]) r--; 
			}
			sb.append(r+"\n");
		}
		System.out.print(sb);
	}
}
