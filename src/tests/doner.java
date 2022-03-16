package tests;

import java.util.Scanner;

public class doner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int nTest = sc.nextInt();
		int n1, n2;
		
		for(int i = 0; i < nTest; i++) {
			n1 = sc.nextInt(); n2 = sc.nextInt();
			System.out.println((int)(100*n1/(n1+n2)));
			
		}
		
	}
}
