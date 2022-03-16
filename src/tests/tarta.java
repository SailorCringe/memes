package tests;

import java.util.Random;
import java.util.Scanner;

public class tarta {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int n = sc.nextInt(),ra,r2=0;
		boolean found;
		while(n!=0) {
			found = false;
			while(!found && n > 0) {
				ra= r.nextInt(n)+1;
				r2 = r2 * 10 + ra % 10;
				n = n-ra + r2;
				r2 = r2/10;
				if(n==0) found = true;
				
			}
			if(found) System.out.println("SI");
			else System.out.println("NO");
			n = sc.nextInt();
		}
	}
}
