package tests;

import java.util.Scanner;

public class sumaD {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = Integer.parseInt(s), m, aux;
		long r;
		while(n != 0) {
			r=n; m=10;
			for(int i = 0; i < s.length()-1; i++) {
				
				aux = n%m;
				r = n%m+r;
				m = m*10;
			}
		System.out.println(r);
		s=sc.next();
		n = Integer.parseInt(s); 
		

		}
	}
}
