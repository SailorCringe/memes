package tests;

import java.util.Scanner;

public class abadias {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt(), actual, big;
			
			while(n != 0) {
				
				int[] m = new int[n];
				for(int i = 0; i < n; i++) {
					
					m[i] = sc.nextInt();
				}
				
				int count = 1; big = m[n-1];
				
				for(int j = m.length-2; j >= 0; j--) {
					
					actual = m[j];
					
					if(actual > big) {
						
						count++;
						big = actual;
					}
				}
				System.out.println(count);
				n = sc.nextInt();
			}	
	}
}
