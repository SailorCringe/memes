package tests;

import java.util.Arrays;
import java.util.Scanner;

public class comptev2 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder s = new StringBuilder();
		short nTest = sc.nextShort();
		short min1 , min2;
		short[] shop1, shop2;
		int count;
		while (nTest != 0) {
			
			min1 = sc.nextShort(); min2 = sc.nextShort();
			shop1 = new short[nTest];
			shop2 = new short[nTest];
			
			count = 0;
			
			for(short i = 0; i < nTest; i++) {
				
				shop1[i] = sc.nextShort();
			}
			for(short j = 0; j < nTest; j++) {
							
				shop2[j] = sc.nextShort();
			}
			
			count = 0;
			for(short i = 0; i < min1; i++) {
				
				if(Math.abs(shop1[i] - shop2[i]) >= Math.abs(shop1[i+1] - shop2[i+1])) count+=shop1[i];
			}
			
			for(short i = min1; i < nTest; i--) {
				
				if(Math.abs(shop1[i] - shop2[i]) >= Math.abs(shop1[i-1] - shop2[i-1])) count+=shop2[i];
			}
			
			System.out.println(count);
		
		}
		
		
		
		
		
}
}
