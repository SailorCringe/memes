package tests;

import java.util.Scanner;

public class triangles {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nTest = sc.nextInt(), c1, c2 ,c3, h=1;
		int c;
		
		for(int i = 0; i < nTest; i++) {
			
			c1 = sc.nextInt(); c2 = sc.nextInt(); c3 = sc.nextInt();
			if(c1 >= c2 && c1 >= c3) {h = c1; c1 = c2; c2=c3;}
			else if(c2 >= c1 && c2 >= c3) {h = c2; c2 = c3;}
			else if(c3 >= c1 && c3 >= c2) h= c3;
			c = c1*c1+c2*c2-h*h;
			
			if (c1 + c2 < h+1)  System.out.println("IMPOSIBLE");
			else if(c == 0) System.out.println("RECTANGULO");
			else if(c > 0) System.out.println("ACUTANGULO");
			else if(c < 0) System.out.println("OBTUSANGULO");
								
		}	
	}
}
