package tests;

import java.util.Scanner;

public class teast12312 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt(), d=sc.nextInt();
			while(n > d) {
				long r=0, num=n, den=d;

				for(int q = n-1; q > 0; q--) {
					num = num * q;
				}
				for(int x = d-1; x > 0; x--) {
					den = den * x;
				}
				r = num/den;
				System.out.println(r);
				n = sc.nextInt(); d = sc.nextInt();
			}
			sc.close();
		}
	}

