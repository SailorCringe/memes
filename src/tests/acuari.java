package tests;

import java.util.Scanner;

public class acuari {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nTest = sc.nextInt();

		
		for(int i = 0; i < nTest; i++) {
			
			int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt(), r=0;
			
			for(int j = 0; j < n1; j++) {
				
				r+= n2;
				n2-= n3;
			}
			System.out.println(r);
		}
	}
}
