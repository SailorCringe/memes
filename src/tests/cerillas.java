package tests;

import java.util.Scanner;

public class cerillas {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int nTest = sc.nextInt(), n1, n2;
		
		for(int i = 0; i< nTest; i++) {
			n1 =  sc.nextInt(); n2 = sc.nextInt();
			System.out.println(n1*(n2+1)+n2*(n1+1));

		}
	}
}
